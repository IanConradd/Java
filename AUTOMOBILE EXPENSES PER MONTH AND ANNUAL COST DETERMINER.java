import java.util.Scanner;
public class PTASK12 {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	   System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
       System.out.println("---------------------AUTOMOBILE EXPENSES PER MONTH AND ANNUAL COST DETERMINER-----------------\n");
	
	double loanpay,insu,gas,oil,tires,mainte,totmon,totannual;
	
	System.out.print("Enter loan payment per month: ");
	loanpay = scan.nextDouble();
	System.out.println("");
	
	System.out.print("Enter insurance per month: ");
	insu = scan.nextDouble();
	System.out.println("");
	System.out.print("Enter how much it costs gas per month: ");
	gas = scan.nextDouble();
	System.out.println("");
	System.out.print("Enter how much it costs oil per month: ");
	oil = scan.nextDouble();
	System.out.println("");
	System.out.print("Enter how much it costs tires per month: ");
	tires = scan.nextDouble();
	System.out.println("");
	
	System.out.print("Enter maintenance fee per month: ");
	mainte = scan.nextDouble();
	System.out.println("");
	
	totmon = loanpay + insu + gas + oil + tires + mainte;
	totannual = totmon * 12;
	
	System.out.println("This is the total monthly cost of these expenses: "+totmon);
	System.out.println("This is the total annual cost: "+totannual);
	System.out.println("\n");
	
	   
    
    System.out.println("---------------------THANKYOU FOR USING----------------------");
    
    
	
	
	

		
		
		
		
		
		
		
		
		
		
	}

}
