package test;

import com.mycompany.maven.hibernate.student1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author DELL
 */
public class test1 {
 
    public static void main(String args[])
    {
        student1 s=new student1();
        test2 t=new test2();
        t.setFname("Santhosh");
        t.setLname("Kundi");
        t.setMname("Thangavel");
        s.setName(t);
        s.setPassword("pass123");
        s.setRollNo(1);
       
        Configuration configuration=new Configuration()
            .configure().addAnnotatedClass(student1.class); // configures settings from hibernate.cfg.xml

    StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

    // If you miss the below line then it will complaing about a missing dialect setting
    serviceRegistryBuilder.applySettings(configuration.getProperties());
    ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
    SessionFactory sf= configuration.buildSessionFactory(serviceRegistry);   
    Session session=sf.openSession();
    Transaction tx=session.beginTransaction();
    session.save(s);
    tx.commit();
    }
}
