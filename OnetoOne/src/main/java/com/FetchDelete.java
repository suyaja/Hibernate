package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchDelete {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Person p = em.find(Person.class, 1);
		p.setAadharCard(null);
		
		et.begin();
		em.remove(p);
		et.commit();
		
		System.out.println("data to be null");
	}

}
//first AadharNo to be given as null then will be remove
//because child cannot be remove directly.so break the relationship or connection.give as null .