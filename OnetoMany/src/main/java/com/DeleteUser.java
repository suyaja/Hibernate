package com;

import jakarta.persistence.*;

public class DeleteUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		User u=em.find(User.class, 4);
		
		Application a=em.find(Application.class, 1);
		a.removeUser(u);
		
		et.begin();
		em.merge(a);
		em.remove(u);
		et.commit();
		
	   System.out.println("User deleted");
		
		
		
	}

}
