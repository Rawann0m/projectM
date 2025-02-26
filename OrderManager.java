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
    // here is feature brach
    public void shutdown() {
        executor.shutdown();
    }
public void name(){
    System.out.println("here is branch 1");
}
    public void name2(){
        System.out.println("here is branch 2");
    }
    public void nameb2(){
        System.out.println("here is branch 2");
    }
}