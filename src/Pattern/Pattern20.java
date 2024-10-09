package Pattern;
/*
 * 		*
 * 	  * * * 
 *   * * * * * 
 *  * * * * * *
 *  
 */
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            // Print leading spaces to align stars
            for(int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars with a space between them
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
      
    }
}

 