package student;
/**
 * Demonstrates: Encapsulation, Getters and Setters, This keyword, Constructor,
 * Naming Convention, Static Variable, Static Block, Static Method
 */
public class Student {
    // Static variable - shared across all instances
    private static int totalStudents = 0;
    private static final String INSTITUTION_NAME = "XYZ University";
    
    // Static block - executes once when class is loaded
    static {
        System.out.println("Static Block: Class loaded! Institution: " + INSTITUTION_NAME);
        totalStudents = 0;
    }
    
    // Instance variables - encapsulated (private)
    private String studentName;  // Naming Convention: camelCase for variables
    private int studentId;
    private double cgpa;
    private String email;
    
    // Constructor - Default Constructor (no parameters)
    public Student() {
        this.studentName = "Unknown";
        this.studentId = 0;
        this.cgpa = 0.0;
        this.email = "unknown@email.com";
        totalStudents++;
    }
    
    // Constructor - Parameterized Constructor
    public Student(String studentName, int studentId, double cgpa, String email) {
        // This keyword - refers to current object
        this.studentName = studentName;
        this.studentId = studentId;
        this.cgpa = cgpa;
        this.email = email;
        totalStudents++;
    }
    
    // Getters and Setters - for Encapsulation
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public double getCgpa() {
        return this.cgpa;
    }
    
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA!");
        }
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Static method - can be called without creating object instance
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public static String getInstitutionName() {
        return INSTITUTION_NAME;
    }
    
    // Instance method - requires object instance
    public void displayStudentInfo() {
        System.out.println("Student: " + this.studentName + 
                         ", ID: " + this.studentId + 
                         ", CGPA: " + this.cgpa + 
                         ", Email: " + this.email);
    }
}
