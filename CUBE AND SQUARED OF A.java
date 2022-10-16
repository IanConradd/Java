
package ptask6;

import java.util.Scanner;
public class PTASK6 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double num,squared,cube;
        System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
        System.out.println("--------------------CUBE AND SQUARED OF A ----------------- \n");
        
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        
        squared = Math.pow(num, 2);
        cube = Math.pow(num, 3);
        System.out.println("The cube of the number is: "+cube);
        System.out.println("The squared of the number is: "+squared);
        System.out.println("");
        
        System.out.println("---------------------THANKYOU FOR USING----------------------");
        
        
        
        
        
    }
    
}
