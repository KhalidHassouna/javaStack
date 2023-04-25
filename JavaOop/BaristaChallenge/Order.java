import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public  Order() {
        this.name="Guest";
        this.ready= false;
        this.items= new ArrayList<Item>();

    }
    

    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public  Order(String name) {
        this.name=name;
        this.ready= false;
        this.items= new ArrayList<Item>();

    }
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
        public void addItem (Item items){
            this.items.add(items);
        }
        public String getStatusMessage(){
            if (ready){
                return "Your order is ready.";
            }
            else {
                return "thank you for waiting. Your order will be ready soon.";
            } 
        }

        public double getOrderTotal(){
            double total = 0.0 ;
            for(Item item : items){
                total += item.getprice();
            }
            return total ;

        }
        public void display(){
            System.out.println("customer name : "+this.name );
            for(Item item : items){
                System.out.println(item.getname()+" - $"+item.getprice());
                
                }
            
            System.out.println("total : "+this.getOrderTotal() );

        }
    // GETTERS & SETTERS
    public String getname(){
        return this.name;

    }
    public void setname(String name){
        this.name =name;
    }
    public boolean getready(){
        return this.ready;

    }
    public void setready(boolean ready){
        this.ready =ready;
    }
    public ArrayList<Item> getitem(){
        return this.items;

    }
    public void setitem(ArrayList<Item> items){
        this.items =items;
    }
}

