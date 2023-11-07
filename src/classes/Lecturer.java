package classes;

public class Lecturer {
    // Instance variables
    private String firstName;
    private String lastName;
    private String employeeId;
    private String department;

    // Constructor
    public Lecturer(String firstName, String lastName, String employeeId, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    // Setter methods (optional)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override toString() method for better object representation
    @Override
    public String toString() {
        return "Lecturer [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", department=" + department + "]";
    }
}

