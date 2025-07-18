package Interface;



     
           interface calculator
           {
        	   
        	   final static double pi = 3.14; // GLOBAL CONSTANT
        	   
        	   void add(int a, int b);
        	   void sub (int a, int b);
        	   
           }
           
           
           class calc  implements calculator
           {
        	public   void add(int a, int b)
        	   {
        		   System.out.println("added no = " +(a+b));
        	   }
        	   
        	   
        	public   void sub(int a, int b)
        	   {
        		   System.out.println("Sub no = " +(a-b));
        	   }
           }
           

public class Interfacebasic {

	public static void main(String[] args) {
		
		System.out.println("global constant value = " +calculator.pi);
		
		calculator c1= new calc();
		
		c1.add(100, 50);
		c1.sub(115, 2);

	}

}
