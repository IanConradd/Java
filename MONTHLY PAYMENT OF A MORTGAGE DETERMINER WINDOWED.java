

import java.util.Scanner;

import javax.swing.JOptionPane;
public class PTASK19 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double paymort,rate,yr,pay,totrate,totpay;
        
        
        
        
        
        paymort=Double.parseDouble(JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------MONTHLY PAYMENT OF A MORTGAGE DETERMINER-----------------\n\n Enter payment for mortgage: "));
        

        rate=Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate: "));
       
        yr=Double.parseDouble(JOptionPane.showInputDialog("Enter number of years: "));
        
        pay = yr * 12;
        
        totrate = rate/pay;
        
        totpay = (((paymort/pay)*totrate)+(paymort/pay))*pay;
        
         String message = String.format("Payment every month: %.2f", totpay )+ String.format("\n\n ---------------------THANKYOU FOR USING-----------------");
         JOptionPane.showMessageDialog(null, message);
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
