package scannerpro;

import java.util.Scanner;


public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enret the byte value:");
		byte b=sc.nextByte();
		System.out.println("Byte value is :"+b);
		System.out.println("--------------------------");
		
		System.out.println("Enret the short value:");
		short s=sc.nextShort();
		System.out.println("short value is :"+s);
		System.out.println("--------------------------");
		
		System.out.println("Enret the int value:");
		int i=sc.nextInt();
		System.out.println("int value is :"+i);
		System.out.println("--------------------------");
		
		System.out.println("Enret the long value:");
		long l=sc.nextLong();
		System.out.println("long value is :"+l);
		System.out.println("--------------------------");
		
		System.out.println("Enret the string value:");
		String str=sc.next();
		System.out.println("string value is :"+str);
		System.out.println("--------------------------");
		
		System.out.println("Enret the float value:");
		float f=sc.nextFloat();
		System.out.println("float value is :"+f);
		System.out.println("--------------------------");
		
		System.out.println("Enret the double value:");
		double d=sc.nextDouble();
		System.out.println("double value is :"+d);
		System.out.println("--------------------------");

		System.out.println("Enret the string statement  value:");
		String str1=sc.nextLine();
		System.out.println("string statemnet value is :"+str1);
		System.out.println("--------------------------");
		
	}
}
