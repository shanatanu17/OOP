class Employee
{
  
   // All varibles are private 
   private int id;
   private String name;
   private int rollno;


   // public getters and setters 
   public void setid(int i)
   {
      id = i;
   }

   int getid()
   {
      return id;
   }

   public void setname(String n)
   {
     name = n;
   }

   String getname()
   {
     return name;
   }

  
   public void setrollno(int rn)
   {
      rollno = rn;
   }

   int getrollno()
   {
      return rollno;
   }
      
}




public class POJO_class
{
  public static void main(String ss[])
   { 
      Employee obj = new Employee();

      // set all values now
   
      obj.setid(1);
      obj.setname("Shantanu");
      obj.setrollno(38);

  
      // print the values
       
      System.out.println(obj.getid() + " , " +    obj.getname()  +  " , " +  obj.getrollno());
 
 
 
   }
}