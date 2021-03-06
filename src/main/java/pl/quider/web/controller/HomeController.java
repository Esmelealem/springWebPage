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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.quider.web.allegro.SiteJournalDealsStruct;
import pl.quider.web.allegro.UserDataStruct;
import pl.quider.web.exception.AllegroException;
import pl.quider.web.exception.LoginException;
import pl.quider.web.exception.NotLoggedException;
import pl.quider.web.service.ifc.WebServiceAllegro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping({"/","/index"})
public class HomeController {

    public static final String USER_NAME = "userName";
    public static final String ALLEGRO_STATUS = "allegroStatus";
    public static final String DEALS_COUNT = "dealsCount";
    @Autowired
    private WebServiceAllegro serviceClient;

    @GetMapping
    public ModelAndView view(ModelMap modelMap) {
        UserDataStruct user = new UserDataStruct();
        boolean userLoggedIn = false;
        List<SiteJournalDealsStruct> deals = new ArrayList<>(0) ;

        try {
            userLoggedIn = serviceClient.doLogin();
            user = serviceClient.getUser();
            deals = serviceClient.getSiteJournalDeals();
        } catch (LoginException | NotLoggedException e) {
            user = new UserDataStruct();
            user.setUserFirstName("Not");
            user.setUserLastName("Logged in");
        } catch (AllegroException e) {
            e.printStackTrace();
        }

        modelMap.addAttribute(DEALS_COUNT, deals.size());
        modelMap.addAttribute(USER_NAME, new StringBuilder(user.getUserFirstName()).append(" ").append(user.getUserLastName()).toString());
        modelMap.addAttribute(ALLEGRO_STATUS, userLoggedIn);

        return new ModelAndView("dashboard/dashboard", modelMap);
    }

}
