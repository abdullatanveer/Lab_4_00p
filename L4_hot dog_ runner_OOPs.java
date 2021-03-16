/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotdog_runner;

/**
 *
 * @author abdul
 */
public class Hotdog_runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hot_dog stand1=new Hot_dog(179,9);
        stand1.justsold();
        stand1.justsold();
        stand1.justsold();
        stand1.justsold();
        
        
        
        Hot_dog stand2=new Hot_dog(96,7);
        System.out.println(stand1.justsold() +"hot dogs  sold by stand of ID "+stand1.info()+ " ");
        stand2.justsold();
        stand2.justsold();
        stand2.justsold();
        stand2.justsold();
        System.out.println("hot dogs  sold by stand of ID "+stand2.info()+ "  "+stand2.justsold());

        Hot_dog stand3=new Hot_dog(875,1);
        stand3.justsold();
      
        stand3.justsold();
        stand3.justsold();
        
        System.out.println(" hot dogs that  sold by stand of ID "+stand3.info()+ ""+stand3.justsold());

        
        System.out.println("Total number of hot dogs  sold by all three stands : " +stand1.totalsold());
    }
    
}