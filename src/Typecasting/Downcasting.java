package Typecasting;


       
class E
{
	   int x=10;
	   
}



class F extends E
{
	   int y=20;
	   
}



class G extends F
{
	   int z=30;
	   
}

public class Downcasting {

	public static void main(String[] args) {
		
		E a1= new G(); // UPCASTING
		
		System.out.println("A class value = "+a1.x);
		
		
		F b1 = (F) a1;
		
		System.out.println("B class value = "+b1.x);
		System.out.println("B class value = "+b1.y);
		
		
		G c1=(G)b1;
		
		System.out.println("C class value = "+c1.x);
		System.out.println("C class value = "+c1.y);
		System.out.println("C class value = "+c1.z);
		
		
		
		
		
				

	}

}
