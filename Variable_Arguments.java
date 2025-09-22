class Calsum
{
   

   void sum(int ...x)
   {
     int s = 0;
     for(int i=0;i<x.length;i++)
     {
      s = s + x[i];
     }

     System.out.println("Total sum is " + s);
   }

  

}



public class Variable_Arguments
{
  public static void main(String ss[])
   {
      Calsum obj = new Calsum();


      obj.sum(10,20,30,40,50);
 
   }



}