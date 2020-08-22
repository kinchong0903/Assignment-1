import java.util.ArrayList;

public class Order {
    // private ArrayList<Food> order = new ArrayList<Food>();
    private String restaurantName;
    private String paymentMethod;
    private String orderStatus;
    String[] status = new String[]{"Preparing","ready","collected"};

    public Order()
    {
        orderStatus = status[0];
    }
    
    // public Order(String restaurantName , ArrayList<Food> food, String paymentMethod)
    // {
    //     this.restaurantName = restaurantName;
    //     order.add(food);
    //     this.paymentMethod = paymentMethod;
    //     orderStatus = status[0];
    // }

    public void updateStatus(int i)
    {
        orderStatus = status[i];
    }

    public String getOrderStatus()
    {
        return orderStatus;
    }

    public String getPaymentMethod()
    {
        return paymentMethod;
    }

    public String getRestaurantName()
    {
        return restaurantName;
    }
}