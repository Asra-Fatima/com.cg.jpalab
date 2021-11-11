package com.cg.jpalab.entities;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpalab.entities.Author;
public class AuthorDemo {
public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		//Author a1 = new Author(101,"Asra","Fatima","md","9059101609");
		Author a2 = new Author(102,"sabrina","null","shaik","9515307883");
		Author a3 = new Author(103,"Imaz","Ahsan","md","7097572822");
		Author a4 = new Author(104,"Madhu","null","Allabhoina","7097572829");
		Author a5 = new Author(105,"Sindhu","Reddy","null","9097577652");
		Author a6 = new Author(101,"Asra","Fatima","md","9059101609");
		// Inserting record  ---> After insertion we cannot again insert that record
		//em.persist(a6);  //insert
		//em.persist(a2);
		//em.persist(a3);
		//em.persist(a4);
		//em.persist(a5);
		
		
		em.remove(em.find(Author.class,101)); // remove 
		// em.find(Author.class, 101); // find author details by id
		
		// Updating record
		//a1.setFirstName("A");
		//em.merge(a1);    //Update
		
		// Displaying record
	//	Author aut = em.find(Author.class, 101);   //Select
	//	System.out.println(aut.toString());
		
		tr.commit();
		System.out.println("End");
}
}
