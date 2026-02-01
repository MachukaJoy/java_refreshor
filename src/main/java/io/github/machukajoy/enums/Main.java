package io.github.machukajoy.enums;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        days of a week

//        Sat,saturday, sat, saturday
        System.out.println(matches("Sat", "sat"));
        System.out.println();

    }

    public static boolean matches(String day, String anotherDay) {
        return day.equalsIgnoreCase(anotherDay);
    }
}
