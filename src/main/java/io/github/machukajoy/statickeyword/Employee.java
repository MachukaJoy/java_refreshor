package io.github.machukajoy.statickeyword;

public class Employee {
    // Constants - static final
    public static final String COMPANY_NAME = "Tech Corp";
    // Static variable - shared by all Employee objects
    private static int employeeCount = 0;
    // Instance variables - unique to each object
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
// Increment shared counter
    }

    public static String getFullName() {
        return "fullname";
    }

    // Static method to access static variable
    public static int getEmployeeCount() {
//        System.out.println(name); // cannot access instance variable directly
        //get it from an object Cannot call static methods directly
//        this.name = "Joy"; // cannot use this on static methods
        return employeeCount;
    }

    // Getters
    public String getName() {
        return name;


    }

    public int getId() {
        return id;
    }
}