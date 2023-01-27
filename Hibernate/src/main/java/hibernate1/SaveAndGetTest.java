package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate1.model.Person;

public class SaveAndGetTest {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Person person = new Person("Alexander", "Vorkusha", "IT", 500);
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Person person1 = session.get(Person.class, 5);
            session.getTransaction().commit();

            System.out.println(person1);
        }
    }
}
