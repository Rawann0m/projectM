import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        OrderManager orderManager = new OrderManager();

        // Adding sample products
        Product laptop = new Product(UUID.randomUUID(), "Laptop", 1200.0, 20, 5);
        Product smartphone = new Product(UUID.randomUUID(), "Smartphone", 800.0, 10, 3);
        inventory.addProduct(laptop);
        inventory.addProduct(smartphone);

        // User input for stock predictions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average daily sales for Laptop: ");
        int laptopSales = scanner.nextInt();
        System.out.print("Enter average daily sales for Smartphone: ");
        int smartphoneSales = scanner.nextInt();

        // Display product details and stock prediction
        displayProductDetails(laptop);
        StockPredictor predictor = new StockPredictor();
        predictor.predictStockDepletion(laptop, laptopSales);

        displayProductDetails(smartphone);
        predictor.predictStockDepletion(smartphone, smartphoneSales);

        // Creating and processing orders
        Order order1 = new Order(UUID.randomUUID(), "Alice", laptop.getProductId(), 1);
        Order order2 = new Order(UUID.randomUUID(), "Bob", smartphone.getProductId(), 2);

        orderManager.processOrder(order1);
        orderManager.processOrder(order2);

        orderManager.shutdown(); // Shutdown executor
        scanner.close();
    }

    // Method to display product details in the format you want
    public static void displayProductDetails(Product product) {
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock Level: " + product.getStockLevel());
        System.out.println("Reorder Threshold: " + product.getReorderThreshold());
        System.out.println("----------------------------");
    }
}