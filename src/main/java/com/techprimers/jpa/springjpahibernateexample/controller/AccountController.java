package com.techprimers.jpa.springjpahibernateexample.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
	
	@RequestMapping(value="/Account/login",method = RequestMethod.GET)
	   public void login( HttpServletRequest request){
	      redirectedUrl("http://localhost:8080/Account/login");
		//return "redirect:http://localhost:8080/Account/login";
	   }
}
