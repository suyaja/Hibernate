package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchhAadhar {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		AadharCard a = em.find(AadharCard.class,1234567899);
		
		a.setDob("14/10/2001");
		a.setPincode(6433332);
		
		et.begin();
		em.merge(a);
		et.commit();
	}

}