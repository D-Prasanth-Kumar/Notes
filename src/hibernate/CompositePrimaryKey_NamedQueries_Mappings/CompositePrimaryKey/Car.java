package hibernate.CompositePrimaryKey_NamedQueries_Mappings.CompositePrimaryKey;

@Entity
public class Car {

    @EmbeddedId   // -> for CompositeKey
    private CarId carId;    // it is has-a relationship

    private String model;   // it is has-a relationship

    private String company;

    private int price;

    public Car() {

    }

    public Car(CarId carId, String model, String company, int price) {
        this.carId = carId;
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
