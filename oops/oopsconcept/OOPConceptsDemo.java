package oopsconcept;

import employee.Employee;
import immutable.ImmutableClass;
import manager.Manager;
import person.Person;
import seniormanager.SeniorManager;
import student.Student;

/**
 * Main class demonstrating all OOP concepts:
 * - Polymorphism
 * - Dynamic Method Dispatch
 * - Anonymous Objects
 * - Access Modifiers
 * - Packages (all classes in default package for simplicity)
 * - Naming Convention
 */
public class OOPConceptsDemo {
    public static void main(String[] args) {
        System.out.println("========== OOP CONCEPTS DEMONSTRATION ==========\n");
        
        // ===== Static Variable and Method Demo =====
        System.out.println("===== STATIC VARIABLE & METHOD =====");
        System.out.println("Static Students Count: " + Student.getTotalStudents());
        System.out.println("Institution: " + Student.getInstitutionName());
        
        // ===== Constructor & Encapsulation Demo =====
        System.out.println("\n===== CONSTRUCTOR & ENCAPSULATION =====");
        // Default Constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default): " + student1.getStudentName());
        
        // Parameterized Constructor
        Student student2 = new Student("John Doe", 101, 3.8, "john@email.com");
        System.out.println("Student 2 (Parameterized): " + student2.getStudentName());
        
        System.out.println("Total Students: " + Student.getTotalStudents());
        
        // ===== Getters and Setters Demo =====
        System.out.println("\n===== GETTERS & SETTERS =====");
        student1.setStudentName("Alice Smith");
        student1.setStudentId(102);
        student1.setCgpa(3.5);
        student1.setEmail("alice@email.com");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        
        // ===== Anonymous Object Demo =====
        System.out.println("\n===== ANONYMOUS OBJECT =====");
        // Anonymous object - created without storing reference
        new Student("Anonymous User", 103, 3.2, "anonymous@email.com").displayStudentInfo();
        System.out.println("Total Students: " + Student.getTotalStudents());
        
        // ===== Inheritance Demo =====
        System.out.println("\n===== INHERITANCE (SINGLE) =====");
        Employee emp1 = new Employee("Bob Wilson", 30, "EMP001", 50000);
        emp1.displayEmployeeInfo();
        emp1.work();
        
        // ===== Multilevel Inheritance Demo =====
        System.out.println("\n===== INHERITANCE (MULTILEVEL) =====");
        Manager mgr1 = new Manager("Carol Johnson", 35, "MGR001", 75000, 5, "IT");
        mgr1.displayManagerInfo();
        mgr1.work();
        
        // ===== Multiple Inheritance through Interfaces Demo =====
        System.out.println("\n===== MULTIPLE INHERITANCE (Through Interfaces) =====");
        SeniorManager seniorMgr = new SeniorManager("David Lee", 40, "SMGR001", 100000, 10, "Engineering");
        seniorMgr.work();
        seniorMgr.attend_training();
        seniorMgr.learnSkill("Leadership");
        seniorMgr.applyForPromotion();
        seniorMgr.getPromotionStatus();
        
        // ===== Polymorphism & Dynamic Method Dispatch Demo =====
        System.out.println("\n===== POLYMORPHISM & DYNAMIC METHOD DISPATCH =====");
        // Parent class reference can hold child class objects
        Person person1 = new Employee("Eve Brown", 28, "EMP002", 55000);
        Person person2 = new Manager("Frank Miller", 37, "MGR002", 80000, 8, "HR");
        Person person3 = new SeniorManager("Grace Watson", 42, "SMGR002", 110000, 12, "Finance");
        
        // Dynamic Method Dispatch - method called depends on actual object type
        person1.work();  // Calls Employee's work()
        person2.work();  // Calls Manager's work()
        person3.work();  // Calls SeniorManager's work()
        
        // ===== Final Keyword Demo =====
        System.out.println("\n===== FINAL KEYWORD =====");
        ImmutableClass immutable = new ImmutableClass("Immutable Object", 1, 100.5);
        immutable.displayInfo();
        System.out.println("Name: " + immutable.getName() + " (cannot be changed)");
        // This would cause error: immutable.name = "New Name";  // Cannot modify final variable
        
        // ===== Access Modifiers Demo =====
        System.out.println("\n===== ACCESS MODIFIERS =====");
        System.out.println("Protected 'name' in Person (accessible in subclasses):");
        // System.out.println("Employee name: " + emp1.name);
        //using getter method to access protected variable
        System.out.println("Employee name: " + emp1.getEmployeeName());
        // System.out.println("Manager name: " + mgr1.name);
        //using getter method to access protected variable
        System.out.println("Manager name: " + mgr1.getManagerName());
        
        System.out.println("\n========== DEMONSTRATION COMPLETE ==========");
    }
}
