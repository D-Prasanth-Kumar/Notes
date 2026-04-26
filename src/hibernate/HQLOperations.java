// In HQL, we pass the names which are included in Java, not DB.
package hibernate;
// DQL - SELECT -> we use -> .createSelectionQuery();
// DML - For all DML -> we use -> .createMutationQuery();

public class HQLOperations {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // instead of Select p from Product p -- we can just write- From Product
        SelectionQuery<Product> query = session.createSelectionQuery("Select p from Product p", Product.class);
        // we can also write the queries dynamically by,
        // "From Product where id = ?1 and name = ?2"
        // -- and now we set the values, --
        // query.setParameter(1, 3);
        // query.setParameter(2, "Sofa");

        List<Product> products = query.list();
        System.out.println(products);

    }

    private static void delete(Session session) {
        session.beginTransaction();

        MutationQuery mutationQuery = session.mutationQuery("Delete from Product where id = ?1");
        mutationQuery.setParameter(1, 6);

        mutationQuery.executeUpdate();

        session.getTransaction().commit();
    }

    private static void update(Session session) {
        session.beginTransacioin();

        MutationQuery mutationQuery = session.createMutationQuery("Update Product set name = ?1 where id = ?2");
        mutationQuery.setParameter(1, "Air Conditioner");
        mutationQuery.setParameter(2, 5);

        mutationQuery.executeUpdate();

        session.getTransaction().commit();
    }

    private static void insertValue(Session session) {
        session.beginTransaction();

        session.createMutationQuery("Insert into Product(id, name, category) values(?1, ?2, ?3)");
        mutationQuery.setParameter(1, 5);
        mutationQuery.setParameter(2, "AC");
        mutationQuery.setParameter(3, "Electronics");

        mutationQuery.executeUpdate();

        session.getTransaction().commit();
    }
}
