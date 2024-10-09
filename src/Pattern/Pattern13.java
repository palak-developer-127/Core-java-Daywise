package Pattern;
/*
 *  15 
	14 13 
	12 11 10 
	9  8 7  6 
	5 4 3  2 1 
 */
import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int count=n*(n+1)/2;

        // Rows
        for (int i = 1; i <= n; i++) {
            // Columns
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(count);
                System.out.print(" ");
                count--;
            }
           
            System.out.println();
        }
        
    }
}
