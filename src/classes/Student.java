package classes;

public class Student {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;

    // Constructor
    public Student(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods (optional)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Override toString() method for better object representation
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", studentId=" + studentId + "]";
    }
}
