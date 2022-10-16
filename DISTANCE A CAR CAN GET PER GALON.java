import java.util.Scanner;
public class PTASK10 {
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	double gallon,disttown,disthighway;
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("--------------------DISTANCE A CAR CAN GET PER GALLON ----------------- \n");
	
	System.out.print("Enter how many gallon does the car has: ");
	gallon = scan.nextDouble();
	
	
	
	disttown = gallon * 23.5;
	disthighway = gallon * 28.9;
	
	System.out.print("The total distance the car can be driven in town is: ");
	System.out.printf("%.2f",disttown);System.out.println(" miles");
	
	System.out.print("The total distance the car can be driven in highway is: ");
	System.out.printf("%.2f",disthighway);System.out.println(" miles");
	System.out.println("\n");
	
	 System.out.println("---------------------THANKYOU FOR USING----------------------");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
