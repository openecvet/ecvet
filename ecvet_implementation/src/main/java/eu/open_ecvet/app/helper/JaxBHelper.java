package eu.open_ecvet.app.helper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;

import eu.open_ecvet.entity.EcvetFrameworkType;

public class JaxBHelper
{

	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) throws JAXBException
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecvet_h2_data");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();

		tx.begin();

		// TypedQuery<EcvetFrameworkType> query =
		// entityManager.createQuery("SELECT entity FROM EcvetFrameworkType entity",
		// EcvetFrameworkType.class);
		//
		// List<EcvetFrameworkType> frameworks = query.getResultList();
		//
		// for (EcvetFrameworkType framework : frameworks)
		// {
		// LogManager.getLogger(JaxBHelper.class).debug(framework.getId());
		// }
		// EcvetFrameworkType singleFramework = frameworks.get(0);

		JAXBContext jc = JAXBContext.newInstance(EcvetFrameworkType.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		EcvetFrameworkType ecvetFramework = (EcvetFrameworkType) unmarshaller.unmarshal(new File("res/clay.xml"));

		entityManager.persist(ecvetFramework);
		tx.commit();

		// Marshaller m = jc.createMarshaller();
		// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		// m.marshal( singleFramework, System.out );

	}

	private static EntityManager getEM(boolean drop)
	{
		Map<String, Object> properties = new HashMap<String, Object>();

		if (drop)
		{
			properties.put("eclipselink.ddl-generation", "drop-and-create-tables");
		}
		entityManagerFactory = Persistence.createEntityManagerFactory("ecvet_h2_data", properties);

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager;

	}

	public static void loadXML(File file) throws JAXBException
	{
		EntityManager entityManager = getEM(false);

		EntityTransaction tx = entityManager.getTransaction();

		tx.begin();

		JAXBContext jc = JAXBContext.newInstance(EcvetFrameworkType.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		EcvetFrameworkType ecvetFramework = (EcvetFrameworkType) unmarshaller.unmarshal(new File("res/clay.xml"));

		entityManager.persist(ecvetFramework);
		tx.commit();
	}

	public static void saveXML(File file) throws JAXBException
	{
		EntityManager entityManager = getEM(false);

		TypedQuery<EcvetFrameworkType> query = entityManager.createQuery("SELECT entity FROM EcvetFrameworkType entity", EcvetFrameworkType.class);

		List<EcvetFrameworkType> frameworks = query.getResultList();

		for (EcvetFrameworkType framework : frameworks)
		{
			LogManager.getLogger(JaxBHelper.class).debug(framework.getId());
		}
		EcvetFrameworkType singleFramework = frameworks.get(0);

		JAXBContext jc = JAXBContext.newInstance(EcvetFrameworkType.class);
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(singleFramework, file);

	}

	public static void dropTables()
	{
		EntityManager entityManager = getEM(false);
		entityManager.close();
		entityManagerFactory.close();
		entityManager = getEM(true);
		// entityManager.setProperty("eclipselink.ddl-generation",
		// "drop-and-create-tables");
		// entityManager.getTransaction().begin();
		// entityManager.getTransaction().commit();
	}
}
