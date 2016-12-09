package pl.quider.web.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.quider.web.allegro.*;
import pl.quider.web.exception.AllegroException;
import pl.quider.web.exception.LoginException;
import pl.quider.web.exception.NotLoggedException;
import pl.quider.web.service.ifc.WebServiceAllegro;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

@Service
public class WebServiceAllegroImpl implements WebServiceAllegro{

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
        if (doLogin()) {
            return this.sessionKey;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public boolean doLogin() {
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
                this.allegroStatus =AllegroStatus.SYSTEM_ERROR;
                throw new LoginException(e);
            }

        } else {
            return true;
        }
    }

//    @Async
    private void saveSession(long serverTime2, long expirationTime2, long userId)  {
        throw  new NotImplementedException();
    }

    protected boolean isExpired() {
        if ((expirationTime - (new Date().getTime()/1000)) < 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getStatusDescription() {
        if (doLogin()) {
            return this.statusDescription;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public AllegroStatus getStatus() {
        if (doLogin()) {
            return this.allegroStatus;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public boolean isAllegroAccount() {
//        return this.allegroRepository.isAllegroAccount();
        throw new NotImplementedException();
    }

    @Override
    public int getCountFavCategories() {
        if (doLogin()) {
            try {
                DoGetFavouriteCategoriesRequest categoriesRequest = new DoGetFavouriteCategoriesRequest();
                categoriesRequest.setSessionHandle(this.sessionKey);
                DoGetFavouriteCategoriesResponse response = this.servicePort.doGetFavouriteCategories(categoriesRequest);
                ArrayOfFavouritescategoriesstruct categoriesList = response.getSFavouriteCategoriesList();
                return categoriesList.getItem().size();
            } catch (Exception e) {
                throw new AllegroException(e);
            }
        }
        throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
    }

    @Override
    public int getCountMySellItems() {
        if (doLogin()) {
            try {
                DoGetMySellItemsRequest request = new DoGetMySellItemsRequest();
                request.setSessionId(sessionKey);
                DoGetMySellItemsResponse response = this.servicePort.doGetMySellItems(request);
                int sellItemsCounter = response.getSellItemsCounter();
                return sellItemsCounter;
            } catch (Exception e) {
                throw new AllegroException(e);
            }
        }
        throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
    }

    @Override
    public int getCountWaitingComments() {
        if (doLogin()) {
            try {
                DoGetWaitingFeedbacksCountRequest request = new DoGetWaitingFeedbacksCountRequest();
                request.setSessionHandle(sessionKey);
                DoGetWaitingFeedbacksCountResponse response = this.servicePort.doGetWaitingFeedbacksCount(request);
                return response.getFeedbackCount();
            } catch (Exception e) {
                throw new AllegroException(e);
            }
        }
        throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
    }

    @Override
    public int getCountFutureItems() {
        if (doLogin()) {
            try {
                DoGetMyFutureItemsRequest request = new DoGetMyFutureItemsRequest();
                request.setSessionId(this.sessionKey);
                DoGetMyFutureItemsResponse response = this.servicePort.doGetMyFutureItems(request);
                return response.getFutureItemsCounter();
            } catch (Exception e) {
                throw new AllegroException(e);
            }
        }
        throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
    }

    /**
     * @return the serverTime
     */
    protected long getServerTime() {
        if (doLogin()) {
            return serverTime;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    /**
     * @return the servicePort
     */
    protected ServicePort getServicePort() {
        if (doLogin()) {
            return servicePort;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    /**
     * @return the expirationTime
     */
    @Override
    public long getExpirationTime() {
        if (doLogin()) {
            return expirationTime;
        } else {
            throw new NotLoggedException(NotLoggedException.NOT_LOGGED_CAUSE);
        }
    }

    @Override
    public List<SiteJournalDealsStruct> getSiteJournalDeals() {
        try {
            DoGetSiteJournalDealsRequest request = new DoGetSiteJournalDealsRequest();
            request.setSessionId(this.getSessionKey());
            DoGetSiteJournalDealsResponse response = this.getServicePort().doGetSiteJournalDeals(request);
            ArrayOfSitejournaldealsstruct siteJournalDeals = response.getSiteJournalDeals();
            return siteJournalDeals.getItem();
        } catch (Exception e) {
            throw new AllegroException(e);
        }
    }


}
