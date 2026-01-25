package io.github.machukajoy.assessments.assessment2.quiz2;

public class Manager extends Employee {

    private String department;

    // Constructor using super
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // call Employee constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Override calculateBonus (15%)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    // Override displayInfo to add department
    @Override
    public void displayInfo() {
        super.displayInfo(); // reuse Employee display
        System.out.println("Department: " + department);
    }
}

