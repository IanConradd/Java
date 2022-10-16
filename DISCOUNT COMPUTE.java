import java.util.Scanner;
public class PTASK7 {
	public static void main (String[] args){
	
	Scanner scan = new Scanner (System.in);
	
	double itemprice,sale=0.20,totprice,discamount;
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("--------------------DISCOUNT DETERMINER ----------------- \n");
	
	System.out.println("Enter the regular amount: ");
	itemprice = scan.nextDouble();
	
	discamount = itemprice * sale;
	
	System.out.println("Discount amount: "+discamount);
	
	totprice = itemprice - discamount;
	
	System.out.println("Sale price: "+totprice);
	
	
	 System.out.println("---------------------THANKYOU FOR USING----------------------");
	
	
	
	
}
}
