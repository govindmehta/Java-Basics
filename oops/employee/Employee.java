package employee;
import person.Person;

/**
 * Child Class: Demonstrates Single Inheritance, Method Overriding, Super keyword
 * This and Super method
 */
public class Employee extends Person {
    private String employeeId;
    private double salary;
    
    // Parameterized Constructor
    public Employee(String name, int age, String employeeId, double salary) {
        // Super keyword - calls parent class constructor (this and super method)
        super(name, age);
        
        // This keyword - refers to current object
        this.employeeId = employeeId;
        this.salary = salary;
        System.out.println("Employee Constructor called");
    }
    
    // Getters and Setters
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        // Accessing parent class variable using super
        return super.name;
    }
    
    // Method Overriding - Polymorphism
    @Override
    public void work() {
        System.out.println(this.name + " is working as employee with ID: " + this.employeeId);
    }
    
    // Display all info
    public void displayEmployeeInfo() {
        // Calling parent class method using super
        super.displayInfo();
        System.out.println("Employee ID: " + this.employeeId + ", Salary: " + this.salary);
    }
}
