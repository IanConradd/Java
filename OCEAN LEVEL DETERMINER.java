import java.util.Scanner;
public class PTASK9 {
	public static void main (String[] args){
		double oceanlevel = 1.5,five,seven,ten;
		Scanner scan = new Scanner (System.in);
		int year,year1,year2,year3;
		System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
	    System.out.println("--------------------OCEAN LEVEL DETERMINER ----------------- \n");
		
		
		
		System.out.println("Enter current year");
		year = scan.nextInt();
		
		year1=year + 5;
		year2=year1 + 7;
		year3= year2 + 10;
		five = oceanlevel * 5;
		System.out.println("The ocean's level in 5 years which is: "+year1+" is at: "+five+" millimeters");
		seven = five * 7;
		System.out.println("The ocean's level in 7 years from "+year1+" which is: "+year2+" is at: "+seven+" millimeters");
		ten = seven * 10;
		System.out.println("The ocean's level in 10 years from "+year2+" which is: "+year3+" is at: "+ten+" millimeters");
		
		System.out.println("");
		
		System.out.println("If it is only from the basis of the given year of the user then this are the results: \n");
		five = oceanlevel * 5;
		System.out.println("The ocean's level in 5 years from "+year+" is at: "+five+" millimeters");
		seven = oceanlevel * 7;
		System.out.println("The ocean's level in 7 years from "+year+" is at: "+seven+" millimeters");
		ten = oceanlevel * 10;
		System.out.println("The ocean's level in 10 years from "+year+" is at: "+ten+" millimeters");
		
		
		
		
		
		
		
	}

}
