package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate1.model.Person;

public class UpdateAndDeleteTest {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Person person = session.get(Person.class, 0);
//            person.setDepartment("TEST0");
//            person.setName("TEST0");
//            person.setSalary(798);
//            person.setSurname("TEST0");

//            session.createQuery("update Person set salary = 122, department = 'TESTplenty_updates' where id between 1 and 4")
//                    .executeUpdate();


//            Person p = session.get(Person.class, 1);
//            session.delete(p);
//            session.createQuery("delete Person where id = 1").executeUpdate();

            session.getTransaction().commit();
        }
    }
}