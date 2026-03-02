package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Adduser {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Application a=em.find(Application.class, 1);
		
		if (a!=null) {
			
			User u1=new User();
			u1.setUsername("suyaja");
			u1.setGender("Female");
			u1.setEmail("suyajavs@gmail.com");
			u1.setPassword("152728");
			u1.setPhoneNo(237821791);
			
			a.addUsers(u1);
			et.begin();
			em.persist(u1);
			em.merge(a);
			et.commit();
			System.out.println("Data Saved");
			
			
			
		} else {
			System.out.println("Application not present");

		}
		
	}

}
