package com.example.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.rubypaper.dto.BookDTO;

@Controller
public class Sc5Controller {

	@GetMapping("/sc5Form")
	public String sc5Form(Model model)
	{
		return "post/sc5Form";
	}
	
	@PostMapping("/sc5View")
	public String sc5View(Model model, BookDTO bookDTO)
	{
		return "post/sc5View";
	}
}
