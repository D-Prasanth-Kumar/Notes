package hibernate.CompositePrimaryKey_NamedQueries_Mappings.NamedQueries;

import hibernate.HibernateUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        // here we include the name for the command which we declared in the annotation
        Query<Product> query = session.createNamedQuery("allproducts", Product.class);

        List<Product> list = query.list();

        System.out.println(list);
    }
}
