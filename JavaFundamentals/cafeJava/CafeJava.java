public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCofeePrice = 4.5;
        double lateePrice = 7 ;
        double cappuccinoPrice = 8.5;
        double total = 0 ;
        double total2 = 0 ;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 =  "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        System.out.println(pendingMessage);
        System.out.println(readyMessage);
        System.out.println(displayTotalMessage + dripCofeePrice);
         // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder4){
            System.out.println(generalGreeting+customer4+displayTotalMessage+cappuccinoPrice);

        }
        total = lateePrice+lateePrice;
        if (isReadyOrder3){
            System.out.println(generalGreeting+customer2+displayTotalMessage+total);

        }
        else{
            System.out.println(generalGreeting+customer2+pendingMessage);
        }
        total2= lateePrice-dripCofeePrice;
        if (isReadyOrder3){
            System.out.println(generalGreeting+customer3+displayTotalMessage+lateePrice);

        }
        System.out.println(generalGreeting+customer2+pendingMessage);

    }
}
