package Pattern;
/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
import java.util.Scanner;

public class Pattern6 {

		public static void main(String[] args) {
			Scanner src =new Scanner(System.in);
			System.out.println("Enter the size; ");
			
			int n= src.nextInt();
			
			for(int i=1; i<=n; i++)  //rows
			{
				
					System.out.print(i);
					
			}
				System.out.println( );
			
		}
}
