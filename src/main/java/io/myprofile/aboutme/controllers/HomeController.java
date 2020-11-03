package io.myprofile.aboutme.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView Home()
	{
		return new ModelAndView("landing");
	}

}