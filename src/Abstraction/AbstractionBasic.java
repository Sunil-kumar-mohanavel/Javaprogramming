package Abstraction;

  abstract  class cal
    {
    	abstract void add(int n , int m);
    	abstract void mul (int n , int m);
    }
  
  
  class calculator  extends cal
  {
	  
	  void add(int n,int m)
	  {
		  System.out.println("added no = " +(n+m));
		
	  }
	  
	  void mul(int n,int m)
	  {
		  System.out.println("multiple no = " +(n*m));
		
	  }
  }


public class AbstractionBasic {

	public static void main(String[] args) {
		
		 cal c1=(cal)new calculator(); // UPCASTING
		 c1.add(10, 5);
		 
		 c1.mul(10, 5);

	}

}
