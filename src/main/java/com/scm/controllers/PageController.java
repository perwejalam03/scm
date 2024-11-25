package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.forms.UserForm;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PageController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home page redirected");
		model.addAttribute("name", "Substring Test");
		model.addAttribute("youtubeChannel", "Perwej Developer");
		model.addAttribute("githubRepo", "https://github.com/perwejalam03");
		return "home";
	}

	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("isLogin", "true");
		System.out.println("About page redirected");
		return "about";
	}

	@RequestMapping("/services")
	public String servicesPage() {
		System.out.println("Services page redirected");
		return "services";
	}
	@RequestMapping("/contact")
	public String contactPage() {
		System.out.println("Contact page redirected");
		return "contact";
	}
	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("Login page redirected");
		return "login";
	}
	@GetMapping("/register")
	public String register(Model model ) {
		UserForm userForm = new UserForm();
		userForm.setName("Alam");
		model.addAttribute("userForm", userForm);
		return "register";
		}

	@RequestMapping(value = "/do-register", method = RequestMethod.POST)
	public String processRegister(){
		System.out.println("Processing register");
		return "redirect:/register";
	}
	
}
