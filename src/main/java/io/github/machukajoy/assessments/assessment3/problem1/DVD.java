package io.github.machukajoy.assessments.assessment3.problem1;

public class DVD extends LibraryItem {
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + duration + " mins, Rating: " + rating);
    }
}
