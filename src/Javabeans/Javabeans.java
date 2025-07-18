package Javabeans;

               class student
               {
            	   private int id;         // private data member
            	   private String name;
            	  
            	   private double per;
            	   
            	   public student()       // public default constructor 
            	   {
            		   
            	   }
            	   
            	 
				   public int getId() {       // public get
					   return id;
				   }
				   public void setId(int id) {    // public  set
					   this.id = id; 
				   }
				   
				   public String getName() {
					   return name;
				   }
				   
				   public void setName(String name) {
					   this.name = name;
				   }
				   
				   public double getPer() {
					   return per;
				   }
				   
				   public void setPer(double per) {
					   this.per = per;
				   }
				   
            	   
            	   
               }
 



 

public class Javabeans {

	public static void main(String[] args) {
		
		
		student s1= new student();
		
		
		s1.setId(123);
		s1.setName("java");
		s1.setPer(91.5);
		
		
		System.out.println("Id = " +s1.getId());
		System.out.println("name is " +s1.getName());
		System.out.println("per is " +s1.getPer());

	}

}
