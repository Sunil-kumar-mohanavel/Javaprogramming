package Objectandclass;

   class Note
   {
	   static int totalnote = 10;
	          double price = 1350;
	          float discount = 90.2f;
	              
	   
   }

public class Objectclass2 {

	public static void main(String[] args) {
		
		
		System.out.println("Total No of Notes = " +Note.totalnote);
		
		System.out.println("Note price = " +new Note().price);
		
		System.out.println("Note Discount = " +new Note().discount);
		
		
		Note.totalnote = 15;
		
		System.out.println("Total No of Notes is Reassigned = " +Note.totalnote);
		
		
		Note e1=new Note();
		
		e1.price = 4100;
		
		e1.discount = 82.1f;
		
		
		System.out.println("Note price is Reassigned = " +e1.price);
		
		System.out.println("Note Discount is Reassigned = " +e1.discount);
		
		
	}

}
