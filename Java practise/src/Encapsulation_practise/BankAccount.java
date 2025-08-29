package Encapsulation_practise;

public class BankAccount {
   private double balance = 0;
   public void deposit (double amt){
	   if(amt>0) {
		 balance +=amt;
		 System.out.println("Balance amount = "+balance);
	}
	
   }
    public void withdraw(double amt) 
    {
    	if(amt>0 && amt< balance) 
    	{
    		balance -=amt;
    		System.out.println("Withdraw amount = "+amt);	
    	}
    	else
    	{ 
    		System.out.println("Invalid amount");
    	}
    	
    }
    
    private double getbalance() 
    {
    	return balance;
    	
    }
    public static void main(String[] args) {
    	BankAccount acc=new BankAccount();
        acc.deposit(50000);
        acc.withdraw(10000);
        System.out.println("Current balance is = "+acc.getbalance());
    
    }
}
