package Array;

import java.util.Scanner;
class ArrayOperatiopn2{
	int arr[][];
	int cls;
	int stu;
	
	void createArray(int n,int m) {
		cls=n;
		stu=m;
		arr=new int[n][m];
		System.out.println("Araay is created suceesfully:");
		System.out.println("====================");
	}
	
	void addData( ){
		Scanner sc=new Scanner (System.in);
		System.out.println("Collecting array data:");
		for(int i=0; i<cls;i++) {
			System.out.println("inside class no:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j]=sc.nextInt();
			}	
		}
		System.out.println("marks sucessfully collected");
		System.out.println("=============");
	}
		
		void display( ){
			System.out.println("Collecting array data:");
			for(int i=0; i<cls;i++) {
				System.out.println("inside class no:"+(i+1));
				for(int j=0;j<stu;j++) {
					System.out.println("Enter the marks of student no: "+(j+1)+"is= "+arr[i][j]);
				}	
			}
	}
}
public class Array2 {
	public static void main(String[] args) {
		ArrayOperatiopn2 a02=new ArrayOperatiopn2();
		Scanner sc=new Scanner(System.in);
		int cls=sc.nextInt();
		System.out.println("Enter the class count:");
		int stu=sc.nextInt();
		System.out.println("Enter the student count:");
		a02.createArray(cls,stu);
		a02.addData();
		a02.display();
		
		
	}
}
