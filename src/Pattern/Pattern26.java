package Pattern;

import java.util.Scanner;

public class Pattern26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(i==0 || j==0 || i==n-1 || j==n-1 ) 
        		{
        			System.out.print("1 ");
        		}
        		else if(i==j&&i+j==n-1)
        		{
        			System.out.print("3");
        		}
        		else {
        			System.out.print("2 ");
        		}
        	}
        	System.out.println( );
        }
	}
}
