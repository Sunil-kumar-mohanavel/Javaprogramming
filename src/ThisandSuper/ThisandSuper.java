package ThisandSuper;



      class A
      {
    	  int x=10;
      }

      
      class B  extends A
      {
    	  int x=100;
      
      
      void test()
      {
    	  
    	  int x=1000;
    	  
    	  System.out.println("local x value = " +x);
    	  System.out.println("this x value = " +this.x);
    	  System.out.println("super x value = " +super.x);

    	  
      }
      }
      
public class ThisandSuper {

	public static void main(String[] args) {
		
		
		
		
		B b1= new B();
		
		b1.test();

	}

}
