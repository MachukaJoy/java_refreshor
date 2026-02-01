package io.github.machukajoy.assessments.assessment3.problem3;

public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stockQuantity,
                 String author, String publisher, String isbn)
            throws InvalidProductException {

        super(productId, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }

    @Override
    public String getProductType() {
        return "Books";
    }
}
