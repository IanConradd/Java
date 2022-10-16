import java.util.Scanner;
public class PTASK11 {
	
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		String month1,month2,month3;
		double rain1,rain2,rain3,rainsum;
		
		System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("---------------------AVERAGE RAINFALL DETERMINER----------------- \n");
       
		
		
		System.out.print("Enter the first month: ");
		month1 = scan.nextLine();
		
		System.out.print("Enter the rain fall for the month of "+month1+" : ");
		rain1 = scan.nextDouble();
		scan.nextLine();
		System.out.println("\n");
		System.out.print("Enter the second month: ");
		month2 = scan.nextLine();
		
		System.out.print("Enter the rain fall for the month of "+month2+" : ");
		rain2 = scan.nextDouble();
		scan.nextLine();
		System.out.println("\n");
		System.out.print("Enter the third month: ");
		month3 = scan.nextLine();
		
		System.out.print("Enter the rain fall for the month of "+month3+" : ");
		rain3 = scan.nextDouble();
		scan.nextLine();
		System.out.println("\n");
		rainsum = rain1+rain2+rain3;
		
		System.out.println("The average rainfall for "+month1+", "+month2+" and "+month3+" is: "+rainsum+" inches. \n");
		
		
   
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
        
		
		
		
		
		
	}

}
