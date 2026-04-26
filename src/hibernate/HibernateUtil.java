package hibernate;

// -- This file is linked to employeeex example --

// we have to build Session Factory only once in a project,
// so for that we generally do is, we create a Util file in com.util package and use this util file everytime needed.
public class HibernateUtil {

    // we don't want to create new sessionFactory everytime. for that we handle like this.
    public static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            cfg.addAnnotatedClass(Employee.class);
            cfg.addAnnotatedClass(Car.class);

            sessionFactory =  cfg.buildSessionFactory();

            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}
