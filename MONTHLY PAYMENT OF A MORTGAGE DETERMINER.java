
package ptask2;
import java.util.Scanner;

public class PTASK2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double paymort,rate,yr,pay,totrate,totpay;
        
        
        
        System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("---------------------MONTHLY PAYMENT OF A MORTGAGE DETERMINER-----------------");
        
        System.out.println("Enter payment for mortgage: ");
        paymort = scan.nextDouble();
        
        System.out.println("Enter interest rate: ");
        rate = scan.nextDouble();
        
        System.out.println("Enter number of years: ");
        yr = scan.nextDouble();
        
        pay = yr * 12;
        
        totrate = rate/pay;
        
        totpay = (((paymort/pay)*totrate)+(paymort/pay))*pay;
        System.out.println("Payment everymonth: ");
        System.out.printf("%.2f", totpay);
         System.out.println("\n");
        
        
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
