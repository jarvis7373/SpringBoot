package org.pace.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	
	@RequestMapping( value = "/home" , method = RequestMethod.GET)
	public String home(ModelMap model) {
		
		
		model.addAttribute("title", "Angular");
		
		return "home";
	}
	
	@RequestMapping( value = "/list" , method = RequestMethod.GET)
	public String list() {
		System.out.println("test");
		return "list";
	}
	
	@RequestMapping( value = "/view" , method = RequestMethod.GET)
	public String view() {
		
		return "view";
	}

}
