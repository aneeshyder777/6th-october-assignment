package com.assignment.techercourses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Trainer.class);
    	@SuppressWarnings("unused")
		Configuration con1 = new Configuration().configure().addAnnotatedClass(Course.class);
        @SuppressWarnings("deprecation")
		SessionFactory sf=con.buildSessionFactory();
        Session session = sf.openSession();
        
        Course c = new Course();
        c.setCid(1);
        c.setName("java");
        
        
        
        Course c2 = new Course();
        c2.setCid(2);
        c2.setName("Lava");
        
        Trainer t = new Trainer();
        t.setId(101);
        t.setName("T-Khushbu");
        t.getCour().add(c);
        t.getCour().add(c2);
        
        
        Transaction t1=session.beginTransaction();   
        session.persist(t);
        t1.commit(); 
        
      session.close();
     System.out.println("smoothly done");
    }
}
