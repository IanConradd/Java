import java.util.Scanner;

import javax.swing.JOptionPane;
public class PTASK26 {
public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int num1,num2,num3;
	
	

    num1=Integer.parseInt(JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------THE GREATEST NUMBER-----------------\n\n Enter number 1: "));
    num2=Integer.parseInt(JOptionPane.showInputDialog("Enter number 2: "));
    num3=Integer.parseInt(JOptionPane.showInputDialog("Enter number 3: "));
	
	if (num1 > num2 && num1 > num3) {
		
		JOptionPane.showMessageDialog(null, "The greatest: "+num1+"\n-------------------THANKYOU FOR USING------------------");
		
	}
	if (num2 > num1 && num2 > num3) {
		
		JOptionPane.showMessageDialog(null, "The greatest: "+num2+"\n-------------------THANKYOU FOR USING------------------");
		
	}
	if (num3>num1 && num3>num2) {
		JOptionPane.showMessageDialog(null, "The greatest: "+num3+"\n-------------------THANKYOU FOR USING------------------");
		
	}
	if (num1 == num2 || num1 == num3 || num2 == num1 || num2 == num3 || num3 == num1 || num3 == num2) {
		JOptionPane.showMessageDialog(null, "PLEASE DO NOT INPUT AN INTEGER THAT HAS THE SAME VALUE\n THUS THE PROGRAM CAN FIND THE GREATEST NUMBER... \n-------------------THANKYOU------------------");
		
	}
	
}
}
