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
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.quider.web.model.Contact;
import pl.quider.web.model.ContactType;
import pl.quider.web.model.Country;
import pl.quider.web.repository.ContactDao;
import pl.quider.web.repository.ContactTypeDao;
import pl.quider.web.repository.CountryDao;
import pl.quider.web.service.ifc.WebServiceAllegro;

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

    @GetMapping("/customers")
    public ModelAndView viewTable(ModelMap modelMap) {

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
        return new ModelAndView("customers/add", modelMap);
    }

    /**
     * Begins process of contact creation
     * @param modelMap
     * @return
     */
    @PostMapping("/addcustomer")
    public ModelAndView addCustomer(ModelMap modelMap){

        return new ModelAndView("customers/add", modelMap);
    }
}
