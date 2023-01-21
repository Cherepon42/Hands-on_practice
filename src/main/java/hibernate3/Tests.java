package hibernate3;

import hibernate3.entities.Employee;
import hibernate3.entities.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tests {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
            Session session = factory.getCurrentSession()){

//            Department department = new Department("department name", 100.0, 1000.0 );
//            Employee employee = new Employee("Vlad", 500.0);
//            Employee employee1 = new Employee("Alex", 500.0);
//            Employee employee2 = new Employee("Sasha", 500.0);
//
//            department.addEmployee(employee);
//            department.addEmployee(employee1);
//            department.addEmployee(employee2);

            session.beginTransaction();
            //session.createQuery("delete Employee ").executeUpdate();
            //session.createQuery("delete Department").executeUpdate();
            Department department = session.get(Department.class, 5);
            department.getEmployees().get(0);
            session.getTransaction().commit();
            System.out.println(department);
        }
    }


}
