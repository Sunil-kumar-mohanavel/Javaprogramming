package Inheritance;

     class first
     {
    	 
    	 first (int x) 
    	 {
    	 	 
    	System.out.println(" A(intx) ");	 
    		 
    	 }
     }
    	 class second extends first
         {
        	 
    		 second (double y) 
        	 {
        	 	 
        		super(10);
        		 
        	System.out.println(" b (double y) ");	
        	
        		 
        	 }
         }
        	 
        	 class third  extends second
             {
            	 
        		 third () 
            	 {
            	 	 super (15.2);
            	System.out.println(" c() ");	 
            		 
            	 }
    	 
     }
         

public class Inheritancebasic2 {

	public static void main(String[] args) {
		
		    third c1= new third();	
		    
		    
		    
		}

}
