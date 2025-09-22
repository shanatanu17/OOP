class Arraypassing
{
   
   void runfunction(int []...x)
   { 
     for(int i=0;i<x.length;i++)
      {
        for(int j=0;j<x[i].length;j++)
         { 
            System.out.print(x[i][j]+" ");
         }

        System.out.println();
      }
 
   }
}


public class Variable_args_pass_infinite_array
{
   public static void main(String ss[])
   {
       Arraypassing obj = new Arraypassing();

       obj.runfunction(new int[]{1,2,3,4} , new int[]{10,20,30} ,new int[]{100,200});
 
 
   }


}