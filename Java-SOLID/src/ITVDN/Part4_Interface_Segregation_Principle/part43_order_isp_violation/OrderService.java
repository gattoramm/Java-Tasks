package ITVDN.Part4_Interface_Segregation_Principle.part43_order_isp_violation;

public interface OrderService {
    Order createOrder();                // Frontend part

    Order amendOrder();                 // Frontend part

    boolean cancelOrder(int orderId);   // Frontend part

    Order submitOrder(int orderId);     // Frontend part

    Order getOrder(int orderId);        // Frontend part

    boolean processOrder(int orderId);  // Backend part
}
