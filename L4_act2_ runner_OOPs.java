package l4act2;

/**
 *
 * @author abdul
 */
public class L4ACT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account account1=new account(45);
        account account2=new account(600);
        account1.getbalance();
        account1.displaybalance();
        
        account1.setdeposit(55);
        account1.getdeposit();
        account1.displaydeposited();

       // account2.setbalance(500);
        //account2.getbalance();
        account2.getbalance();
        
         account2.setwithdraw(50);
        account2.getwithdraw();
        account2.displaybalance();
        account2.displaywithdraw();
       
       
    }
    
}