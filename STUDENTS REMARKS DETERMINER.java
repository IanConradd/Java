import java.util.Scanner;
import javax.swing.JOptionPane;
public class PTASK23 {
public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int grade;


    grade=Integer.parseInt(JOptionPane.showInputDialog("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------STUDENTS REMARKS DETERMINER-----------------\n\n Enter the students grade: "));
    
	
	if (grade >= 98 && grade <= 100) {
		
		JOptionPane.showMessageDialog(null, "Equivalent: 1.00\n PASSED\n -------------THANKYOU FOR USING---------");
	}
	else if (grade >=95 && grade <= 97) {
		JOptionPane.showMessageDialog(null, "Equivalent: 1.25\n PASSED\n -------------THANKYOU FOR USING---------");
	}
	else if (grade >=92 && grade <= 94) {
		JOptionPane.showMessageDialog(null, "Equivalent: 1.50\n PASSED\n -------------THANKYOU FOR USING---------");
	}
	else if (grade >=89 && grade <= 91) {
		JOptionPane.showMessageDialog(null, "Equivalent: 1.75\n PASSED\n -------------THANKYOU FOR USING---------");
	}
	else if (grade >=86 && grade <= 88) {
		JOptionPane.showMessageDialog(null, "Equivalent: 2.00\n PASSED\n -------------THANKYOU FOR USING---------");
			
	} 
	else if (grade >=83 && grade <= 85) {
		JOptionPane.showMessageDialog(null, "Equivalent: 2.25\n PASSED\n -------------THANKYOU FOR USING---------");
			
	}
	else if (grade >=80 && grade <= 82) {
		JOptionPane.showMessageDialog(null, "Equivalent: 2.50\n PASSED\n -------------THANKYOU FOR USING---------");

	}
	else if (grade >=77 && grade <= 79) {
		JOptionPane.showMessageDialog(null, "Equivalent: 2.75\n PASSED\n -------------THANKYOU FOR USING---------");
	}
	else if (grade >=75 && grade <= 76) {
		JOptionPane.showMessageDialog(null, "Equivalent: 3.00\n PASSED\n -------------THANKYOU FOR USING---------");
			
	}
	else if (grade > 0  && grade <= 74) {
		JOptionPane.showMessageDialog(null, "Equivalent: 5.00\n FAILED\n -------------THANKYOU FOR USING---------");
	}
	else {
		JOptionPane.showMessageDialog(null, "Please enter a valid grade\n -------------THANKYOU---------"); 
			
	}
	
	
	
	
}
}
