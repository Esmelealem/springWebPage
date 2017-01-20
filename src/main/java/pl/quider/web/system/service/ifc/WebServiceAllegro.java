package pl.quider.web.system.service.ifc;

import pl.quider.web.allegro.SiteJournalDealsStruct;
import pl.quider.web.allegro.UserDataStruct;
import pl.quider.web.system.exception.AllegroException;
import pl.quider.web.system.exception.LoginException;
import pl.quider.web.system.exception.NotLoggedException;

import java.util.List;

/**
 * Created by Adrian on 05.12.2016.
 */
public interface WebServiceAllegro {
    String getSessionKey() throws NotLoggedException;

    boolean doLogin() throws LoginException;

    UserDataStruct getUser() throws LoginException, NotLoggedException;

    String getStatusDescription() throws NotLoggedException;

    AllegroStatus getStatus() throws NotLoggedException;

    boolean isAllegroAccount();

    int getCountFavCategories() throws NotLoggedException, AllegroException;

    int getCountMySellItems() throws NotLoggedException, AllegroException;

    int getCountWaitingComments() throws NotLoggedException, AllegroException;

    int getCountFutureItems() throws NotLoggedException, AllegroException;

    long getExpirationTime() throws NotLoggedException;

    List<SiteJournalDealsStruct> getSiteJournalDeals() throws AllegroException;

    enum AllegroStatus {
        OK, OFF, ERROR , SYSTEM_ERROR;
    }
}
