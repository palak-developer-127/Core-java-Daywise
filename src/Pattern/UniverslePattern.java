package Pattern;

import java.util.Scanner;

public class UniverslePattern {
	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Enter the size; ");
		int n= src.nextInt();
		 for(int i=1; i<=n; i++) {
	        	for(int j=1; j<=n; j++) {
	        		if(i==0 || i==n-1 || j==0 || j==(n-1) || i==(n/2) || 
	        				j==(n/2) || i==j || i+j==(n-1) || i+j==(n/2) || j-1==(n/2) || i-j==(n/2) || i+j==(n-1)+(n/2) ) {
	        			System.out.print("# ");
	        		}
	        		else {
	        			System.out.print("  ");
	        		}
	        	}
	        	System.out.println( );
	        }
	}
}
