
import java.util.Scanner;
public class PTASK14 {
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	
	double dollar,yen=109.59,euro=0.93,converyen,convereuro;
	
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("---------------------CELSIUS TO FAHRENHEIT CONVERTER-----------------\n");
	
	System.out.print("Enter amount of dollar to be converted into yen & euro: ");
	dollar = scan.nextDouble();
	System.out.println("");
	
	
	converyen = dollar * yen;
	convereuro = dollar * euro;
	
	System.out.printf("%.2f Dollars to Yen is %.2f and to Euro is %.2f",dollar,converyen,convereuro);
	System.out.println("");
	

    System.out.println("---------------------THANKYOU FOR USING----------------------");
    
	
	
	
	
	
	
	
	
	
}
}
