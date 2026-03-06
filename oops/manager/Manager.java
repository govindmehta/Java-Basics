package manager;
import employee.Employee;

/**
 * Grandchild Class: Demonstrates Multilevel Inheritance
 * Person -> Employee -> Manager (multilevel)
 */
public class Manager extends Employee {
    private int teamSize;
    private String department;
    
    // Parameterized Constructor
    public Manager(String name, int age, String employeeId, double salary, 
                   int teamSize, String department) {
        // Super keyword calls parent class constructor
        super(name, age, employeeId, salary);
        
        this.teamSize = teamSize;
        this.department = department;
        System.out.println("Manager Constructor called");
    }
    
    // Getters
    public int getTeamSize() {
        return this.teamSize;
    }
    
    public String getDepartment() {
        return this.department;
    }

    public String getManagerName() {
        // Accessing parent class variable using super
        return super.name;
    }
    
    // Method Overriding - Dynamic Method Dispatch
    @Override
    public void work() {
        System.out.println(this.name + " is managing team of " + this.teamSize + 
                         " people in " + this.department + " department");
    }
    
    public void displayManagerInfo() {
        super.displayEmployeeInfo();
        System.out.println("Team Size: " + this.teamSize + ", Department: " + this.department);
    }
}
