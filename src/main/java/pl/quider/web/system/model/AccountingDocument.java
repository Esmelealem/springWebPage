package pl.quider.web.system.model;

import pl.quider.web.contact.model.Contact;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity
@Table(name = "account_document")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AccountingDocument extends EntityType {

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToOne
    @JoinColumn(name = "seller_id")
    private Contact seller;

    @Column(name = "number")
    private String number;

    @OneToMany
    private Collection<Item> items;

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Contact getSeller() {
        return seller;
    }

    public void setSeller(Contact seller) {
        this.seller = seller;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}