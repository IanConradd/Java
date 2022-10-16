import java.util.Scanner;

import javax.swing.JOptionPane;
public class PTASK20 {
public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	
	double charge,tax,tip,bill,totbill;
	

    charge=Double.parseDouble(JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------TAX, TIP AND RESTAURANT BILL-----------------\n\n Enter the charge for the meal: "));
    
	tax = charge * 0.675;
	 
	 bill = tax + charge;
	 tip = bill * 0.20;
	 totbill = tip + bill;
	 String message = String.format("The charge: %.2f", charge )+ String.format("\nThe tax: %.2f", tax)+String.format("\nThe tip: %.2f",tip)+String.format("\nThe total bill: %.2f",totbill)+String.format("\n\n ---------------------THANKYOU FOR USING-----------------");
     JOptionPane.showMessageDialog(null, message);
	 
	 
	
	
	
}
}
