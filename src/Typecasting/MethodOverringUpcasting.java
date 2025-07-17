package Typecasting;




            class n
            {
            	void test()
            	{
            		System.out.println(" welcome");
            	}
            }
             
            
            class m  extends n
            {
            	void test()
            	{
            		System.out.println(" java");
            	}
            }

public class MethodOverringUpcasting {

	public static void main(String[] args) {
		
		
	/*	n n1=new n();
		
		n1.test();
		
  m m1=new m();
		
		m1.test();  */

		
		 n n2= (n) new m();  // upcasting
		 
		 n2.test();
	}

}
