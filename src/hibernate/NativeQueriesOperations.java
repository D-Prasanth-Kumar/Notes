// we can write SQL in Hibernate too (HQL)
// Native Queries -> SQL Queries (we write direct SQL commands here)
// here we only write the column names which are included in DB.
package hibernate;

public class NativeQueriesOperations {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

    }

    private static void insert(Session session) {
        session.beginTransaction();

        MutationQuery mutationQuery = session.createNativeMutationQuery("insert into products values(?1, ?2, ?3)");
        mutationQuery.setParameter(1, 8);
        mutationQuery.setParameter(2, "Shirt");
        mutationQuery.setParameter(3, "Clothes");

        mutationQuery.executeUpdate();

        session.getTransaction().commit();
    }

    private static void selectAll(Session session) {
        NativeQuery<Product> nativeQuery = session.createNativeQuery("Select * from products", Product.class);

        List<Product> list = nativeQuery.list();

        System.out.println(list);
    }
}
