package com.example.rubypaper.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.rubypaper.domain.Board;

@Repository

// DB를 건드리는 놈.
public class BoardDAO {

	// Mybatis로 결정
	
	// 멤버변수 
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 멤버 메소드
	public void insertBoard(Board board) {
		mybatis.insert("insertBoard", board);
	}
	
	public List<Board> getBoardList(){
		List<Board> list = mybatis.selectList("getBoardList");
		return list;
	}
	
}
