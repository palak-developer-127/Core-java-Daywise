package Pattern;
/*
 1
 22
 333
 4444
 5555
 */
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        // Rows
        for (int i = 1; i <= n; i++) {
            // Columns
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
        
    }
}
