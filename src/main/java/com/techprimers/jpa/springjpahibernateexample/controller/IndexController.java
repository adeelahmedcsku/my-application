package com.techprimers.jpa.springjpahibernateexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
