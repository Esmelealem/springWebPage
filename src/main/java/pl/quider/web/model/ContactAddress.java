package pl.quider.web.model;

import javax.persistence.*;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity
@Table(name = "contact_address")
public class ContactAddress extends EntityType {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_type_id")
    private AddressType addressType;

    public ContactAddress(Address address, Contact contact) {
        super();
        this.contact = contact;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
