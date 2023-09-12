package com.example.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.rubypaper.dto.LicenseDTO;

@Controller
public class LicenseController {

	// DTO를 이용한 객체 전달 방법 
	@GetMapping("/licenseForm")
	public String license(Model model)
	{
		return "post/licenseForm";
	}
	

	@PostMapping("/licenseView")
	public String licenseView(Model model, LicenseDTO licenseDTO)
	{
		System.out.println(licenseDTO.getLicenseAgency());
		System.out.println(licenseDTO.getLicenseType());
		System.out.println(licenseDTO.getLicenseMethod());
		return "post/licenseView";
	}
	
	
	
}
