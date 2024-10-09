package Pattern;
/*
 *  1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 

 */
import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        

        // Rows
        for (int i = 0; i <= n; i++) {
            // Columns
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(j);
                System.out.print(" ");
            }
           
            System.out.println();
        }
        
    }
}
