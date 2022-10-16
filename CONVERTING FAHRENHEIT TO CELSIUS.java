
package ptask1;
import java.util.Scanner;
public class PTASK1 {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       double cel,celsius,fahren;
       
        System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("---------------------CONVERTING FAHRENHEIT TO CELSIUS-----------------");
       
        System.out.print("Enter the fahrenheit temperature: ");
        fahren = scan.nextDouble();
        System.out.println("\n");
        // the program only displays 0.0 if we divide 5 by 9 (5/9) 
        // I have used a calculator to get the qoutient thus having the "cel" variable to store it.
        cel = 0.55555555555555555555555555555556;
        celsius = (fahren-32)*cel;
        System.out.println("The temperature in celsius:");
        System.out.printf("%.4f", celsius);
         // USING THE "%.4F" MAKES THE TOTAL OF CELSIUS DISPLAYS ONLY UPTO 4 DECIMAL PLACES
        System.out.println("\n");
        
        
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
        
        
    }
    
    
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    