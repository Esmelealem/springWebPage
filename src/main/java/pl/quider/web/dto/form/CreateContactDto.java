package pl.quider.web.dto.form;

import pl.quider.web.model.AddressType;
import pl.quider.web.model.ContactAddress;
import pl.quider.web.model.ContactType;
import pl.quider.web.model.Country;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by adrian on 06.02.17.
 */
public class CreateContactDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private Date foundDate;
    private String pesel;
    private String nip;
    private String regon;
    private ContactType contactType;
    private List<ContactAddress> addresses;
    private Country formCountry;
    private String formCity;
    private String formStreet;
    private String formHouseNumber;
    private String formFlatNumber;
    private String formZipCode;
    private AddressType formAddressType;

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

    public List<ContactAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<ContactAddress> addresses) {
        this.addresses = addresses;
    }

    public Country getFormCountry() {
        return formCountry;
    }

    public void setFormCountry(Country formCountry) {
        this.formCountry = formCountry;
    }

    public String getFormCity() {
        return formCity;
    }

    public void setFormCity(String formCity) {
        this.formCity = formCity;
    }

    public String getFormStreet() {
        return formStreet;
    }

    public void setFormStreet(String formStreet) {
        this.formStreet = formStreet;
    }

    public String getFormHouseNumber() {
        return formHouseNumber;
    }

    public void setFormHouseNumber(String formHouseNumber) {
        this.formHouseNumber = formHouseNumber;
    }

    public String getFormFlatNumber() {
        return formFlatNumber;
    }

    public void setFormFlatNumber(String formFlatNumber) {
        this.formFlatNumber = formFlatNumber;
    }

    public String getFormZipCode() {
        return formZipCode;
    }

    public void setFormZipCode(String formZipCode) {
        this.formZipCode = formZipCode;
    }

    public AddressType getFormAddressType() {
        return formAddressType;
    }

    public void setFormAddressType(AddressType formAddressType) {
        this.formAddressType = formAddressType;
    }
}
