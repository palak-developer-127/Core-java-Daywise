package Pattern;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int p=1;
		int o=1;
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=1; j<=n; j++) // columns
			{
				if(j%52==0) {
					System.out.print("0 ");
					
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println( );
		}
	}
}
