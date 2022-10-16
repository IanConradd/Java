import java.util.Scanner;
public class PTASK16 {

public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	double diapizza,area,radius,slice;
	
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("---------------------PIZZA PI-----------------\n");
	
	System.out.println("Enter the diameter of a pizza in inches: ");
	diapizza = scan.nextDouble();
	
	radius = diapizza/2;
	area = Math.PI*Math.pow(radius,2);
	
	
	slice = area /14.125;
	System.out.println(slice);
	
	  slice = Math.round(slice * 10.0) / 10.0;

     System.out.println("slice: " + slice);
	
     
    
    System.out.println("\n---------------------THANKYOU FOR USING----------------------");
	
	
	
}
}
