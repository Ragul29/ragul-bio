package io.myprofile.aboutme.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.myprofile.aboutme.model.Customer;
import io.myprofile.aboutme.repository.CustomerRepository;


@RestController
public class HomeController {
	@Autowired
	private final CustomerRepository customerRepository;
	
	@Autowired
	public HomeController(CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}
	
	

//	@PostMapping("/user/query")
//	    public String addStudent(@Validated Customer customer, BindingResult result, Model model) {
//	        if (result.hasErrors()) {
//	            return "landing";
//	        }
//
//	        customerRepository.save(customer);
//	        return "redirect:/";
//	    }
	
	@PostMapping("/user/query")
	public ModelAndView Home1(@AuthenticationPrincipal OidcUser user)
	{
		return new ModelAndView("thanks");
	}

	@RequestMapping("/")
	public ModelAndView Home(@AuthenticationPrincipal OidcUser user)
	{
		return new ModelAndView("landing");
	}

}