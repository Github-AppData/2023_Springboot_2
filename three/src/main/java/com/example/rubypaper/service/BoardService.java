package com.example.rubypaper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.example.rubypaper.dao.BoardDAO;
import com.example.rubypaper.domain.Board;

//@Service
public class BoardService implements ApplicationRunner{

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Board board = new Board();
		
		board.setTitle("asda");
		board.setContent("asd");
		board.setWriter("asdadsa");
		boardDAO.insertBoard(board);

		List<Board> boardList = boardDAO.getBoardList();
		
		for(Board row:boardList) {
			System.out.println("-------"+row.toString());
		}
	}
	
	
	
}
