package operatorprogram;

public class Identifier1 {
	public static void main(String[] args) {
		System.out.println("==== Identifier1 =======");
		int a=10;
		int abcd=10;
		int aaaaaaaaaaaaaaaaaaaaaaaaa=100;
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa=1000;
		int aaa=100;
		int _s=40;
		int $abc=400;
		
		// not consider in java 
		//int &pa=50; //error
		//int 123pal=60; // error
		
		System.out.println(a);
		System.out.println(abcd);
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaa);
		System.out.println(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);
		System.out.println(aaa);
		System.out.println(_s);
		System.out.println($abc);
		// System.out.println(&pa);
		// System.out.println(123pal);
		
	}
}
