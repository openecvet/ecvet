package eu.open_ecvet;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.junit.Test;

public class H2DBTest
{
	@Test
	public void startH2DB()
	{
		try
		{
			Server.createTcpServer("-tcpDaemon").start();
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecvet_h2");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			
//			EcvetFrameworkType ecvetFramework = new EcvetFrameworkType();
//			ecvetFramework.setTitle("test");
//			ecvetFramework.setURI("http://test");
//			
//			entityManager.persist(ecvetFramework);
			
			tx.commit();
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
