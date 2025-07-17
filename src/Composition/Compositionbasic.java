package Composition;

     class bench
     {
    	 int totaltable = 15;
    	 
    	 void sit()
    	 {
    		 
    		 
    		System.out.println("bench can used to sit");
    	 }
    	 
     }

     class student
     {
    	 String Name = "chris";
    	 
    	 void study()
    	 {
    		 
    		 
    		System.out.println("student must study");
    	 }
    	 
     }
     
     
     class classroom
     {
    	
    	static bench t1 = new bench();
    	   student s1= new student();
    	   
     }





public class Compositionbasic {

	public static void main(String[] args) {
		
		
		   System.out.println(classroom.t1.totaltable);
		   
		   classroom.t1.sit();
		   
		   
		   classroom c1 = new classroom();
		   
		   System.out.println(c1.s1.Name);
		
		  c1.s1.study();
		
	

	}

}
