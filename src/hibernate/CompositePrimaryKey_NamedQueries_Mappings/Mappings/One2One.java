package hibernate.CompositePrimaryKey_NamedQueries_Mappings.Mappings;

import hibernate.HibernateUtil;

public class One2One {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();


    }

    private static void selectCitizen(Session session) {
        Citizen citizen = session.find(Citizen.class, 2);

        System.out.println(citizen);

        // In SQL the command is,
        // SELECT c.name, c.age, a.aadharNumber, a.fatherName
        // from Citizens c
        // join on aadhar a
        // on c.aadhar_id = a.aadharNumber
        // where c.citizen_id = 2;
    }

    private static void insert(Session session) {
        Citizen citizen1 = new Citizen("Prasanth", 20, new Aadhar(1234, "XYZ"));

        session.beginTransaction();

        session.persist(citizen1);

        session.getTransaction().commit();
    }
}
