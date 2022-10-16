import java.util.Scanner;

import javax.swing.JOptionPane;
public class PTASK18 {
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	
	String name;
	int age;
	double annualpay;
	
	name=JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------DESIRED ANNUAL PAY DETERMINER-----------------\n\n What is your whole name:");
		
	age=Integer.parseInt(JOptionPane.showInputDialog("What is your age: "));
	
	annualpay=Double.parseDouble(JOptionPane.showInputDialog("What is your desired annual income: "));
	
	JOptionPane.showMessageDialog(null, "My name is "+name+", May age is "+age+" and\n I hope to earn "+annualpay+" per year.\n\n ---------------------THANKYOU FOR USING-----------------");
	
	
}
}