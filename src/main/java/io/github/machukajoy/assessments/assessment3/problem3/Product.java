package io.github.machukajoy.assessments.assessment3.problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity)
            throws InvalidProductException {

        if (productId == null || productId.isEmpty()) {
            throw new InvalidProductException("Product ID is required");
        }
        if (price <= 0) {
            throw new InvalidProductException("Price must be positive");
        }
        if (stockQuantity < 0) {
            throw new InvalidProductException("Stock cannot be negative");
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();

    public abstract String getProductType();

    public double applyTax() {
        return price * 1.16; // 16% tax
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity <= 0) {
            throw new OutOfStockException("Invalid stock reduction amount");
        }
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock available");
        }
        stockQuantity -= quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Type: " + getProductType());
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stockQuantity);
    }
}
