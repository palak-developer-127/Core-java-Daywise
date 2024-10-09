package Pattern;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=n; j>=i; j--) // columns
			{
				System.out.print("-");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print(j+" ");
			}
			System.out.println( );
		}
		for(int i=n; i>=1; i--)  //rows
		{
			for(int j=1; j<=(n+1)-i; j++) // columns
			{
				System.out.print("- ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print(j+" ");
			}
			System.out.println( );
		}
	}
}
