import java.util.Scanner;
public class PTASK6B {
	
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	int empnum;
	String emplastname,empfirstname;
	double rate,hrswork,gross,sssdeduc,taxwith,totdeduc,net;
	System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
    System.out.println("--------------------EMPLOYEE DATA ----------------- \n");
    
	
	
	System.out.println("Enter employee last name: ");
	emplastname = scan.nextLine();
	
	System.out.println("Enter employee first name: ");
	empfirstname = scan.nextLine();
	
	System.out.println("");
	
	System.out.println(emplastname + "," + empfirstname + "\n");
	
			System.out.println("Enter employee number: ");
			empnum = scan.nextInt();
			
			System.out.print("Enter rate per hour: ");
			rate = scan.nextDouble();
			System.out.print("Enter number of hours worked: ");
			hrswork = scan.nextDouble();
			
			gross = rate * hrswork;
			
			sssdeduc = gross * 0.5;
			taxwith = gross * 0.10;
			totdeduc = sssdeduc + taxwith;
			net = gross - totdeduc;
			
			System.out.println("Grosspay: "+gross);
			System.out.println("SSS Deduction: "+sssdeduc);
			System.out.println("Tax with hold: "+taxwith);
			System.out.println("Total Deduction: "+totdeduc);
			System.out.println("Net pay: "+net);
			
			
			
			 System.out.println("---------------------THANKYOU FOR USING----------------------");
			
			
			
	
	
	
	

}
}
