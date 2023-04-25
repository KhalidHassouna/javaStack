import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    public String name; // default value of null
    public boolean ready; // default value false>
    public double total ;
    public ArrayList<Item> item = new ArrayList<Item>();
}