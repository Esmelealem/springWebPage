package pl.quider.web.accounting.model;

import pl.quider.web.contact.model.Contact;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity(name = "return")
public class Return extends AccountingDocument {

    @Column(name = "corrected_value")
    private BigDecimal returnedGrossValue;

    @OneToOne
    @JoinColumn(name = "return_contact_id")
    private Contact returningContact;

    public BigDecimal getReturnedGrossValue() {
        return returnedGrossValue;
    }

    public void setReturnedGrossValue(BigDecimal returnedGrossValue) {
        this.returnedGrossValue = returnedGrossValue;
    }

    public Contact getReturningContact() {
        return returningContact;
    }

    public void setReturningContact(Contact returningContact) {
        this.returningContact = returningContact;
    }
}
