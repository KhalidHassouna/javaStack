import java.util.ArrayList ;

public class Order{
    private String name ;
    private boolean ready ;
    private ArrayList<Item> items ;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList();
        
    }
    public Order(String name){
        this.name = name ;
        this.items = new ArrayList();
        
    }

    public String getOrderName(){
        return this.name ;
    }

    public void setOrderName(String name){
        this.name = name ;
    }

    public boolean getStatus(){
        return this.ready ;
    }

    public void setStatus(boolean ready){
        this.ready = ready ;
    }

    public ArrayList<Item> getItems(){
        return this.items ;
    }

    public void setIems(ArrayList<Item> items){
        this.items =items ;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public String statusMessage(){
        if(this.ready){
            return ("youre order is ready");
        }
        return ("your order will be ready soon !");
    }

    public double getOrderTotal(){
        double total = 0.0 ;
        for(Item item : items){
            total += item.getItemPrice() ;
        }
        return total ;
    }

    public void display(){
        System.out.println("customer name : "+this.name) ;
        
        for(Item item : items){
            System.out.println(item.getItemName()+ "_"+item.getItemPrice()+"$");
        }
        System.out.println("total : "+getOrderTotal()+" $");
    }

}   