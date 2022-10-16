
package ptask5;
import java.util.Scanner;
public class PTASK5 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("---------------------PRELIMINARY GRADE DETERMINER----------------- \n");
        
        String name,course;
        double quiz,sw,labExer,assigns,prelEx,prelGrade;
        
        System.out.print("Enter the student's full name: ");
        name = scan.nextLine();
        
        System.out.print("Enter the student's course: ");
        name = scan.nextLine();
        
        System.out.print("Enter the student's grade in quiz: ");
        quiz = scan.nextDouble();
        
        System.out.print("Enter the student's grade in seatwork: ");
        sw = scan.nextDouble();
        
        System.out.print("Enter the student's grade in Laboratory Exercise: ");
        labExer = scan.nextDouble();
        
        System.out.print("Enter the student's grade in assignments: ");
        assigns = scan.nextDouble();
        
        System.out.print("Enter the student's grade in prelim examination: ");
        prelEx = scan.nextDouble();
        System.out.println("\n");
        
        prelGrade = (quiz * 0.25)+(sw * 0.10)+(labExer * 0.20)+(assigns * 0.5)+(prelEx * 0.40);
        
        System.out.println("The preliminary Grade of the student is: "+prelGrade);
        System.out.println("\n");
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
        
        
        
        
    }
    
}
