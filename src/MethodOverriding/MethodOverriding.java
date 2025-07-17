package MethodOverriding;

   class A
   {
	   void test()
	   {
		   
		   System.out.println(" In 1st method");
	   }
	 
   }

      
   
   class B  extends A
   { 
	   void test()
	   {
		   
		   System.out.println(" In 2nd method");
	   }
	 
   }




public class MethodOverriding {

	public static void main(String[] args) {
		
				
		
		B n1=new B();
		
		n1.test();


	}

}
