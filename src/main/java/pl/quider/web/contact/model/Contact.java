package pl.quider.web.contact.model;

import pl.quider.web.system.model.Address;
import pl.quider.web.system.model.EntityType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Adrian on 20.01.2017.
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends EntityType {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FIRST_NAME", nullable = true)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "MIDDLE_NAME", nullable = true)
    private String middleName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FOUND_DATE")
    private Date foundDate;

    @OneToMany(mappedBy = "contact")
    private List<ContactAddress> addresses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public List<ContactAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<ContactAddress> addresses) {
        this.addresses = addresses;
    }
}
