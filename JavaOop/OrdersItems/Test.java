import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items();
        Items item2 = new Items();
        Items item3 = new Items();
        Items item4 = new Items();

        item1.name = "mocha";
        item1.price = 12.2;
        item2.name = "latte";
        item2.price = 10.5;
        item3.name = "drip cofee";
        item3.price = 15.5;
        item4.name = "capuccino";
        item4.price = 13.8;


    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name="cindhuri";
        order2.name="jimmy";
        order3.name="noah";
        order4.name="sam";

        order2.items.add(item1);
        order2.total+= item1.price;
        System.out.println(order2.total);
        order3.items.add(item4);
        order3.total+= item4.price;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total+= 3*item2.price;
        System.out.println(order4.total);

        order1.ready= true ;
        order2.ready= true ;







    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    // }
}
}