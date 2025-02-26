import java.util.UUID;

public class Order {
    public enum Status {PENDING, SHIPPED, DELIVERED}

    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private Status orderStatus;

    //constructor
    public Order(UUID orderId, String customerName, UUID productId, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.orderStatus = Status.PENDING;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatus(Status status) {
        this.orderStatus = status;
    }
}