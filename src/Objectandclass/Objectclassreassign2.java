package Objectandclass;



         class marker
         {
        	 static int A=10;
        	 
        	 double B =22.3;
        	 
         }


public class Objectclassreassign2 {

	public static void main(String[] args) {
		
		
		System.out.println("A value = " +marker.A);
		
		marker.A=100; //REASSIGNED (Static can Reassigned)
		
		System.out.println("Reassigned A value = " +marker.A);
		
		System.out.println("B value = " +new marker().B);
		
		
		new marker().B = 230.5;  // Non static can't be reassigned (create a Object)
		
		System.out.println("B value = " +new marker().B);
		
	}

}
