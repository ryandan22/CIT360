package main;

import java.util.List;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import academy.HibernateJavaProject.Employee;

public class storeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();  

		Employee emp1 = new Employee ("001","John","Smith");
		Employee emp2 = new Employee ("002","Susan","Taylor");   

		session.save(emp1);
		session.save(emp2);
		//PrintTransaction();
		emp2.setLast_name("Adkins");
		t.commit();
		System.out.println(emp1.getName()+" "+emp1.getLast_name());
		System.out.println(emp2.getName()+" "+emp2.getLast_name());
		System.out.println("successfully saved");   

		factory.close();
		session.close();

	}

}
