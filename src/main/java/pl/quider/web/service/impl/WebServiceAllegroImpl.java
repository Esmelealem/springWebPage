package pl.quider.web.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.quider.web.allegro.*;
import pl.quider.web.exception.AllegroException;
import pl.quider.web.exception.LoginException;
import pl.quider.web.exception.NotLoggedException;
import pl.quider.web.service.ifc.WebServiceAllegro;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WebServiceAllegroImpl implements WebServiceAllegro {

    @Value("${allegro.login}")
    private String USERNAME;
    @Value("${allegro.password}")
    private String PASSWORD;
    @Value("${allegro.apikey}")
    private String WEBAPIKEY;

    private String sessionKey = null;
    private String statusDescription;
    private WebServiceAllegro.AllegroStatus allegroStatus;
    private long serverTime;
    private ServicePort servicePort;
    private long expirationTime;

    @Override
    public String getSessionKey() throws NotLoggedException {
        try {
            if (doLogin()) {
                return this.sessionKey;
            }
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
        return null;
    }

    @Override
    public boolean doLogin() throws LoginException {
        if (this.isExpired()) {
            try {
                ServiceService service = new ServiceService();
                servicePort = service.getServicePort();
                DoGetCountriesRequest doGetCountriesRequest = new DoGetCountriesRequest();
                doGetCountriesRequest.setWebapiKey(WEBAPIKEY);
                doGetCountriesRequest.setCountryCode(1);
                servicePort.doGetCountries(doGetCountriesRequest);
                DoQuerySysStatusRequest queryStatus = new DoQuerySysStatusRequest();
                queryStatus.setWebapiKey(WEBAPIKEY);
                queryStatus.setCountryId(1);
                queryStatus.setSysvar(1);
                DoQuerySysStatusResponse doQuerySysStatus = servicePort.doQuerySysStatus(queryStatus);
                DoLoginRequest loginRequest = new DoLoginRequest();
                loginRequest.setUserLogin(USERNAME);
                loginRequest.setUserPassword(PASSWORD);
                loginRequest.setCountryCode(1);
                loginRequest.setWebapiKey(WEBAPIKEY);
                loginRequest.setLocalVersion(doQuerySysStatus.getVerKey());
                DoLoginResponse loginResponse = servicePort.doLogin(loginRequest);
                this.sessionKey = loginResponse.getSessionHandlePart();
                long userId = loginResponse.getUserId();
                if (userId > 0) {
                    this.statusDescription = "Zalogowany do Allegro";
                    this.allegroStatus = WebServiceAllegro.AllegroStatus.OK;
                    serverTime = loginResponse.getServerTime();
                    this.expirationTime = serverTime + 3600;
//                    this.saveSession(serverTime, expirationTime, userId);
                    return true;
                }
                this.statusDescription = "Błąd logowania do Allegro!";
                this.allegroStatus = AllegroStatus.ERROR;
                throw new LoginException("Błąd logowania do allegro");
            } catch (Exception e) {
                this.allegroStatus = AllegroStatus.SYSTEM_ERROR;
                throw new LoginException(e);
            }

        } else {
            return true;
        }
    }

    @Override
    public UserDataStruct getUser() throws NotLoggedException {
        try {
            doLogin();
            DoGetMyDataRequest doGetMyDataRequest = new DoGetMyDataRequest();
            doGetMyDataRequest.setSessionHandle(getSessionKey());
            DoGetMyDataResponse response = servicePort.doGetMyData(doGetMyDataRequest);
            return response.getUserData();

        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }

    }

    //    @Async
    private void saveSession(long serverTime2, long expirationTime2, long userId) {
        throw new NotImplementedException();
    }

    protected boolean isExpired() {
        if ((expirationTime - (new Date().getTime() / 1000)) < 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getStatusDescription() throws NotLoggedException {
        try {
            doLogin();
            return this.statusDescription;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public AllegroStatus getStatus() throws NotLoggedException {
        try {
            doLogin();
            return this.allegroStatus;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public boolean isAllegroAccount() {
//        return this.allegroRepository.isAllegroAccount();
        throw new NotImplementedException();
    }

    @Override
    public int getCountFavCategories() throws NotLoggedException, AllegroException {

        try {
            doLogin();
            DoGetFavouriteCategoriesRequest categoriesRequest = new DoGetFavouriteCategoriesRequest();
            categoriesRequest.setSessionHandle(this.sessionKey);
            DoGetFavouriteCategoriesResponse response = this.servicePort.doGetFavouriteCategories(categoriesRequest);
            ArrayOfFavouritescategoriesstruct categoriesList = response.getSFavouriteCategoriesList();
            return categoriesList.getItem().size();
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }

    @Override
    public int getCountMySellItems() throws NotLoggedException, AllegroException {

        try {
            doLogin();
            DoGetMySellItemsRequest request = new DoGetMySellItemsRequest();
            request.setSessionId(sessionKey);
            DoGetMySellItemsResponse response = this.servicePort.doGetMySellItems(request);
            int sellItemsCounter = response.getSellItemsCounter();
            return sellItemsCounter;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }

    @Override
    public int getCountWaitingComments() throws NotLoggedException, AllegroException {
        try {
            doLogin();
            DoGetWaitingFeedbacksCountRequest request = new DoGetWaitingFeedbacksCountRequest();
            request.setSessionHandle(sessionKey);
            DoGetWaitingFeedbacksCountResponse response = this.servicePort.doGetWaitingFeedbacksCount(request);
            return response.getFeedbackCount();
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }


    @Override
    public int getCountFutureItems() throws NotLoggedException, AllegroException {
        try {
            doLogin();
            DoGetMyFutureItemsRequest request = new DoGetMyFutureItemsRequest();
            request.setSessionId(this.sessionKey);
            DoGetMyFutureItemsResponse response = this.servicePort.doGetMyFutureItems(request);
            return response.getFutureItemsCounter();
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        } catch (Exception e) {
            throw new AllegroException(e);
        }

    }

    /**
     * @return the serverTime
     */
    protected long getServerTime() throws NotLoggedException {
        try {
            doLogin();
            return serverTime;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }


    /**
     * @return the servicePort
     */
    protected ServicePort getServicePort() throws NotLoggedException, AllegroException {
        try {
            doLogin();
            return servicePort;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }

    /**
     * @return the expirationTime
     */
    @Override
    public long getExpirationTime() throws NotLoggedException {
        try {
            doLogin();
            return expirationTime;
        } catch (LoginException e) {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    /**
     * Fetches all journals notifications
     *
     * @return full list of journals
     */
    @Override
    public List<SiteJournalDealsStruct> getSiteJournalDeals() throws AllegroException {
        try {
            List<SiteJournalDealsStruct> resultList = new ArrayList<SiteJournalDealsStruct>();
            DoGetSiteJournalDealsRequest request = new DoGetSiteJournalDealsRequest();
            request.setSessionId(this.getSessionKey());
            int size = 0;
            do {
                DoGetSiteJournalDealsResponse response = this.getServicePort().doGetSiteJournalDeals(request);
                ArrayOfSitejournaldealsstruct siteJournalDeals = response.getSiteJournalDeals();
                List<SiteJournalDealsStruct> item = siteJournalDeals.getItem();
                resultList.addAll(item);
                size = item.size();
                SiteJournalDealsStruct lastElement = item.get(size - 1);
                request.setJournalStart(lastElement.getDealEventId());
            } while (size == 100);
            return resultList;
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }


}
