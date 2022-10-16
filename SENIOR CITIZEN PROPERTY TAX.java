import java.util.Scanner;
public class PTASK15 {
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	 
	double propvalue,assevalue=0.60,senexemp=5000,paytaxval,taxrate,proptax;
	double annualtax,quartertax;
	
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("---------------------SENIOR CITIZEN PROPERTY TAX-----------------\n");
	
	System.out.print("Enter property value: ");
	propvalue = scan.nextDouble();
	System.out.println("");
	
	
	System.out.print("Enter tax rate: ");
	taxrate = scan.nextDouble();
	System.out.println("");
	
	assevalue=propvalue * 0.60;
	
	System.out.println("assessed value: "+assevalue);
	
	paytaxval= assevalue - senexemp;
	
	System.out.println("the total assessed value: "+paytaxval);
	

	proptax = (paytaxval / 100)*taxrate;
	
	System.out.printf("The property tax rate: %.2f",proptax);
	System.out.println("");
	
	annualtax = proptax * 12;
	quartertax = proptax / 4;
	
	System.out.printf("The annual property tax: %.2f",annualtax);
	System.out.println("");
	System.out.printf("The quarterly tax: %.2f",quartertax);
	System.out.println("");
	
	   System.out.println("---------------------THANKYOU FOR USING----------------------");
	
	
	
	
	
	
	
	
	
}
}
