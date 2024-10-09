package Array;

import java.util.Scanner;


class ArrayOperation{
	String  arr[][][];
	int college;
	int cls;
	int stu;
	Scanner scanner = new Scanner(System.in);
	
	void createArray(int m,int n,int o) {
		arr = new String[m][n][o];
		System.out.println("Array is created");
		
	}
	void addData() {
		System.out.println("coleecting array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside collage no  = "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside  class no = "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student "+(k+1));
					arr[i][j][k]=scanner.next();
				}
			}
		}
		System.out.println("name is sucessfully  add");
	}
	
	void display() {
		System.out.println("display array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Collage "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Class no = "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" Student "+(k+1)+"marks ="+arr[i][j][k]);
				}
			}
		}
	}
}

public class Array4 {

	public static void main(String[] args) {
		ArrayOperation obj1 = new ArrayOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of collage");
		int n = scanner.nextInt();
		
		System.out.println("Enter the no of class in collage");
		int m = scanner.nextInt();
		
		System.out.println("Enter the no of student count:");
		int o = scanner.nextInt();
		
		obj1.createArray(n, m, o);
		obj1.addData();
		obj1.display();

	}

}