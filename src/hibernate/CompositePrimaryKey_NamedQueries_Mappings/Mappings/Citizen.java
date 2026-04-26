package hibernate.CompositePrimaryKey_NamedQueries_Mappings.Mappings;

@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @Column(name = "citizen_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citizenId;

    @Column(nullable = false, unique = true) // Not Null, Unique - constraint
    private String name;

    private int age;

    // Every citizen 'has a' Aadhar
    // To mention the Foreign Key we use @JoinColumn annotation
    @OneToOne(cascade = CascadeType.PERSIST)         // as it is One to One Mapping
    @JoinColumn(name = "aadhar_id")
    private Aadhar aadhar;

    public Citizen(int citizenId, String name, Aadhar aadhar, int age) {
        this.citizenId = citizenId;
        this.name = name;
        this.aadhar = aadhar;
        this.age = age;
    }

    public Citizen(String name, int age, Aadhar aadhar) {
        this.name = name;
        this.age = age;
        this.aadhar = aadhar;
    }

    public Citizen() {

    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenId=" + citizenId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", aadhar=" + aadhar +
                '}';
    }
}
