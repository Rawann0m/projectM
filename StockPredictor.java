public class StockPredictor {
    //predict when a product stock will run out
    public void predictStockDepletion(Product product, int dailySales) {
        int daysUntilOut = product.getStockLevel() / dailySales;
        String suggestion = daysUntilOut <= product.getReorderThreshold() ? "Urgent: Restock immediately!" : "Moderate: Consider restocking soon.";

        System.out.println("Stock Prediction for " + product.getName() + ":");
        System.out.println("Days until stock out: " + daysUntilOut);
        System.out.println("Restock Suggestion: " + suggestion);
    }
}