import javax.swing.JOptionPane;
public class PTASK27 {

	public static void main(String[] args) {
		char num;
		
		num = JOptionPane.showInputDialog("------------------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------------YEAR DETERMINER--------------------\n\n Input a number (1-7)").charAt(0);
		
		if(num=='1')
		{
			JOptionPane.showMessageDialog(null, "MONDAY\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(num=='2')
		{
			JOptionPane.showMessageDialog(null, "TUESDAY\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(num=='3')		{
			JOptionPane.showMessageDialog(null, "WEDNESDAY\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(num=='4')
		{
			JOptionPane.showMessageDialog(null, "THURSDAY\n---------------------THANKYOU FOR USING------------------");
		}
		else if(num=='5')
		{
			JOptionPane.showMessageDialog(null, "FRIDAY\n---------------------THANKYOU FOR USING------------------");
		}
		else if(num=='6')
		{
			JOptionPane.showMessageDialog(null, "SATURDAYr\n---------------------THANKYOU FOR USING------------------");
		}
		else if(num=='7')
		{
			JOptionPane.showMessageDialog(null, "SUNDAY\n---------------------THANKYOU FOR USING------------------");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "YOU HAVE ENTERED A NUMBER THAT IS NOT ON THE RANGE OF CHOICES ");
		}
		
		
		

	}

}
