package eu.open_ecvet.app.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;

import eu.open_ecvet.entity.EcvetFrameworkType;

public class JaxBHelper
{
	public static void main(String[] args) throws JAXBException
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecvet_h2_data");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();

		tx.begin();

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
		m.marshal( singleFramework, System.out );
			
		
	}
}
