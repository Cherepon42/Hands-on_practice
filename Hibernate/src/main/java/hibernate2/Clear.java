package hibernate2;

import hibernate2.models.Detail;
import hibernate2.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Clear {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            session.beginTransaction();
            session.createQuery("delete from Employee ").executeUpdate();
            session.createQuery("delete from Detail").executeUpdate();
            session.getTransaction().commit();
        }
    }
}