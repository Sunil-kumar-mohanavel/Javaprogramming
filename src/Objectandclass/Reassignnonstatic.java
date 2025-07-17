package Objectandclass;

     

 
class box
{
	 static int A=200;
	 
	 double B = 10.3;
	 
}

public class Reassignnonstatic {

	public static void main(String[] args) {
		
		
		
		
		

		System.out.println("A value = " +box.A);
		
		box.A=250; // Reassigned
		
		System.out.println("Reassigned A value = " +box.A);
		
		System.out.println("B value = " +new box().B);
		
		
		box y1 = new box();  // Object Created by Reference variable
		
		y1.B=500.35;  // Reassigned 
		 
		
		System.out.println("Reassigned B value = " +y1.B);
		
		
		box z1=new box();
		
		// Created Object but not Initialized/reassigned to ref var
		
		System.out.println("Reassigned B value Again without reassign = " +z1.B);
		
		box x1=new box();
		x1.B=600.12;
		System.out.println("Reassigned B value Again with reassign = " +x1.B);
	}

}
