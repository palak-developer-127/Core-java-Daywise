package Pattern;
/*
 * 1 
   1 1 
   1 1 1 
   1 1 1 1 
   1 1 1 1 1 
 */
import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int p=1;

        // Rows
        for (int i = 1; i <= n; i++) {
            // Columns
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(p);
                System.out.print(" ");
            }
           
            System.out.println();
        }
        
    }

}
