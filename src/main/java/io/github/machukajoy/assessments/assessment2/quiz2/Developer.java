package io.github.machukajoy.assessments.assessment2.quiz2;

public class Developer extends Employee {

    private String programmingLanguage;

    // Constructor using super
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // call Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Override calculateBonus (10%)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    // Override displayInfo to add programming language
    @Override
    public void displayInfo() {
        super.displayInfo(); // reuse Employee display
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
