package io.github.machukajoy.assessments.assessment3.problem1;

public class Book extends LibraryItem {
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + isbn + ", Genre: " + genre);
    }
}
