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
public class Hot_dog {
    private int id_number;
    private int total_sold;
    private static int totalsold=0;
    public Hot_dog(){
        id_number=0;
        total_sold=0;
    }
    public  Hot_dog(int id_number,int total_sold){
        this.id_number=id_number;
        
        this.total_sold=total_sold;
        totalsold=totalsold+total_sold;
    }
    public int info(){
        return id_number;
    }
    
    public int justsold(){
        total_sold++;
        totalsold++;
        return total_sold;
    }
    public int totalsold(){
        return totalsold;
    }
    
}