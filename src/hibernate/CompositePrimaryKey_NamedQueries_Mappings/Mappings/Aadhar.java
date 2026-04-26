package hibernate.CompositePrimaryKey_NamedQueries_Mappings.Mappings;

@Entity
public class Aadhar {

    @Id
    private long aadharNumber;

    private String fatherName;

    @OneToOne(mappedBy = "aadhar")    // this will ignore creating a new column in the aadhar table. (aadhar is var name in Citizen class)
    private Citizen citizen;          // this field defines bidirectional

    public Aadhar(long aadharNumber, String fatherName) {
        this.aadharNumber = aadharNumber;
        this.fatherName = fatherName;
    }

    public Aadhar() {

    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "aadharNumber=" + aadharNumber +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
