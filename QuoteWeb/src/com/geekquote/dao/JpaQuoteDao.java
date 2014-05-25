package com.geekquote.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.geekquote.entity.Quote;

public class JpaQuoteDao implements QuoteDao{

	private EntityManagerFactory emf;
	
	public JpaQuoteDao(EntityManagerFactory emf){
		this.emf = emf;
	}
	
	@Override
	public List<Quote> getAllQuotes() {
		EntityManager em = emf.createEntityManager();
		try{
			Query query = em.createQuery("SELECT q FROM Quote q");
			return query.getResultList();
		}finally{
			em.close();
		}
	}

	@Override
	public void addQuote(Quote q) {
		EntityManager em = emf.createEntityManager();
		try{
			em.getTransaction().begin();
			em.persist(q);
			em.getTransaction().commit();
		}finally{
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

	@Override
	public Quote getQuoteById(int id) {
		EntityManager em = emf.createEntityManager();
		try{
			return em.find(Quote.class, id);
		}finally{
			em.close();
		}
	}

	@Override
	public void removeQuote(int id) {
		EntityManager em = emf.createEntityManager();
		try{
			em.getTransaction().begin();
			em.remove(em.find(Quote.class, id));
			em.getTransaction().commit();
		}finally{
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
	}

}
