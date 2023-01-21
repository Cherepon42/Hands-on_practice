package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate1.model.Person;

import java.util.List;

public class GetManyTest {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Person> personList = session.createQuery("from Employee where name like '%la%' and salary > 99")
                    .getResultList();

            for (Person p : personList) {
                System.out.println(p);
            }
            session.getTransaction().commit();
        }
    }
}
