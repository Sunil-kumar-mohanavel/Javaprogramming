package Constructor;

       class A
       {
    	   
    	   A()
    	   {
    		   this (10);
    		   System.out.println(" A()");
    	   }
    	   
    	   
    	   A(int x)
    	   
    	   
    	   {
    		   this(12.5);
    		   System.out.println(" A(int x)");
    	   }
    	   
    	   
    	   A(double y )
    	   
    	   {
    		   this(2,3);
    		   System.out.println(" A(doubl y)");
    	   }
    	   
    	   
    	   
         A(int x , int y )
    	   
    	   {
        	  int c= x+y;
    		   System.out.println(c);
    	   }
    	   
       }




public class ConstructorChaning {

	public static void main(String[] args) {
		
		
		A a1= new A ();		
		

	}

}
