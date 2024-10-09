package Pattern;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int p=1;
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++)  //rows
		{
			for(int j=1; j<=n; j++) // columns
			{
				if(p<10) {
					System.out.print("0"+p+" ");
					p++;
				}
				else {
					
				System.out.print(p+" ");
				p++;
				}
			}
			System.out.println( );
		}
	}
}
