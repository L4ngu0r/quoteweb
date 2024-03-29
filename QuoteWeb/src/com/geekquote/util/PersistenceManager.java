package com.geekquote.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

	private static EntityManagerFactory emf;
	
	private PersistenceManager(){
		
	}
	
	public static EntityManagerFactory getEntityManagerFactory(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("GeekQuote-PU");
		}
		return emf;
	}
	
	public static void closeEntityManagerFactory(){
		if(emf != null && emf.isOpen()) emf.close();
	}
}
