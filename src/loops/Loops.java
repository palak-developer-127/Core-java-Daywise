package loops;

public class Loops {
	public static void main(String[] args) {
		
		System.out.println("======= for loop ========");
		System.out.println("----------------------------");
		for( int i=1; i<=10; i++) {
			System.out.println("Tomorrow back up class 10am");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("======= while loop ========");
		System.out.println("----------------------------");
		int a=1;
		while(a<=10) {
			System.out.println("Tomorrow back up class 10:30am");
			a++;
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("======= do while loop ========");
		System.out.println("----------------------------");
		int j=1;
		do {
			System.out.println("Tomorrow back up class 11:30am");
			j++;
		}while(j<=-10);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
	}

}
