package com.geekquote.dao;

import com.geekquote.util.PersistenceManager;

public class DaoFactory {

	private static DaoFactory instance;
	
	private QuoteDao quoteDao;
	
	private DaoFactory(){}
	
	public static DaoFactory getInstance(){
		if(instance == null){
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public QuoteDao getQuoteDao(){
		if(quoteDao ==null){
			quoteDao = new JpaQuoteDao(PersistenceManager.getEntityManagerFactory());
		}
		return quoteDao;
	}
}
