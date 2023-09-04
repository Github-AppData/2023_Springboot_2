package com.example.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.rubypaper.dto.UserDTO;

@Controller
public class ScC {
	
	@GetMapping("/sc1")
	public String Mac()
	{
		return "post/sc1";
	}
	
	@GetMapping("/user/userinfo")
	public String userinfo()
	{
		return "user/userinfo";
	}
	
	@GetMapping("user/userdata")
	public String userdata(Model model)
	{
		model.addAttribute("username","홍길동");
		model.addAttribute("userid","xodnr2019");
		
		return "user/userdata";
	}
	
	@GetMapping("/user/request")
	public String asdasd(@RequestParam("userid") String userid,
						 @RequestParam("userpwd") String userpwd, Model model)
	{
		model.addAttribute("userid", userid);
		model.addAttribute("userpwd", userpwd);
		return "user/userparams";
	}
	
	@GetMapping("/user/form")
	public String userdto(Model model)
	{
		return "user/sc1Form";
	}
	
	@PostMapping("/view")
	public String asd(UserDTO userDTO, Model model)
	{
		return "user/sc1View";
	}
}
