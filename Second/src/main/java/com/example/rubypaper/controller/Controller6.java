package com.example.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.rubypaper.dto.BoardDTO;

@Controller
public class Controller6 {

	@GetMapping("/sc6")
	public String sc6(Model model)
	{
		model.addAttribute("boardDTO", new BoardDTO("1","contents", "Kim Tae Wook"));
		return "post/sc6Form";
	}
	
	@GetMapping("/sc7")
	public String sc7(Model model)
	{
		List<BoardDTO> bList = new ArrayList<BoardDTO>();
		BoardDTO b1 = new BoardDTO("1", "tour", "qkdkdq");
		BoardDTO b2 = new BoardDTO("2", "Eating", "kalskd");
		bList.add(b1);
		bList.add(b2);
		
		model.addAttribute("bList", bList);
		return "post/sc7Form";
	}
}
