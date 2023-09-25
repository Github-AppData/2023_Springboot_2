package com.example.rubypaper;

import java.util.Date;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Service
public class JPAClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("four-JPA");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			Board board = new Board();
			board.setCnt(1L);
			board.setTitle("asdasd");
			board.setContent("JPA Clear !");
			board.setWriter("Admin");
			board.setCreateDate(new Date());
			
			em.persist(board);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			tx.rollback();
		}
		finally {
			em.close();
			emf.close();
		}
		
//		try {
//			Board searchboard = em.find(Board.class, 1L);
//			System.out.println("---> " + searchboard.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			em.close();
//			emf.close();
//		}
		
	}
}
