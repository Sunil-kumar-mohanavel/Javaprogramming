package Constructor;


     class bike
     {
    	 int price;
    	 String colour;
    	 
    	 
    	 bike()
    	 {
    		 
    		 System.out.println(" In bike()");
    		 
    	 }
    	 
    	 bike(int a)
    	 {
    		 System.out.println(" In bike( int a)");
    		 price=a;
    	 }
    	 
    	 bike(int a, String b)
    	 {
    		 System.out.println(" In bike( int a, string b)");
    		 price =a;
    		 colour = b;
    		 
    	 }
    	 
     }






public class ConstructorOverloading {

	public static void main(String[] args) {
		
		
		
		 bike c1 = new bike();
		 
		 System.out.println(" price is " +c1.price);
		 System.out.println(" colour is " +c1.colour);
		 
            bike c2 = new bike(1000);
		 
		 System.out.println("price is " +c2.price);
		 System.out.println("colour is " +c2.colour);
		 
		 
		 
                 bike c3 = new bike(1500,"red");
		 
		 System.out.println("price is " +c3.price);
		 System.out.println("colour is " +c3.colour);

	}

}
