public class simple_class
{
	  static
	  {
	     System.out.println("Static block");
	  }
	  
	
      {
	     System.out.println("Instance block");
	  }
	  
	  
	  


   public static void main(String ll[])
   {
      
	  simple_class s = new simple_class();
	  simple_class a = new simple_class();
	  simple_class b = new simple_class();
	  
	  
	  
   
   }
}