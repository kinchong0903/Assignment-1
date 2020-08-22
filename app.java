import java.util.*;

//can discuss with Wing Kin to do log in and log out system...

public class app {
    public static void main(String[] args)
    {
        boolean loop = true;
        ArrayList<Customer> cus_list = new ArrayList<>();

        do
        {
            int i = 0;
            mainMenu();
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            input.nextLine();
            while(i == 1)
            {
                String userName = input.nextLine();
                Customer cus = new Customer(userName);
                cus_list.add(cus);
                System.out.println("Customer successfully created!");
                System.out.println(cus.toString());
                for (Customer customer : cus_list) {
                    System.out.println(customer.toString());
                }
                break;
            }
 
            // else if(i == 2)
            //     thirdMenu();
            // else
            //     wrongInput();

        }while(loop == true);
    }

    public static void mainMenu()
    {
        System.out.println("Welcome to Food Delivery");
        System.out.println("1. Customer");
        System.out.println("2. Restaurant");
        System.out.print("Please choose your user type... ");
    }

    public static void secMenu()
    {
        System.out.println("second page(customer)...");
    }

    public static void thirdMenu()
    {
        System.out.println("third page(restaurant)...");
    }

    public static void wrongInput()
    {
        System.out.println("Wrong input, please enter the correct input...");
    }
}


