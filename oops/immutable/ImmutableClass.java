package immutable;

/**
 * Demonstrates Final keyword
 * final classes cannot be extended (inherited)
 * final methods cannot be overridden
 * final variables cannot be modified
 */
public final class ImmutableClass {
    // Final variable - cannot be modified
    private final String name;
    private final int id;
    private final double value;
    
    // Constructor
    public ImmutableClass(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }
    
    // Final method - cannot be overridden
    public final void displayInfo() {
        System.out.println("Name: " + this.name + ", ID: " + this.id + ", Value: " + this.value);
    }
    
    // Getters (no setters for immutability)
    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public double getValue() {
        return this.value;
    }
}

// This would cause compilation error:
// public class ExtendedClass extends ImmutableClass { }  // Cannot extend final class
