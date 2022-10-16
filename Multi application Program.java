
package Test;




import java.util.Scanner;

public class Test
{

public static void main (String args[]){

	Scanner scan = new Scanner (System.in);

         String nameagain;
         String appagain;
         String gradeagain;
         String pyragain;
         String leapagain;
         int choice;

        System.out.println("\n ==================================================");
	   System.out.println(" ||Welcome to Baarde's multi application program||");
           System.out.println(" ==================================================\n");

	do{

           System.out.println(" Press\n 1 for Name program\n 2 for Getting the Average of a student\n 3 for displaying of triangles\n 4 for Determining if the given year is a leap year  ");
           System.out.print(" Please choose the desired program to use: ");
           choice = scan.nextInt();

           if(choice > 4 || choice < 1){

               System.out.println("\n\n PLEASE ENTER WITHIN THE RANGES OF NUMBERS ONLY ");
               scan.nextLine();
           }

           if(choice == 1){
			   System.out.println("\n NAME IDENTIFIER\n ");
               String first;
               String mid;
               String last;
               String namechoice;
               scan.nextLine();
               System.out.print("\n Please enter your first name: ");
               first = scan.nextLine();

               System.out.print(" Please enter your middle name: ");
               mid = scan.nextLine();

               System.out.print(" Please enter your last name: ");
               last = scan.nextLine();

               do {

               System.out.print("\n How do you want to display your name? horizontally or vertically?\n (hor = horizontal/ver = vertical)\n note: Double enter after choosing => ");
               namechoice = scan.nextLine();
               scan.nextLine();
                    if(namechoice.equals("ver") || namechoice.equals("Ver")||namechoice.equals("VER")){
                        System.out.println("\n "+first);
                        System.out.println(" "+mid);
                        System.out.println(" "+last+"\n\n");

                        String verchoice;
                        System.out.print("\n Do you want to display last name first? (yes or no) ");
                        verchoice = scan.nextLine();

                        if (verchoice.equals("yes")||verchoice.equals("y")||verchoice.equals("YES")||verchoice.equals("Yes")){
                            System.out.println("\n "+last+",");
                            System.out.println(" "+first);
                            System.out.println(" "+mid);
                        }

                    }

                    if(namechoice.equals("hor") || namechoice.equals("Hor")||namechoice.equals("HOR")){
                        System.out.print("\n "+first+" "+mid+" "+last+"\n");
                        String horchoice;
                        System.out.print("\n Do you want to display last name first? (yes or no) ");
                        horchoice = scan.nextLine();
                        if(horchoice.equals("yes") || horchoice.equals("Yes")||horchoice.equals("y") ||horchoice.equals("Y") || horchoice.equals("YES")){
                        System.out.println("\n "+last+", "+first+" "+mid+"\n");
                        }
                    }



            System.out.print("\n Do you want to try again? ");
            nameagain = scan.nextLine();
           } while(nameagain.equals("yes")||nameagain.equals("y")||nameagain.equals("Yes")||nameagain.equals("YES"));



           }
            if(choice == 2){
                do{
					System.out.println("\n GRADE DETERMINER\n ");
                   String namestudlast;
                   String namestudfirst;
                   String namestudmid;
                   scan.nextLine();
                   System.out.print("\n Enter the last name of the student: ");
                   namestudlast = scan.nextLine();
                   System.out.print(" Enter the first name of the student: ");
                   namestudfirst = scan.nextLine();
                   System.out.print(" Enter the middle initial of the student: ");
                   namestudmid = scan.nextLine();

                   float sci;
                   float fil;
                   float math;
                   float eng;
                   float result;
                   System.out.print("\n Enter the grade for Science: ");
                   sci = scan.nextFloat();
                   System.out.print("\n Enter the grade for Filipino: ");
                   fil = scan.nextFloat();
                   System.out.print("\n Enter the grade for Math: ");
                   math = scan.nextFloat();
                   System.out.print("\n Enter the grade for English: ");
                   eng = scan.nextFloat();

                   result = (sci+fil+math+eng)/4;

                   System.out.print("\n Student: "+namestudlast+", "+namestudfirst+" "+namestudmid);
                   System.out.print("\n The result is: "+ result);

                   System.out.println("\n\n REMARKS: ");
                   if(result == 75 || result == 74.5){
                       System.out.print(" PASSED");
                   }
                   if(result < 74.5){
                       System.out.print(" FAILED");
                   }

                   System.out.println("\n\n");
                   scan.nextLine();
                   System.out.print("\n Do you want to try again: ");
                   gradeagain = scan.nextLine();
                }while(gradeagain.equals("yes")||gradeagain.equals("Yes")||gradeagain.equals("y")||gradeagain.equals("Y")||gradeagain.equals("YES"));
               }
            if(choice == 3){
                do{
				System.out.println("\n PYRAMID/TRIANGLE AND A DIAMOND\n ");
                int pyrchoice;
                System.out.println("\n\n What kind of triangle/diamond do you want? ");
                System.out.println(" Press:");
                System.out.println(" 1 for a Half right triangle");

                System.out.println(" 2 for a Half diamond");

                System.out.println(" 3 for a Triangle");

                System.out.print(" 4 for a Diamond\n => ");
                pyrchoice = scan.nextInt();
                if(pyrchoice > 4){
                    System.out.println("\n PLEASE ENTER WITHIN THE RANGES OF NUMBERS ONLY ");
                    scan.nextLine();
                }
                if(pyrchoice==1){
                     int rows = 10;

                        for(int i = 1; i <= rows; ++i) {
                        for(int j = 1; j <= i; ++j) {
                         System.out.print("* ");
                             }
                         System.out.println();
                                }

                }
                if(pyrchoice == 2){
                     for(int i = 1; i <= 10; ++i) {
                        for(int j = 1; j <= i; ++j) {
                             System.out.print("* ");
                             }
                                System.out.println();
                                    }

                                for(int i = 9; i >= 0; --i) {
                                    for(int j = 1; j <= i; ++j) {
                                         System.out.print("* ");
                                    }
                                        System.out.println();
                                                    }

                }
                if(pyrchoice == 3){
                    int rows = 10, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

                }
                if(pyrchoice == 4){
                    int rows = 10, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for(int i = rows; i >= 1; --i) {
		            for(int space = 1; space <= rows - i; ++space) {
		                System.out.print("  ");
		            }

		            for(int j=i; j <= 2 * i - 1; ++j) {
		                System.out.print("* ");
		            }

		            for(int j = 0; j < i - 1; ++j) {
		                System.out.print("* ");
		            }

		            System.out.println();
        }

                }
                    scan.nextLine();
                    System.out.print("\n Do you want to try different triangle/pyramid? ");
                    pyragain = scan.nextLine();
                }while(pyragain.equals("yes")||pyragain.equals("Yes")||pyragain.equals("y")||pyragain.equals("Y")||pyragain.equals("YES"));
            }
            if(choice == 4){
                do{
                int yr;
                int result;

                    System.out.println("\n LEAP YEAR DETERMINER ");
                System.out.print("\n\n Enter a year: ");
                yr = scan.nextInt();

                result = yr % 4;

                if (result == 1){
                    System.out.println("\n Leap year is in 3 years and last year is leap year ");
                }
                if (result == 2){
                    System.out.println("\n Leap year is in years and last 2 years is leap year ");
                }
                if (result == 3){
                    System.out.println("\n Leap year is in 1 year and last 3 years is leap year ");
                }
                if (result == 0){
                    System.out.println("\n This year is a leap year ");
                }
                    scan.nextLine();
                    System.out.print("\n\n Do you want to try again? ");
                    leapagain = scan.nextLine();
                }while(leapagain.equals("yes")||leapagain.equals("Yes")||leapagain.equals("y")||leapagain.equals("Y")||leapagain.equals("YES"));
            }



	System.out.print("\n Do you want to pick an another program? ");
        appagain = scan.nextLine();
        System.out.println("\n\n");
        } while(appagain.equals("yes")||appagain.equals("Yes")||appagain.equals("y")||appagain.equals("YES"));

	if(appagain.equals("no")||appagain.equals("No")||appagain.equals("n")||appagain.equals("N")||appagain.equals("NO")){
                System.out.println("\n\t =============================================================");
                System.out.println("\n\t     THANKYOU FOR USING BAARDE'S MULTI APPLICATION PROGRAM ");
                System.out.println("\n\t SPECIAL THANKS TO SIR REYNALDO ALVEZ FOR EDUCATING US WITHOUT\n\t\t   HASTE AND WITH UTMOST CONSIDERATION ");
                System.out.println("\n\t\t    YOU SIR DESERVE THE BEST IN LIFE!! \n\n");
                 System.out.println("\t ==============================================================\n");
        }









	}
	}