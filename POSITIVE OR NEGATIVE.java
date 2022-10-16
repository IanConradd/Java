import java.util.Scanner;
import javax.swing.JOptionPane;
public class PTASK22 {
public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int num;


    num=Integer.parseInt(JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------POSITIVE OR NEGATIVE-----------------\n\n Enter a number: "));
    
	
	if (num >= 0) {
		
		JOptionPane.showMessageDialog(null, "Positive Integer");
	}
	else {
		 JOptionPane.showMessageDialog(null, "Negative Integer\n --------------------THANKYOU FOR USING---------------");
	}
	
	
}
}
