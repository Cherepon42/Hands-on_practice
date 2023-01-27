package hibernate4;


import hibernate4.entities.Child;
import hibernate4.entities.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tests {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
            Session session = factory.getCurrentSession()){

//            Section section = new Section("persist4");
//            Child child = new Child("Persist test4");
//            section.addChild(child);
//            child.addSection(section);

            session.beginTransaction();
            System.out.println("start");
            Section section = session.get(Section.class, 6);
            System.out.println("get child");
            Child child = session.get(Child.class, 4);
            System.out.println("add child");
            section.addChild(child);
            System.out.println("end");
            session.getTransaction().commit();

        }
    }


}
