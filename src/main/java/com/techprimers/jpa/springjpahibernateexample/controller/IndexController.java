package com.techprimers.jpa.springjpahibernateexample.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.techprimers.jpa.springjpahibernateexample.utils.WebUtils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

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
   
   @RequestMapping("/views/about")
   public String About(){
      return "views/about";
   }
   
   @RequestMapping("/views/navbar")
   public String navbar(){
      return "views/navbar";
   }
   
   @RequestMapping(value="/views/adminnavbar", method = RequestMethod.GET)
   public String adminnavbar(Model model,Principal principal){
  String userName = principal.getName();
	   
       System.out.println("User Name: " + userName);

       User loginedUser = (User) ((Authentication) principal).getPrincipal();

       String userInfo = WebUtils.toString(loginedUser);
       model.addAttribute("userInfo", userInfo);
      return "views/adminnavbar";
   }
   
   //@GetMapping("/admin")
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String admin(Model model,Principal principal) {
	   String userName = principal.getName();
	   
       System.out.println("User Name: " + userName);

       User loginedUser = (User) ((Authentication) principal).getPrincipal();

       String userInfo = WebUtils.toString(loginedUser);
       model.addAttribute("userInfo", userInfo);
	   
	   return "/admin";
   }
   
   @GetMapping("/403")
   public String error403() {
       return "/error/403";
   }
   
}
