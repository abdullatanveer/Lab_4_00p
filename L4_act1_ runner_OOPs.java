package marksrunner;

/**
 *
 * @author abdul
 */
public class marks {
   private int marks1;
   private int marks2;
   private int marks3;
    public marks(){
        
    }
    public   void setmarks(int m1,int m2, int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
     
    }
    public int getmarks1(){
        return marks1;
    }
    public int getmarks2(){
        return marks2;
    }
    public int getmarks3(){
        return marks3;
    }
    public int sum(){
        return getmarks1()+getmarks2()+getmarks3();
    }
    
    public void display(){
        System.out.println("sum of" +" "+getmarks1()+ " "+getmarks2()+" "+ "and" + +getmarks3()+" ="+" "+sum());
    }
    
}
