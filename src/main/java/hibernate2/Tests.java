package hibernate2;

import hibernate2.models.Detail;
import hibernate2.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tests {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            //Employee employee = new Employee("ASDJLASKDNl", "Cherep", "SSSSSSS department", 999);
            //Detail detail = new Detail("MMMMMMMM", "+375336023307", "email@email.com");
            //employee.setIdentity(detail);
            //detail.setEmployee(employee);

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 14);
            detail.getEmployee().setIdentity(null);
            session.delete(detail);
            session.getTransaction().commit();
        }
    }


}
