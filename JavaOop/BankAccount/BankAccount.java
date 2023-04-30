public class BankAccount{
    private double checkingBalance ;
    private double savingBalance ;
    public static int numberOfAccounts = 0 ;
    public static double totalBalnce = 0.0 ;

    public BankAccount(double checkingBalance ,double savingBalance){
        this.checkingBalance = checkingBalance ;
        this.savingBalance = savingBalance ;
        numberOfAccounts ++ ;
    }
    public static int accountCounts(){
        return numberOfAccounts ;
    }

    public double getCheckingAccountBalance(){
        return this.checkingBalance ;
    }

    public double getSavingAccountBalance(){
        return this.savingBalance ;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance ;
    }

    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance ;
    }
    
    public void checkDeposit(double amount){
        setCheckingBalance(getCheckingAccountBalance()+amount);
        totalBalnce += amount  ;
    }

    public void savingDeposit(double amount){
        setSavingBalance(getSavingAccountBalance()+amount);
        totalBalnce+= amount  ;
    
    }
    public void savingWithdraw(double amount){
        if(getSavingAccountBalance() < amount ){
            System.out.println("your balance not enough to complete this operation");
        } 
        else{
            setSavingBalance(getSavingAccountBalance()-amount);
        totalBalnce -= amount ;
        }    
    }

    public void checkWithdraw(double amount){
        if(getCheckingAccountBalance() < amount ){
            System.out.println("your balance not enough to complete this operation");
        } 
        else{
            setCheckingBalance(getCheckingAccountBalance()-amount);
        totalBalnce -= amount ;
        }    
    }    
            
    public double displyBalance(){
        double total = savingBalance + checkingBalance ;
        return total ;
    }

}