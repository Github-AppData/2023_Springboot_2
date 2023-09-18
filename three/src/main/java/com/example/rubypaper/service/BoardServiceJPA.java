package com.example.rubypaper.service;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.example.rubypaper.domain.Board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class BoardServiceJPA implements ApplicationRunner{

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("three");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Board board = new Board();
		
		board.setTitle("jpa start");
		board.setContent("lee sun shin");
		board.setWriter("technology");
//		BoardDAO.insert
		board.setCreateDate(new Date());
		board.setCnt(0);
		
		em.persist(board);
		tx.commit();
		em.close();
		emf.close();
	}
}
