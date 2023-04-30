public class Test{
    public static void main(String[] args){
    Order order1 = new Order();
    Order order2 = new Order();
    // System.out.println(order2.getOrderName());
    // System.out.println(order2.getOrderTotal());
    Order order3 = new Order("Khalid");
    Order order4 = new Order("Ahmad");
    Order order5 = new Order("Yousf");
    // System.out.println(order3.getOrderName());
    Item item1 = new Item("Cofee",10.0);
    Item item2 = new Item("Tea",8.5);
    Item item3 = new Item("Latte",15.0);
    Item item4 = new Item("Orange Juice",22.5);
    Item item5 = new Item("Mokka",16.5);
    Item item6 = new Item("Cheesecake",35.0);

    order3.addItem(item6);
    order3.addItem(item1);
    order3.addItem(item5);
    order5.addItem(item2);
    order4.addItem(item1);
    order4.addItem(item3);
    order2.addItem(item5);
    order2.addItem(item4);
    order1.addItem(item3);

    // order1.display();
    // System.out.println(order5.getOrderTotal());

    order3.setStatus(true);
    System.out.println(order3.getStatus());
    order3.display();
    System.out.println(order3.statusMessage());


    }
    
}