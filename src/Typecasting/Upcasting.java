package Typecasting;

   class A
   {
	   int x=10;
	   
   }

   
   
   class B extends A
   {
	   int y=100;
	   
   }
   
   
   
   class C extends B
   {
	   int z=300;
	   
   }







public class Upcasting {

	public static void main(String[] args) {
		
		
		
		C c1=new C();
		
		System.out.println("C class value = "+c1.x);
		System.out.println("C class value = "+c1.y);
		System.out.println("C class value = "+c1.z);
		
		
		B b1=(B) c1;
		System.out.println("B class value = "+b1.x);
		System.out.println("B class value = "+b1.y);
		
		
		A a1=b1;
		
		System.out.println("A class value = "+a1.x);
		
		
		
		

	}

}
