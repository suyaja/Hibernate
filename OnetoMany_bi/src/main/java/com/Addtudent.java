package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Addtudent {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=em.find(Batch.class, "M117");
		
		if (b!=null) {
			Student s1=new  Student();
			s1.setName("vijay");
			s1.setGender("male");
			s1.setEmail("vijay@gmail.com");
			s1.setPhone(9283910);
			
			b.addStudent(s1);
			
			et.begin();
			em.persist(s1);
			em.merge(b);
			et.commit();
			
			System.out.println("Data added");
			
		} else {
			
			System.out.println("Batch is not present");

		}
	}
	

}
