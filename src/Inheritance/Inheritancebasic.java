package Inheritance;

       class A
       {
    	   
    	   int x=10;
       }
      
       
       class B extends A
       {
    	   
    	   int y =20;
       }

         
       class C   extends B
       {
    	   
    	   
    	   int z=30;
       }





public class Inheritancebasic {

	public static void main(String[] args) {
		
		C c1 =new C();		
		
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);

	}

}
