package com;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.*;

public class MainClass {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard a=new AadharCard();
		a.setAno(273810323);
		a.setFname("Sellappillai");
		a.setDob("25-02-2004");
		a.setAddress("chennai");
		a.setPincode(28392);
		
		Person p=new Person();
		p.setPid(1);
		p.setName("Suyaja");
		p.setAge(21);
		p.setGender("Female");
		p.setPhone(384928401);
		p.setAadharCard(a);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("Data Saved");
		
		
		
		
	}

}
