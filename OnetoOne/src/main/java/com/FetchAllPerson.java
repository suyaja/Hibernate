
package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllPerson {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q= em.createQuery("select p from Person p");
		
		List<Person> l= q.getResultList();
		
		for(Person p:l) {
			System.out.println(p);
		}

	}

}