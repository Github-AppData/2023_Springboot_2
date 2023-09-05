package com.example.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.rubypaper.dto.UserDTO;



@Controller
public class SampleController1 {

	@GetMapping("/sc1Form")
	public String asd(Model model)
	{
		return "post/sc1Form";
	}
	
	@PostMapping("/view")
	public String fgh(Model model, UserDTO userDTO)
	{
		
		System.out.println(userDTO.getUserName());
		System.out.println(userDTO.getUserId());
		System.out.println(userDTO.getUserPwd());
		System.out.println(userDTO.getUserHobby());
	
		return "post/sc1View";
	}
}
