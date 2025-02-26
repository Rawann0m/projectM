import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Inventory {
    //Each entry in a Map contains a key and a value
    private final Map<UUID, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public Product getProduct(UUID productId) {
        return products.get(productId);
    }
}