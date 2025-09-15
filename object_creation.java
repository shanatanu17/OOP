class Upper
{
	
	
  {
	  System.out.println("Instance block of Upper class ");
  }	
  
  static 
    {
	  System.out.println("static block of Upper class ");
    }
  
  
	
  Upper(int a,int b)
  {
	  System.out.println( "Addition of a and b is " + (a+b));
  }	
	
  Upper()
  {
     System.out.println("I am a constructor 1 of Upper class");
  }
  
  

}


public class object_creation
{

    static 
    {
	  System.out.println("static block of object_creation class ");
    }	
	
  public static void main(String ss[])
  {
	   
	 Upper u2 = new Upper(10,20);
	 Upper u1 = new Upper();
	 
    
  }
}