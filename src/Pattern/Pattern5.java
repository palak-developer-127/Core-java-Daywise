package Pattern;

import java.util.Scanner;


public class Pattern5 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=1; j<=n; j++) // columns
			{
				System.out.print("#  ");
				System.out.print(" ");
			}
			System.out.println( );
		}
	}

}
