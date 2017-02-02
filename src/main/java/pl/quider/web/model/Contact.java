package pl.quider.web.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @Column(name = "PESEL")
    private String pesel;
    @Column(name = "NIP")
    private String nip;
    @Column(name = "REGON")
    private String regon;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTACT_TYPE_ID")
    private ContactType contactType;
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<ContactAddress> addresses;
    @Transient
    private Country formCountry;
    @Transient
    private String formCity;
    @Transient
    private String formStreet;
    @Transient
    private String formHouseNumber;
    @Transient
    private String formFlatNumber;
    @Transient
    private String formZipCode;
    @Transient
    private AddressType formAddressType;

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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    /**
     * Not stored in DB
     * @return
     */
    public Country getFormCountry() {
        return formCountry;
    }

    /**
     * Not stored in DB
     * @param formCountry
     */
    public void setFormCountry(Country formCountry) {
        this.formCountry = formCountry;
    }

    /**
     * Not stored in DB
     * @return
     */
    public String getFormCity() {
        return formCity;
    }

    /**
     * Not stored in DB
     * @param formCity
     */
    public void setFormCity(String formCity) {
        this.formCity = formCity;
    }

    /**
     * Not stored in DB
     * @return
     */
    public String getFormStreet() {
        return formStreet;
    }

    /**
     * Not stored in DB
     * @param formStreet
     */
    public void setFormStreet(String formStreet) {
        this.formStreet = formStreet;
    }

    /**
     * Not stored in DB
     * @return
     */
    public String getFormHouseNumber() {
        return formHouseNumber;
    }

    /**
     * Not stored in DB
     * @param formHouseNumber
     */
    public void setFormHouseNumber(String formHouseNumber) {
        this.formHouseNumber = formHouseNumber;
    }

    /**
     * Not stored in DB
     * @return
     */
    public String getFormFlatNumber() {
        return formFlatNumber;
    }

    /**
     * Not stored in DB
     * @param formFlatNumber
     */
    public void setFormFlatNumber(String formFlatNumber) {
        this.formFlatNumber = formFlatNumber;
    }

    /**
     * Not stored in DB
     * @return
     */
    public String getFormZipCode() {
        return formZipCode;
    }

    /**
     * Not stored in DB
     * @param formZipCode
     */
    public void setFormZipCode(String formZipCode) {
        this.formZipCode = formZipCode;
    }

    /**
     * Not stored in DB
     * @return
     */
    public AddressType getFormAddressType() {
        return formAddressType;
    }

    /**
     * Not stored in DB
     * @param formAddressType
     */
    public void setFormAddressType(AddressType formAddressType) {
        this.formAddressType = formAddressType;
    }
}
