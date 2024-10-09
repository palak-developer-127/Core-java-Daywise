package Array;
import java.util.Scanner;
class ArrayOperatiopn1{
	int arr[];
	int size;
	
	void createArray(int n) {
		size=n;
		arr=new int[size];
		System.out.println("Araay is created suceesfully:");
		System.out.println("====================");
	}
	
	void addData( ){
		Scanner sc=new Scanner (System.in);
		System.out.println("Collecting array data:");
		for(int i=0; i<size;i++) {
			System.out.println("Enter the marks of student no:"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
		
		void display( ){
			System.out.println("display the marksa");
			for(int i=0; i<size;i++) {
				System.out.println(" the marks of student no:"+(i+1)+"is = "+arr[i]);
				
			}	
	}
}
public class Array {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the count of students:");
			int n=sc.nextInt();
			
			ArrayOperatiopn1 a01=new ArrayOperatiopn1();
			a01.createArray(n);
			a01.addData();
			a01.display();
			
			
		}
}
