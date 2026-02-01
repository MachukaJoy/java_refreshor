package io.github.machukajoy.assessments.assessment3.problem1;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " checked out.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    public void returnItem() {
        isAvailable = true;
    }

    public abstract void displayDetails();

}
