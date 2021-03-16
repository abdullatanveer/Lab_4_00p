package l4act2;

/**
 *
 * @author abdul
 */
public class account {
    private double balance;
    
    public account(){
        balance=0.0;
    }
    
    public  account(double b){
        balance=b;
    }
    public void setbalance(double c){
        balance=c;
    }
    public double  getbalance(){
        return  balance;
    }
    public void displaybalance(){
        System.out.println("The initail balance  of account is :" +getbalance());
    }
    
    public void setdeposit(double amount){
        balance= balance +amount;
        
    }
    public double  getdeposit(){
        return balance;
    }
    public void displaydeposited(){
        System.out.println("Amount after depositing money  in account 1 is :" +getdeposit());
    }
    public void setwithdraw(double amount){
        balance=balance-amount;
     
    }
    public double getwithdraw(){
        return balance;
    }
    
    
    public void displaywithdraw(){
       
        System.out.println("Amount after withdrawing money from account 2 is :" +getwithdraw());
        
    }
}
