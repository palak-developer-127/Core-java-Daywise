package Pattern;
/*
 * 25 23 24 22 21
 * 20 19 18 17 16
 * 15 14 13 12 11
 * 10 9 8 7 6
 * 5 4 3 2 1 
  */

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int n= src.nextInt();
		int p=n*n;
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=1; j<=n; j++) // columns
			{
				System.out.print(p);
				System.out.print("	");
				p--;
			}
			System.out.println( );
		}
	}

}
