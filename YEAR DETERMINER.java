import javax.swing.JOptionPane;
public class PTASK24 {

	public static void main(String[] args) {
		char year;
		
		year = JOptionPane.showInputDialog("------------------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------------YEAR DETERMINER--------------------\n\n Input a Year Code (1-4)").charAt(0);
		
		if(year=='1')
		{
			JOptionPane.showMessageDialog(null, "First Year\nFreshmen \n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(year=='2')
		{
			JOptionPane.showMessageDialog(null, "Second Year\nSophomore\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(year=='3')		{
			JOptionPane.showMessageDialog(null, "Third Year\nJunior\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(year=='4')
		{
			JOptionPane.showMessageDialog(null, "Fourth Year\nSenior\n---------------------THANKYOU FOR USING------------------");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "YOU HAVE ENTERED A NUMBER THAT IS NOT ON THE RANGE OF CHOICES ");
		}
		
		
		

	}

}
