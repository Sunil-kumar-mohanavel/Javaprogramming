package Constructor;


  class cars
  {
	  int modelno;
	  double price;
	  String colour;
	  
  

   cars(int a, double b, String c)
   {
	   
	   modelno=a;
	   price=b;
	   colour=c;
	   
	   System.out.println("object created and initialized");
	   
   }

  }


public class Constructorbasic {

	public static void main(String[] args) {
		
		
		cars lambo =new cars(123,15000000.00,"Yellow");
				
				System.out.println("car model no is " +lambo.modelno);
				
				System.out.println("car model no is " +lambo.price);
				
				System.out.println("car model no is " +lambo.colour);
				
				
                cars mini =new cars(321,20000000.00,"orange");
				
				System.out.println("car model no is " +mini.modelno);
				
				System.out.println("car model no is " +mini.price);
				
				System.out.println("car model no is " +mini.colour);
		
	}

}
