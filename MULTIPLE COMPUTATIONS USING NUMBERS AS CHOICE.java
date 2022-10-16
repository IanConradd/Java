import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PTASK30 {

	public static void main(String[] args) {
		String input;
		char choice;		double heighttri;
		double areacirc;	double radcirc;			
		double sidesqua;		double areasqua;
		double lengthrec;		double arearec;	
		double widthrec;		double areatri;	
		double basetri;
		
			
			
			
		
		
		DecimalFormat df = new DecimalFormat(".##");
		
		choice = JOptionPane.showInputDialog("-----------------------------RIZAL TECHNOLOGICAL UNIVERSITY--------------------------\n\n Choose a number to perform such actions:\n\n   1.   Calculate the Area of Circle\n   2.   Calculate the Area of a Rectangle\n  3.   Calculate the Area of a Triangle\n   4.   Quit").charAt(0);
		
		if(choice == '1')
		{
			
			radcirc = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius of a Circle"));
			areacirc = Math.PI*Math.pow(radcirc, 2);
			
			if(radcirc>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Radius of Circle: "+radcirc+"\nArea of Circle:\n    =  "+df.format(areacirc)+"\n ------------------------------THANKYOU FOR USING----------------------");	
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You Entered Negative Number, Please Enter Positive Number Only");
			}
		}
		
		
		else if(choice == '2')
		{
			lengthrec = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of Rectangle"));
			widthrec = Double.parseDouble(JOptionPane.showInputDialog("Enter Width of Rectangle"));
			
			arearec = lengthrec*widthrec;
			
			if(widthrec>=0 &&lengthrec>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Length of Rectangle: "+lengthrec+"\nInputted Width of Rectangle: "+widthrec
					+"\n\nArea of Rectangle:\n    =  "+df.format(arearec)+"\n --------------------------THANKYOU FOR USING-----------------------");		
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You Entered Negative Number, Please Enter Positive Number Only");
				}
		}
		
		else if(choice == '3')
		{
			
			basetri = Double.parseDouble( JOptionPane.showInputDialog("Enter Base of Triangle"));
			
			
			heighttri = Double.parseDouble(JOptionPane.showInputDialog("Enter Height of Triangle"));
			
			areatri = (basetri*heighttri) *0.5;
			
			if(basetri>=0 &&heighttri>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Base of Triangle: "+basetri+"\nInputted Height of Triangle: "+heighttri
					+"\n\nArea of Rectangle:\n    =  "+df.format(areatri)+"\n ---------------------THANKYOU FOR USING---------------------------");	
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You Entered Negative Number, Please Enter Positive Number Only");
			}
		}
		
		else if(choice == '4')
		{
			System.exit(0);
		}
		
		
		else
		{
			JOptionPane.showMessageDialog(null, "PLEASE ENTER A NUMBER FROM THE RANGE OF CHOICES\n ---------------------THANKYOU---------------------");
		}
		
		System.exit(0);

	}

}
