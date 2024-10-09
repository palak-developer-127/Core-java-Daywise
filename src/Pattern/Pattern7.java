package Pattern;
/*
 * 1 2 3 4 5 
 * 6 7 8 9 10
 * 11 12 13 14 15 
 * 16 17 18 19 20
 * 21 22 23 24 25 
 */

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int p=1;
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=1; j<=n; j++) // columns
			{
				System.out.print(p);
				System.out.print("	");
				p++;
			}
			System.out.println( );
		}
	}
}
