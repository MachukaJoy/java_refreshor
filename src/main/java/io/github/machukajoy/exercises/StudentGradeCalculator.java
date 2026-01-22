package io.github.machukajoy.exercises;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        double[] grades = {85, 92, 98, 90};
        printGradeReport("Joy Machuka", grades);
    }

    public static double calculateAverage(double[] grades) {
        int sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public static double findHighestGrade(double[] grades) {
        double highest = grades[0];
        for (double g : grades) {
            if (g > highest) {
                highest = g;
            }
        }
        return highest;
    }

    public static double findLowestGrade(double[] grades) {
        double lowest = grades[0];
        for (double g : grades) {
            if (g < lowest) {
                lowest = g;
            }
        }
        return lowest;
    }

    public static char getGradeLetter(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public static void printGradeReport(String name, double[] grades) {
        double average = calculateAverage(grades);
        double highest = findHighestGrade(grades);
        double lowest = findLowestGrade(grades);
        char letter = getGradeLetter(average);

        System.out.println("Student: " + name);
        System.out.print("Grades: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Average: " + average + " (" + letter + ")");
        System.out.println("Highest: " + highest + ", Lowest: " + lowest);
    }
}
