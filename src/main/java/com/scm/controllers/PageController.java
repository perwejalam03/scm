package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
	public String getMethodName() {
		return new String("register");
	}
	
}
