class Animal
{
   int id;
   String name;

}




public class Instance_varibale
{
  public static void main(String ss[])
  {
     
	 Animal a1  = new Animal();
	 a1.id = 11;
	 a1.name = "amar";
	 
	 Animal a2  =new Animal();
	 a2.id = 12;
	 a2.name = "sham";
	 
	 
	 a1.id  = 511;
	 
	 
	 System.out.println(a1.id  + " "  + a1.name);
	 System.out.println(a2.id + "  "  + a2.name);
	 
	 
	 
  
  
  }
}