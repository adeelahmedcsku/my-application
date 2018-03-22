package com.techprimers.jpa.springjpahibernateexample.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

	
	 @RequestMapping("/")
	   public String home(){
	      return "home";
	   }
   @RequestMapping("/index")
   public String index(){
      return "index";
   }
   
  /* @RequestMapping(value="/login", method = RequestMethod.GET)
   public String login(){
	   return ("/login");
   }*/
   
   @RequestMapping(value="/login",method = RequestMethod.GET)
   public String login(Model model){
    
       model.addAttribute("message", "next page");
       return "login";
   }
   
   
   
   @RequestMapping("/views/leftmenu")
   public String leftmenu(){
      return "/views/leftmenu";
   }
   
  /* @RequestMapping("/")
   public String AllProducts(){
      return "AllProducts";
   }*/
   
   @RequestMapping("/users")
   public String users(){
      return "users";
   }
   
   @RequestMapping("/views/productList")
   public String productList(){
      return "views/productList";
   }
   
   
   @RequestMapping("/views/navbar")
   public String navbar(){
      return "views/navbar";
   }
   
   
   
}
