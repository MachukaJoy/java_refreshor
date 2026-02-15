package io.github.machukajoy.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        lambdaSyntaxAndFunctionalInterface();
        commonBuiltInFunctionalInterfaces();
    }

    private static void commonBuiltInFunctionalInterfaces() {
        System.out.println("================Predicates=============");
        predicates();
        System.out.println("================Functions=============");
        functions();
        System.out.println("================Consumers=============");
        Main main = new Main();
        main.consumers();
        System.out.println("================Suppliers=============");
        suppliers();
        System.out.println("================UnaryOperator=============");
        unaryOperator();
        System.out.println("================BinaryOperator=============");
        binaryOperator();

    }

    private static void binaryOperator() {
        BinaryOperator<Integer> productBinaryOperator = (firstNo, secondNo) ->
                firstNo * secondNo;
        System.out.println(productBinaryOperator.apply(3, 9));

    }

    private static void unaryOperator() {
        List<String> myListOfStrings = List.of("I love java ", "java is cool ", "My password ");
        UnaryOperator<String> unaryOperator = t -> t.toLowerCase();

        for (String string : myListOfStrings) {
            System.out.println(string + " has trimmed length " + string.length() + "-> " + unaryOperator.apply(string));
        }
    }

    private static void suppliers() {
        Supplier<RuntimeException> supplier = () -> new RuntimeException("my supplied exception");
        System.out.println(supplier.get().getLocalizedMessage());
    }

    private static void functions() {
        Function<String, Integer> function = t -> t.trim().length();

        List<String> myListOfStrings = List.of("I love java ", "java is cool ", "My password ");
        for (String string : myListOfStrings) {
            System.out.println(string + " has trimmed length " + string.length() + "-> " + function.apply(string));
        }

        Function<String, String> upperFunction = String::toUpperCase;
        for (String string : myListOfStrings) {
            System.out.println(string + "-> " + upperFunction.apply(string));
        }
    }

    private static void predicates() {
        Predicate<Integer> isEvenPredicate = t -> t % 2 == 0;// t%2==0;
//            return t % 2 == 0;
//        };
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (Integer num : numbers) {
            System.out.println(num + " is even " + isEvenPredicate.test(num));
        }
    }

    private static void lambdaSyntaxAndFunctionalInterface() {
        Export pdfExport = new PdfExport();
        pdfExport.export(" I have learnt interesting java topics");

        Export powerPoint = new PptExport();
        powerPoint.export(" I have becoming");

        Export htmlExport = new Export() {
            @Override
            public void export(String content) {
                System.out.println("Exporting to html " + content);
            }
        };
        htmlExport.export("Java is awesome");

        Export pngExport = (content) -> System.out.println("Exporting to png " + content);
        pngExport.export("This is an awesome image");

        // More parameters
        Printer printer = new Printer() {
            @Override
            public String print(String content, String path) {
                System.out.println("Printing " + content + "to " + path);
                return content;
            }
        };

        Printer printerInLambda = (content, path) -> {
            System.out.println("Printing " + content + "to " + path);
            return "success";
        };

        printerInLambda.print("Hello world ", " Console");
    }

    public static void printPhoneNameLength(Phone phone) {
        System.out.println(phone.getName().length());
    }

    private void consumers() {
        List<Phone> phones = List.of(
                new Phone("Samsung note8", "Samsung", 2000),
                new Phone("Oppo A51", "Oppo", 2015),
                new Phone("Iphone 17", "Apple", 2024)
        );
        Consumer<Phone> phoneConsumer = phone -> System.out.println(phone.getName() + " " + phone.getYear());
//        for (Phone phone : phones) {
//            phoneConsumer.accept(phone);
//        }

        phones.forEach(phoneConsumer);

        phones.forEach(phone -> System.out.println(phone.getName().toUpperCase()));
        phones.forEach(phone -> Utility.printToUpperCase(phone));
        System.out.println("================Method References start=============");
        phones.forEach(Utility::printToUpperCase);
        phones.forEach(Main::printPhoneNameLength); // when the functiom is static
        System.out.println("================Method References start=============");
    }
}
