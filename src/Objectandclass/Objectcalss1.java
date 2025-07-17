package Objectandclass;


   class books
   {
	  static int Noofpages =250;
	  
	         float price = 499.9f;
	         
	         
	         static void chapter1 ()
	         {
	        	 System.out.println("chapter 1 is finished");
	         }
	         
	         
	         void chapter2()
	         {
	        	 
	        	 System.out.println("chapter 2 is finished");
	         }
	  
	  
   }

public class Objectcalss1 {

	public static void main(String[] args) {
		
		
		System.out.println("No of pages in the book is "+books.Noofpages);
		
		
	
		
		System.out.println("price of the book is "+new books().price);
		
		
		books.chapter1();
		
		new books().chapter2();
		
		
		

	}

}
