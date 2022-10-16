import javax.swing.JOptionPane;
public class PTASK28 {

	public static void main(String[] args) {
		
		String studname;
		double ave,tuition,tottuitionfee;
		
		studname = JOptionPane.showInputDialog("------------------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------\n ---------------------------YEAR DETERMINER--------------------\n\n Input the students name: ");
		ave = Double.parseDouble(JOptionPane.showInputDialog("Enter students average: "));
		tuition = Double.parseDouble(JOptionPane.showInputDialog("Enter students tuition fee: "));
		
		if(ave >= 95 && ave <= 100)
		{
			tottuitionfee = (tuition * 1)-tuition;
			
			JOptionPane.showMessageDialog(null, "Student's name: "+studname+"\nAverage: "+ave+"\nTuition fee: "+tuition+"\nDiscount: 100%\nTotal tuition fee: "+tottuitionfee+"\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(ave>=90 && ave <= 94 )
		{
			tottuitionfee = (tuition * .25)-tuition;
			
			JOptionPane.showMessageDialog(null, "Student's name: "+studname+"\nAverage: "+ave+"\nTuition fee: "+tuition+"\nDiscount: 25%\nTotal tuition fee: "+tottuitionfee+"\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(ave>=85 && ave <= 89 )
		{
			tottuitionfee = (tuition * .10)-tuition;
		
			JOptionPane.showMessageDialog(null, "Student's name: "+studname+"\nAverage: "+ave+"\nTuition fee: "+tuition+"\nDiscount: 10%\nTotal tuition fee: "+tottuitionfee+"\n---------------------THANKYOU FOR USING------------------");
		}
		
		else if(ave <= 84)
		{
			
		
			JOptionPane.showMessageDialog(null, "Student's name: "+studname+"\nAverage: "+ave+"\nTuition fee: "+tuition+"\n---------------------THANKYOU FOR USING------------------");
		}
		else if(ave <= 0 || ave > 100 )
		{
			
			JOptionPane.showMessageDialog(null, "Please input correct details \n THANKYOU");}
		
		
		else
		{
			JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT DETAILS ");
		}
		
		
		

	}

}
