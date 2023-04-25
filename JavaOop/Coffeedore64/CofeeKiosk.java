import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders= new ArrayList<Order>();
    
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();

    }

    public void addMenuItem(String name,double price){
        Item item = new Item(name , price);
        menu.add(item);

    }
}
