import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrderManager {
    //is an interface in Java that provides methods to manage a pool of threads for running tasks concurrently
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public void processOrder(Order order) {
        executor.submit(() -> {
            try {
                System.out.println("Processing order " + order.getOrderId() + " for " + order.getQuantity() + " items.");
                TimeUnit.SECONDS.sleep(2); // Simulate processing time
                order.updateOrderStatus(Order.Status.SHIPPED);
                System.out.println("Order " + order.getOrderId() + " has been shipped.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
    public void shutdown() {
        executor.shutdown();
    }
    //here is the changes
    public void nameb1(){
        System.out.println("here is the change in b1");
    }
// here is b2 change
    public void nameb2(){
        System.out.println("here is the change in b2");
    }

}