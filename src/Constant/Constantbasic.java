package Constant;

      class school
      {
    	  
    	  final static String schoolname = " Don bosco";
    	  
    	        final int rollno;
    	        final String stuname;
    	                double mark;
    	                
    	                
    	     school (int r1, String s1, double m1)
    	     {
    	    	 
    	    	 rollno=r1;
    	    	 stuname=s1;
    	    	 mark=m1;
    	     }
    	  
    	     
    	     school (int t1, String p1)
    	     {
    	    	 
    	    	 rollno=t1;
    	    	 stuname=p1;
    	    	
    	     }
    	     
    	     
    	     static void schoolnaming()
    	     {
    	    	 
    	    	 System.out.println("School name is " +schoolname);
    	     }
    	     
    	      void stdinfo()
    	     {
    	    	 
    	    	 System.out.println("student roll no is " +rollno);
    	    	 System.out.println("student name is " +stuname);
    	    	 System.out.println("student mark is " +mark);
    	     }
    	     
      }
    


public class Constantbasic {

	public static void main(String[] args) {
		
		         school.schoolnaming();
		         
		         
		    school std1=new school (123,"jim",91.1);
		    
		    std1.stdinfo();
		    
              school std2=new school (321,"steve");
		    
		    std2.stdinfo();
		    

	}

}
