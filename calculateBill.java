public class calculateBill
{
   public static void main(String ss[])
   {
      bill(10,10);
	  bill(10,10,18);
   }
   
   public static void bill(int qty,int rate)
   {
      System.out.println("Bill without GST " + (qty*rate));
   }
   
   public static void bill(int qty,int rate,int gstrate)
   {
      int gstamount = (qty*rate) * gstrate/100;
	  
	  int totalamount = (qty * rate) + gstamount;
	  
	  System.out.println("Bill without GST "+ totalamount);
   
   
   }
}