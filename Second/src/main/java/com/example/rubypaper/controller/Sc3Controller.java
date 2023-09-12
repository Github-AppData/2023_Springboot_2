package com.example.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Sc3Controller {

	// thymeleaf 문법을 활용 덩어리 전달 방법 
	@GetMapping("/sc3Form")
	public String sc3Form(Model model)
	{
		return "post/sc3Form";
	}
	
	@PostMapping("/controller3")
	public String licenseView(
			String userName,
			String userId,
			String userPhone,
			Model model)
	{
		model.addAttribute("userName", userName);
		model.addAttribute("userId", userId);
		model.addAttribute("userPhone", userPhone);
		model.addAttribute("heading", "KimTaeWook");
		return "post/sc3View";
	}
}
