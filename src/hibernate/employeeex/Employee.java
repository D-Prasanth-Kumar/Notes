package hibernate.employeeex;

// we generally write this file inside, com.entity or com.model package

@Entity
// if table name doesn't match with class name. Ex: in db table name is employees, but the class name is Employee.
// we use @Table annotation to explicitly map that.
@Table(name = "employees")
public class Employee {

    @Id
    // if in table, the column name doesn't match with the field in the class.
    // Ex: in db table, the column name is empId, but in class the field is mentioned as employeeId;
    // we use @Column annotation to explicitly map that.
    @Column(name = "empId")
    private int employeeId;

    @Column(name = "empName")
    private String employeeName;

    private int salary;

    public Employee(int employeeId, String employeeName, int salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    // Getters and Setter and toString()
}
