package hibernate;

public class HibernateConnection {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // to which class we mentioned with '@Entity' annotation
        // we need to call this .addAnnotatedClass method and pass that class.
        cfg.addAnnotatedClass(Students.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        // as we know we should create a class file which resembles the table in database and we use
        // that class file as table here and perform operations. here Students class = table
        Students st1 = new Students(1, "Prasanth", 35);
        session.persist(st1);

        session.getTransaction().commit();
    }
}
