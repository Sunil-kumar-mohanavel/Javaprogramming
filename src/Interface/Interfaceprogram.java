package Interface;
 
   interface bank
   {
	   final static double totalbal = 10000;
	   
	   void deposit(double curbal,double dep);
	   void withdraw(double curbal,double widr);
	   void balenq  (double curbal,double dep,double widr);
	   
   }
   
   class sav implements bank
   
   {
	public void deposit(double curbal,double dep)
	   {
		   System.out.println("deposit = " +(curbal+dep));
	   }
	   
	public void withdraw (double curbal,double widr)
	   {
		   System.out.println("withdraw =" +(curbal-widr));
	   }
	public void balenq (double curbal,double dep, double widr)
	   {
		   System.out.println("bal = " +(curbal+dep-widr));
	   }
   }

class cur extends sav
   
   {
	public void deposit(double curbal,double dep)
	   {
		   System.out.println(curbal+dep);
	   }
	   
	public void withdraw (double curbal,double widr)
	   {
		   System.out.println(curbal-widr);
	   }
	public void balenq (double curbal,double dep, double widr)
	   {
		   System.out.println(curbal+dep-widr);
	   }
   }

class homeloan extends cur

{
	public void deposit(double curbal,double dep)
	   {
		   System.out.println(curbal+dep);
	   }
	   
	public void withdraw (double curbal,double widr)
	   {
		   System.out.println(curbal-widr);
	   }
	public void balenq (double curbal,double dep, double widr)
	   {
		   System.out.println(curbal+dep-widr);
	   }
}


class bikeloan extends homeloan

{
	public void deposit(double curbal,double dep)
	   {
		   System.out.println(curbal+dep);
	   }
	   
	public void withdraw (double curbal,double widr)
	   {
		   System.out.println(curbal-widr);
	   }
	public void balenq (double curbal,double dep, double widr)
	   {
		   System.out.println(curbal+dep-widr);
	   }
}


public class Interfaceprogram {

	public static void main(String[] args) {
		
		System.out.println("TOTAL BAL = " +bank.totalbal);
		
		System.out.println("sav acc");
		
		sav s1=new cur();
		
		s1.deposit(10000,3000);
		s1.withdraw(10000,1000);
		s1.balenq(10000,3000,1000);
		
		
		System.out.println("--------------------");
		
		System.out.println("cur acc");
		
       sav s2=new cur();
		
		s2.deposit(10000,3000);
		s2.withdraw(10000,1000);
		s2.balenq(10000,3000,1000);
		
		
System.out.println("--------------------");
		
		System.out.println("home loan");
		
       sav s3=new cur();
		
		s3.deposit(10000,3000);
		s3.withdraw(10000,1000);
		s3.balenq(10000,3000,1000);
		
		
		
		
System.out.println("--------------------");
		
		System.out.println("bike acc");
		
       sav s4=new cur();
		
		s4.deposit(10000,3000);
		s4.withdraw(10000,1000);
		s4.balenq(10000,3000,1000);
		

	}

}
