public class SortArrays
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,3,21,5,46};
      char ch[] = new char[]{'r','v','u','o','d'};

      sortarray(arr);
	  sortarray(ch);
   }
   
   public static void sortarray(int arr[])
   {
     int n =arr.length;
   
      for(int i=0;i<n;i++)
	  {
	    for(int j=(i+1);j<n;j++)
		{
		   if(arr[i] > arr[j])
		   {
		     int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
		   }
		}
	  }
	  
	  System.out.println("Integer array after sorting");
	  for(int i=0;i<arr.length;i++)
	  {
	    System.out.print(arr[i]+" ");
	  }
   }
   
   
   public static void sortarray(char ch[])
   {
      int n = ch.length;
	  
	  for(int i=0;i<n;i++)
	  {
	    for(int j=(i+1);j<n;j++)
		{
		  if(ch[i] > ch[j])
		  {
		     char temp = ch[i];
			 ch[i] = ch[j];
			 ch[j] = temp;
		  }
		}
	  }
	  
	  System.out.println();
	  System.out.println("character array after sorting");
	  for(int i=0;i<ch.length;i++)
	  {
	    System.out.print(ch[i]+" ");
	  }
   
   
   
   }

}