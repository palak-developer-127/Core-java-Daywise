package Pattern;
/*
 * - - - - - # # # # #
 * - - - - # # # # #
 * - - - # # # # #
 * - - # # # # #
 * - # # # # #
 */

import java.util.Scanner;

public class Pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();

       
        for (int i = 1; i <= n; i++) {
           
            for (int j = i; j < n; j++) {
                System.out.print("- ");
            }
            
            
           
          
            for (int j = 1; j <= n; j++) {
                System.out.print("# ");
            }

           
            System.out.println();
        }
    }
}

