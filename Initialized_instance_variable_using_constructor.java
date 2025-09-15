class Upper
{
  int id;
  String name;
  
  Upper(int i, String s)
  {
     id = i;
	 name = s;
  }
  

}

public class Initialized_instance_variable_using_constructor
{
public static void main(String ss[])
{
   Upper u1 = new Upper(1,"Shantanu");
   System.out.println("id --> "+u1.id+  " name---> " + u1.name);
   
   Upper u2  = new Upper(2,"Sam");
   System.out.println("id --> "+u2.id+  " name---> " + u2.name);
   
   
   

}
}