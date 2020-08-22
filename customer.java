import java.util.ArrayList;

public class Customer 
{

    private String cus_name;
    private ArrayList<Order> cus_order = new ArrayList<>();
	
	public Customer()
	{}
	
	public Customer(String name)
	{
		cus_name = name;
	}
	
	// public void viewOrder()
	// {
    //     System.out.println("Food Order: ");
	// 	for (Order order: cus_order) {
    //         for(Food food : order)
    //         {
    //             System.out.println(food.name + "  , RM " + food.price);
    //         }
    //     }
    // }
    
    // public void placeOrder()
    // {
    //     Order order = new Order(Food<ArrayList> food);
    //     cus_order.add(order);
    // }

    public void cancelOrder(Order order)
    {
        for(Order item : cus_order)
        {
            if(item == order)
                cus_order.remove(item);
        }
    }

    public void saveToHistory(Order order)
    {
        String orderStatus = order.getOrderStatus();
        if( orderStatus.equals("Collected"))
        {
            cus_order.remove(order);
        }
    }

    public String toString()
    {
        return cus_name;
    }
}