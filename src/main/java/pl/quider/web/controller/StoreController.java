/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.quider.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.quider.web.dto.form.CreateContactDto;
import pl.quider.web.model.*;
import pl.quider.web.repository.*;
import pl.quider.web.service.ifc.WebServiceAllegro;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/store")
public class StoreController {

    public static final String USER_NAME = "userName";
    public static final String ALLEGRO_STATUS = "allegroStatus";
    public static final String DEALS_COUNT = "dealsCount";
    @Autowired
    private WebServiceAllegro serviceClient;

    @Autowired
    protected ContactTypeDao contactTypeDao;
    @Autowired
    protected ContactDao contactDao;
    @Autowired
    protected CountryDao countryDao;
    @Autowired
    protected AddressTypeDao addressTypeDao;
    @Autowired
    protected ContactAddressDao contactAddressDao;

    @GetMapping("/customers")
    public ModelAndView viewTable(ModelMap modelMap, Pageable pageable) {
        Page<Contact> all = contactDao.findAll(pageable);
        modelMap.addAttribute("contactsList", all);
        return new ModelAndView("customers/table", modelMap);
    }

    @GetMapping("/offers")
    public ModelAndView viewOffers(ModelMap modelMap) {

        return new ModelAndView("customers/offers", modelMap);
    }

    @GetMapping("/payments")
    public ModelAndView viewPayments(ModelMap modelMap) {

        return new ModelAndView("customers/payments", modelMap);
    }

    /**
     * Shows customers adding form
     * @param modelMap
     * @return
     */
    @GetMapping("/addcustomer")
    public ModelAndView addCustomerForm(ModelMap modelMap){
        Iterable<ContactType> all = this.contactTypeDao.findAll();
        modelMap.addAttribute("contactTypes", all);
        Iterable<Country> countries = this.countryDao.findAll();
        modelMap.addAttribute("countryList", countries);
        Iterable<AddressType> addressTypes = this.addressTypeDao.findAll();
        modelMap.addAttribute("addressTypeList",addressTypes);
        return new ModelAndView("customers/add", modelMap);
    }

    /**
     * Begins process of contact creation
     * @param modelMap
     * @return
     */
    @PostMapping("/addcustomer")
    public ModelAndView addCustomer(@ModelAttribute CreateContactDto contact, HttpServletRequest request, ModelMap modelMap){
        Contact newContact = new Contact();
        newContact.setLastName(contact.getLastName());
        newContact.setFirstName(contact.getFirstName());
        newContact.setNip(contact.getNip());
        newContact.setBirthDate(contact.getBirthDate());
        newContact.setContactType(contact.getContactType());
        newContact.setFoundDate(contact.getFoundDate());
        newContact.setRegon(contact.getRegon());
        newContact.setPesel(contact.getPesel());
        newContact.setMiddleName(contact.getMiddleName());
        newContact.setNip(contact.getNip());

        Address address = new Address();
        address.setCity(contact.getFormCity());
        address.setHouseNumber(contact.getFormHouseNumber());
        address.setFlatNumber(contact.getFormFlatNumber());
        address.setZipCode(contact.getFormZipCode());
        address.setStreet(contact.getFormStreet());

        List<ContactAddress> addresses = newContact.getAddresses();
        if(addresses==null){
            addresses = new ArrayList<>();
            contact.setAddresses(addresses);
        }
        ContactAddress contactAddress = new ContactAddress(address, newContact);
        addresses.add(contactAddress);
        contactAddress.setAddressType(contact.getFormAddressType());
        this.contactDao.save(newContact);
        return new ModelAndView("redirect:/customers/");
    }

    @GetMapping(value ="/updatecustomer", params = {"id"})
    public ModelAndView updateCustomer(ModelMap modelMap, @RequestParam(value = "id") Integer id){
        CreateContactDto contact = new CreateContactDto();

        Contact newContact = contactDao.findOne(id);
        if (newContact == null) {
            return new ModelAndView("redirect:/addcustomer");
        }
        newContact.setLastName(contact.getLastName());
        newContact.setFirstName(contact.getFirstName());
        newContact.setNip(contact.getNip());
        newContact.setBirthDate(contact.getBirthDate());
        newContact.setContactType(contact.getContactType());
        newContact.setFoundDate(contact.getFoundDate());
        newContact.setRegon(contact.getRegon());
        newContact.setPesel(contact.getPesel());
        newContact.setMiddleName(contact.getMiddleName());
        newContact.setNip(contact.getNip());

        Address address = new Address();
        address.setCity(contact.getFormCity());
        address.setHouseNumber(contact.getFormHouseNumber());
        address.setFlatNumber(contact.getFormFlatNumber());
        address.setZipCode(contact.getFormZipCode());
        address.setStreet(contact.getFormStreet());


        modelMap.addAttribute("contact",contact);
        return new ModelAndView("customers/add", modelMap);
    }


}
