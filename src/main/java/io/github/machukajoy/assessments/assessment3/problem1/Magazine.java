package io.github.machukajoy.assessments.assessment3.problem1;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Issue " + issueNumber + ", Date: " + publicationDate);
    }
}
