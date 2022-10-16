import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PTASK29 {

	public static void main(String[] args) {
		String input;
		char choice;
		double areacirc;	double arearec;
		double areasqua;	double areatri;
		double radcirc;		double lengthrec;
		double widthrec;	double heighttri;
		double sidesqua;	double basetri;
		
		
		
		 
		
		
		
		DecimalFormat deci = new DecimalFormat(".##");
		
		choice = JOptionPane.showInputDialog("----------------------------RIZAL TECHNOLOGICAL UNIVERSIY--------------------------\nType C for Circle, S for Square, R for Rectangle, and T for Triangle.\nTo Compute the Area of It").charAt(0);
		
		if(choice == 'c'|| choice=='C')
		{
			input =  JOptionPane.showInputDialog("Enter Radius of a Circle");
			radcirc = Double.parseDouble(input);
			
			areacirc = Math.PI*Math.pow(radcirc,2);
			
			if(radcirc>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Radius of Circle: "+radcirc+"\nArea of Circle:\n    =  "+deci.format(areacirc)+"\n---------------------------------THANKYOU FOR USING---------------------");	
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You Entered Negative Number, Please Enter Positive Number Only","Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if(choice == 's'|| choice=='S')
		{
			input =  JOptionPane.showInputDialog("Enter Side of Square");
			sidesqua = Double.parseDouble(input);
			
			areasqua = Math.pow(sidesqua, 2);
			
			if(sidesqua>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Side of Square: "+sidesqua+"\nArea of Square:\n    =  "+deci.format(areasqua)+"\n-----------------------THANKYOU FOR USING----------------------");		
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You Entered Negative Number, Please Enter Positive Number Only","Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if(choice == 'r'|| choice=='R')
		{
			input =  JOptionPane.showInputDialog("Enter Length of Rectangle");
			lengthrec = Double.parseDouble(input);
			
			input =  JOptionPane.showInputDialog("Enter Width of Rectangle");
			widthrec = Double.parseDouble(input);
			arearec = lengthrec*widthrec;
			if(widthrec>=0 &&lengthrec>=0)
			{
				JOptionPane.showMessageDialog(null, "Inputted Length of Rectangle: "+lengthrec+"\nInputted Width of Rectangle: "+widthrec
					+"\n\nArea of Rectangle:\n    =  "+deci.format(arearec)+"\n--------------------------THANKYOU FOR USING--------------------");		
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You entered a negative number, Please enter positive numbers");
			}
		}
		
		else if(choice == 't'|| choice=='T')
		{
			basetri =  Double.parseDouble(JOptionPane.showInputDialog("Enter Base of Triangle"));
			heighttri =  Double.parseDouble(JOptionPane.showInputDialog("Enter height of triangle"));
			areatri = (basetri*heighttri) *0.5;
			
			if(basetri>=0 &&heighttri>=0)
			{
				JOptionPane.showMessageDialog(null, "user inputted base of triangle: "+basetri+"\nUser inputted height of triangle: "+heighttri
					+"\n\nArea of the rectangle:\n    =  "+deci.format(areatri)+"\n---------------------------THANKYOU FOR USING------------------");	
				
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Please, Enter A Positive Number Only");
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "You entered letters that are out of ranges from the choices");
		}
		
		

	}

}
