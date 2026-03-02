package com;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=new Batch();
		b.setBcode("M117");
		b.setSubject("java");
		b.setTrainer("tabrez");
		b.setTiming("10.00Am");
		b.setNoofstd(200);
		
		Student s1=new Student();
		s1.setName("Arjrun");
		s1.setGender("male");
		s1.setEmail("arjun@gmail.com");
		s1.setPhone(6478378);
		s1.setBatch(b);
		
		Student s2=new Student();
		s2.setName("Ram charan");
		s2.setGender("male");
		s2.setEmail("ram@gmail.com");
		s2.setPhone(64783888);
		s2.setBatch(b);
		
		Student s3=new Student();
		s3.setName("vijay");
		s3.setGender("male");
		s3.setEmail("vijay@gmail.com");
		s3.setPhone(64789088);
		s3.setBatch(b);
		
		Student s4=new Student();
		s4.setName("Virat");
		
		s4.setGender("male");
		s4.setEmail("virat@gmail.com");
		s4.setPhone(643888);
		s4.setBatch(b);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		b.setStudents(al);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(b);
		et.commit();
		
		System.out.println("Data saved");
		
	}

}
