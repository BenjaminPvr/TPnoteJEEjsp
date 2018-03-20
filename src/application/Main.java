package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import application.beans.Activite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TPnote_jsp");
		EntityManager manager = factory.createEntityManager();
		
		Activite activiteTest = new Activite("test");
		
		manager.getTransaction().begin();
		manager.persist(activiteTest);
		manager.getTransaction().commit();
	}

}
