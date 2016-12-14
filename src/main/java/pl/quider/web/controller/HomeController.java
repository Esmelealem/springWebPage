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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.quider.web.allegro.UserDataStruct;
import pl.quider.web.service.ifc.WebServiceAllegro;
import pl.quider.web.service.impl.WebServiceAllegroImpl;

import java.util.ArrayList;

/**
 * @author Rob Winch
 * @author Doo-Hwan Kwak
 */
@Controller
@RequestMapping("/")
public class HomeController {

	public static final String USER_NAME = "userName";
	@Autowired
	private WebServiceAllegro serviceClient;

	@GetMapping
	public ModelAndView view() {

		boolean b = serviceClient.doLogin();

		UserDataStruct user = serviceClient.getUser();
		ModelAndView modelAndView = new ModelAndView("layout", "messages", new ArrayList<String>());

		modelAndView.addObject(USER_NAME,new StringBuilder(user.getUserFirstName()).append(" ").append(user.getUserLastName()).toString());

		return modelAndView;
	}

}
