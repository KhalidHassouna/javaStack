public class Test {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount(1000.0,2000.0);
        BankAccount account2 = new BankAccount(0.0,0.0);
        BankAccount account3 = new BankAccount(2000.0,1000.0);

        account1.checkDeposit(300.0);
        account1.savingDeposit(3500.0);
        account1.savingWithdraw(200.0);
        account1.checkWithdraw(1300.0);
        System.out.println(account1.displyBalance());
        account2.savingDeposit(100.0);
        account2.savingWithdraw(400.0);
        System.out.print(account3.displyBalance());
        System.out.print("the number of account is : "+BankAccount.accountCounts());

        
    }
}