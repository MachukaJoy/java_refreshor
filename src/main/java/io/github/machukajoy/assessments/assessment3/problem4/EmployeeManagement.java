package io.github.machukajoy.assessments.assessment3.problem4;

//public class EmployeeManagement {
//    public static String companyName;
//    private String employeeName;
//    private double salary;
//
//    public EmployeeManagement(String name) {
//        employeeName = name;
//    }
//
//    public double calculateBonus() {
//        return salary * 0.1;
//    }    public void setSalary(double salary) {
//        if (salary < 0) {
//            System.out.println("Salary cannot be negative");
//        }
//        salary = salary;
//    }
//public double calculateBonus() {
//    return salary * 0.1;
//}
//
//
//}

public class EmployeeManagement {
    private static String companyName; // make private
    private final String employeeName;
    private double salary;

    public EmployeeManagement(String employeeName, double salary) {
        if (employeeName == null || employeeName.isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    // Static set and get
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // Instance get methods
    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    // add validation with exception
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    // add return type double can't be void
    public double calculateBonus() {
        return salary * 0.1;
    }
}
