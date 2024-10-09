package Array;

import java.util.Scanner;

class ArrayOperatiopn3{
	int arr[][];
	int cls;
	Scanner sc=new Scanner (System.in);
	
	void createArray(int n) {
		cls=n;
		arr=new int[n][];
		System.out.println("collecting student count for each calss:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the student count inside  calss no:"+(i+1));
			int stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("Araay is created suceesfully:");
		System.out.println("====================");
	}
	
	void addData( ){
		System.out.println("Collecting array data:");
		for(int i=0; i<arr.length;i++) {
			System.out.println("inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j]=sc.nextInt();
			}	
		}
		System.out.println("marks sucessfully collected");
		System.out.println("=============");
	}
		
		void display( ){
			System.out.println("Collecting array data:");
			for(int i=0; i<arr.length;i++) {
				System.out.println("inside class no:"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the marks of student no: "+(j+1)+"is= "+arr[i][j]);
				}	
			}
	}
}

public class Array3 {
	
	public static void main(String[] args) {
		ArrayOperatiopn3 a03=new ArrayOperatiopn3();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the class count:");
		int cls=sc.nextInt();
		
		a03.createArray(cls);
		a03.addData();
		a03.display();
		
		
	}
}
