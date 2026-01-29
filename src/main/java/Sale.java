import jdk.jshell.spi.ExecutionControl;

import java.time.Instant;

public class Sale {
    private int id;
    private Instant creationDateTime;
    private  Order order;

    public Sale(int id, Instant creationDateTime, Order order) {
        this.id = id;
        this.creationDateTime = creationDateTime;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public Instant getCreationDateTime() {
        return creationDateTime;
    }

    public Order getOrder() {
        return order;
    }

    Sale createSaleFrom(Order order) {
      throw new RuntimeException("Not implemented yet");
    };
}
