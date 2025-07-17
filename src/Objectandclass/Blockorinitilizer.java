package Objectandclass;
  

    class block
    {
    	
    	static int x=10;
    	    int y =200;
    	    
    	    static {
    	    	
    	    	
    	    	System.out.println("static initilization block");
    	    	x=102; //reassign
    	    }
    	    
    	    {
    	    	System.out.println("instant initilization block");
    	    	y=300;  //reassign
    	    	
    	    }
    	    
    }

public class Blockorinitilizer {

	public static void main(String[] args) {
	
                 System.out.println( block.x);
                 
                 
                  
               System.out.println(new block().y);
                  
                  block b1= new block();
                  
                 System.out.println(b1.y);	
                  
                 //block b2= new block();
                  
                 System.out.println(b1.y);
                  
	}

}
