package hibernate.CompositePrimaryKey_NamedQueries_Mappings.CompositePrimaryKey;

import hibernate.HibernateUtil;

public class Application {
    pubic static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        CarId carId = new CarId(123, 456);
        Car car1 = new Car(carId, "Altroz", "TaTa", 800000);

        session.persist(car1);

        // if want to do select with composite key, as we select using primary key,
        // CarId carId = new CarId(123, 456);
        // Car car = session.find(Car.class, carId);
        // System.out.println(car);

        session.getTransaction().commit();
    }
}
