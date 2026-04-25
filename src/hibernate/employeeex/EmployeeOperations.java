package hibernate.employeeex;

// generally we write this file inside, com.service
public class EmployeeOperations {
    public static void main(String[] args) {

        // instead of writing all the configuration here,
        // we just call the method of the HibernateUtil file which handles the sessionFactory config and gives the sessionFactory
        SessionFactory sessionFactory = HibernateUtil.getgetSessionFactory();

        Session session = sessionFactory.openSession();

        // methods for operations ->
        // Insert - Persist
        // Select - find
        // Delete - remove
        // Update - merge

        // At last we close session. -----> session.close();


        // -- the limitation is, there will be no any findAll in hibernate
        // we can't get select * from employees.
        // we can get that in JPA
        // --
    }

    private static void insert(Session session) {
        session.beginTransaction();
        Employee emp = new Employee(1, "Prasanth", 10000);
        session.persis(emp);
        session.getTransaction().commit();
    }

    private static void update(Session session) {
        session.beginTransaction();
        Employee emp = session.find(Employee.class, 1);
        emp.setSalary(30000);
        session.merge(emp);
        session.getTransaction().commit();
    }

    private static void delete(Session session) {
        session.beginTransaction();
        Employee emp = new Employee(2, "", 0); // we can also do -> Employee emp = session.find(Employee.class, 2);
        session.remove(emp);
        session.getTransaction().commit();
    }

    // for select we don't need to begin and commit the transaction,
    // as for checking the details is not a transaction, it is not required to begin and commit transaction
    private static void select(Session session) {
        //DQL
        Employee employee = session.find(Employee.class, 1);  // it resembles to -> select * from employees where id = 1;
        System.out.println(employee);
    }
}
