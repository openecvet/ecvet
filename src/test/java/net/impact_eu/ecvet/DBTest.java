package net.impact_eu.ecvet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

public class DBTest
{

	@Test
	public void initDB()
	{

		LogManager.getLogger(DBTest.class).debug("init the database...");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecvet");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		tx.commit();
	}

}
