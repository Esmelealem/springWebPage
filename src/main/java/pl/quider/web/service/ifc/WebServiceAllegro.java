package pl.quider.web.service.ifc;

import pl.quider.web.allegro.SiteJournalDealsStruct;
import pl.quider.web.exception.NotLoggedException;

import java.util.List;

/**
 * Created by Adrian on 05.12.2016.
 */
public interface WebServiceAllegro {
    String getSessionKey() throws NotLoggedException;

    boolean doLogin();

    String getStatusDescription();

    AllegroStatus getStatus();

    boolean isAllegroAccount();

    int getCountFavCategories();

    int getCountMySellItems();

    int getCountWaitingComments();

    int getCountFutureItems();

    long getExpirationTime();

    List<SiteJournalDealsStruct> getSiteJournalDeals();

    enum AllegroStatus {
        OK, OFF, ERROR , SYSTEM_ERROR;
    }
}
