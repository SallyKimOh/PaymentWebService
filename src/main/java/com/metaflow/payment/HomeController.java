package com.metaflow.payment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.metaflow.payment.model.HomeInfo;

@Controller
public class HomeController {

	@RequestMapping("/home1")
	public String index(Model model) {
		model.addAttribute("name", "SpringBlog from Millky");
		return "home";
	}	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("home", "homeInfo", new HomeInfo());
    }	
	
}
