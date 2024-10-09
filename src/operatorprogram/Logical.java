package operatorprogram;

public class Logical {
	public static void main(String[] args) {
		int a=10;
		int b=100;
		int c=1000;
		
		System.out.println("Logical And opratots :");
		boolean a1=(a>5 && b<100 && c<2000);
		System.out.println(a1);
		System.out.println("=================");
		
		System.out.println("Logical or opratots :");
		boolean a2=(a>10 || b>150 || c<2000);
		System.out.println(a2);
		System.out.println("=================");

	}

}
