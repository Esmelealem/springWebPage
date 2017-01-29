package pl.quider.web.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Adrian on 29.01.2017.
 */
@Entity
@Table(name = "COUNTRY")
public class Country extends DictionaryEntity{
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "found_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    protected Date foundDate;

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }
}
