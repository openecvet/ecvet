package eu.open_ecvet.app.helper;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import eu.open_ecvet.entity.EcvetFrameworkType;

public class JaxBHelper
{
	public static void main(String[] args) throws JAXBException
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ecvet_h2_data");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();

		tx.begin();
//
//		TypedQuery<EcvetFrameworkType> query = entityManager.createQuery("SELECT entity FROM EcvetFrameworkType entity", EcvetFrameworkType.class);
//
//		List<EcvetFrameworkType> frameworks = query.getResultList();
//
//		for (EcvetFrameworkType framework : frameworks)
//		{
//			LogManager.getLogger(JaxBHelper.class).debug(framework.getId());
//		}
//		EcvetFrameworkType singleFramework = frameworks.get(0);
//		
		JAXBContext jc = JAXBContext.newInstance(EcvetFrameworkType.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		EcvetFrameworkType ecvetFramework = (EcvetFrameworkType)unmarshaller.unmarshal(new File("res/clay.xml"));
//		
		entityManager.persist(ecvetFramework);
		
		tx.commit();
//		Marshaller m = jc.createMarshaller();
//		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		m.marshal( singleFramework, System.out );
			
		
	}
}
