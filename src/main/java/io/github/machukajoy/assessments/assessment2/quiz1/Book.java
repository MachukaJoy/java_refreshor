package io.github.machukajoy.assessments.assessment2.quiz1;

public class Book {
    // Private fields
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    // Constructor (uses setters for validation)
    public Book(String title, String author, String isbn, double price) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = true; // default state
    }

    // Getters and setters with validation

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && isbn.matches("\\d{13}")) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("ISBN must be exactly 13 digits");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book method
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    // Return book method
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    // toString method
    @Override
    public String toString() {
        return "Book {" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Price=" + price +
                ", Available=" + isAvailable +
                '}';
    }
}
