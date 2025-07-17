package Objectandclass;



       class one
       {
    	   static int x =10;
    	      int y =30;
    	      
    	      
    	      static void two()
    	      {
    	    	  System.out.println("two");
    	    	  
    	      }
    	      
    	      void three()
    	      {
    	    	  System.out.println("three");
    	    	  
    	      }
    	   
    	   
       }



public class Objectclass3 {

	public static void main(String[] args) {
		
		
		
		System.out.println(one.x);
		
		System.out.println(new one().y);
		
		
		one.two();
		
		one t1=new one();
		
		t1.three();
		
	//	new one().three();
		
		
		
		
		

	}

}
