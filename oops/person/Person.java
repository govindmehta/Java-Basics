package person;
/**
 * Parent Class: Demonstrates Need of Inheritance, What is Inheritance, Single Inheritance
 * Demonstrates: Method definition, Access modifiers
 */
public class Person {
    // Protected - Access Modifier (visible in same package and subclasses)
    protected String name;
    protected int age;
    
    // Public - Access Modifier (visible everywhere)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor called");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    
    // Method to be overridden
    public void work() {
        System.out.println(this.name + " is working");
    }
}
