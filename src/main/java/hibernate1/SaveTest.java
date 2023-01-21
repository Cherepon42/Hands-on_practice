package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate1.model.Person;

public class SaveTest {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Person person = new Person("Vlad", "Cherep", "Some", 100);
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        }
    }
}
