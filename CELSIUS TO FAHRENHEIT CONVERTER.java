import java.util.Scanner;
public class PTASK13 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	      
        System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("---------------------CELSIUS TO FAHRENHEIT CONVERTER-----------------\n");
		
		double fah,cel,fraction=1.8;//i made the 9/5 into its quotient rather to compute it in the program.
									// because it only display 1.0 instead of 1.8.
		
	
		
		System.out.print("Enter Celsius: ");
		cel = scan.nextDouble();
		
		fah = (fraction * cel) + 32;
		
		
		System.out.println("");
		System.out.println("Fahrenheit: "+fah);
		
System.out.println("\n");
        
        
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
		
		
		
		
		
		
		
		
		
		

	}

}
