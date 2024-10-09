package Pattern;

import java.util.Scanner;
/*
 # # # # #
 */
public class Pattern3 {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		
		int n= src.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("#  ");
		}
	}

}