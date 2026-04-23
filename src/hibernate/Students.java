package hibernate;

@Entity
public class Students {

    @Id
    private int studentId;

    private String name;

    private int marks;

    public Students(int studentId, String name, int marks) {
        super();
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public Students() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // also include a toString method , which helps in instead of printing hashcode
    // we can get the exact values getting printed.
}
