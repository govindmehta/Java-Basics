package seniormanager;

import manager.Manager;

/**
 * Class implementing multiple interfaces: Demonstrates Multiple Inheritance through interfaces
 */
public class SeniorManager extends Manager implements Trainable, Promotable {
    private boolean promotionEligible;
    private boolean trainingCompleted;
    
    // Constructor
    public SeniorManager(String name, int age, String employeeId, double salary,
                        int teamSize, String department) {
        super(name, age, employeeId, salary, teamSize, department);
        this.promotionEligible = false;
        this.trainingCompleted = false;
        System.out.println("SeniorManager Constructor called");
    }
    
    // Implementing Trainable interface methods
    @Override
    public void attend_training() {
        System.out.println(this.name + " is attending training program");
        this.trainingCompleted = true;
    }
    
    @Override
    public void learnSkill(String skill) {
        System.out.println(this.name + " is learning skill: " + skill);
    }
    
    // Implementing Promotable interface methods
    @Override
    public void applyForPromotion() {
        System.out.println(this.name + " has applied for promotion");
    }
    
    @Override
    public void getPromotionStatus() {
        System.out.println("Promotion Status: " + (this.promotionEligible ? "Eligible" : "Not Eligible"));
    }
    
    // Method Overriding
    @Override
    public void work() {
        System.out.println(this.name + " is working as Senior Manager");
    }
}
