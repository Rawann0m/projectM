import java.util.UUID;

public class Product {
    private UUID productId;
    private String name;
    private double price;
    private int stockLevel;
    private int reorderThreshold;

    //constructor
    public Product(UUID productId, String name, double price, int stockLevel, int reorderThreshold) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;
    }

    public UUID getProductId() {
        return productId; }
    public String getName() {
        return name; }
    public double getPrice() {
        return price; }
    public int getStockLevel() {
        return stockLevel; }
    public int getReorderThreshold() {
        return reorderThreshold; }
    //it will update the stock after each sale
    public void reduceStock(int quantity) {
        this.stockLevel -= quantity;
    }
}