import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Creating object of Bank class and print");
	    Bank bn = new Bank(12,"Vishal");
	    System.out.println(bn.name);
	    System.out.println(bn.account);
	    	    
	    System.out.println("Creating object of Data class and print");
	    Data dt = new Data(7);
	    System.out.println(dt.id);
	    System.out.println(dt.name);
	    System.out.println(dt.account);
	    
	}
}
class Bank{
	  int account ;
	  String name;
	    
	  Bank(int account,String name){
	      this.account=account;
	      this.name=name;
	   }
}
class Data extends Bank{
    int id ;
    Data(int id){
        super(20,"Vishal");
        System.out.println("Data Class Called");
        this.id=id;
    }
}