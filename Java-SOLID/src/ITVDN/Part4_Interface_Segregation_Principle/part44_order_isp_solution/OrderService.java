package ITVDN.Part4_Interface_Segregation_Principle.part44_order_isp_solution;

public interface OrderService {
    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);
}
