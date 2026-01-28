package io.github.machukajoy.statickeyword;

import io.github.machukajoy.polyabstract.Animal;

//static - belongs to the class not to individual objects
public class Main {

    static {
        System.out.println("Main Class loaded");
    }

    public static void main(String[] args) {

        staticDemo();
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Cow moos!!");

            }
        };

        animal.makeSound();
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();





        /*System.out.println(Config.DB_PASSOWRD);
        var app = new Main();
        app.connection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSOWRD);
        DatabaseConfig.displayConfig();
        DatabaseConfig.displayConfig();

        System.out.println(MathUtility.Adder.add(23, 4, 5, 56, 7));

//        nnested static c;lasses
        System.out.println(MathUtility.AreaCalculator.circleArea(5));


//        nested non-static classes
        MathUtility mathUtility = new MathUtility();
        MathUtility.NonStaticClass nonStaticClass = mathUtility.new NonStaticClass();
        nonStaticClass.printMessage("good morrning", "Joy");
        LocalClassDemo localClassDemo = new LocalClassDemo();
        localClassDemo.processData();*/
    }

    private static void staticDemo() {
        System.out.println(Employee.COMPANY_NAME);
        Employee wesMut = new Employee("wesMut", 1);
        Employee eve = new Employee("eve", 1);
        System.out.println(eve.getEmployeeCount());
        System.out.println(Math.pow(5, 2));


    }

    private String connection(String dbUrl, String username, String password) {
        return "";
    }
}
