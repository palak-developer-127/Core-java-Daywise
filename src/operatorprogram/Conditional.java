package operatorprogram;

public class Conditional {
	public static void main(String[] args) {
		System.out.println("===== conditional operators ====");
		int a=100;
		int b=70;
		System.out.println("value of :"+a);
		System.out.println("va;ue of :"+b);
		System.out.println("=============");
		
		boolean var1= a>b;
		System.out.println("greater then value is :"+var1);
		System.out.println("==============================");
		
		boolean var2= a<b;
		System.out.println("less then value is :"+var2);
		System.out.println("==============================");
		
		boolean var3= a>=b;
		System.out.println("greater then or equalto value is :"+var3);
		System.out.println("==============================");
		
		boolean var4= a<=b;
		System.out.println("less then or equalto value is :"+var4);
		System.out.println("==============================");
		
		boolean var5= a==b;
		System.out.println("equal to value is :"+var5);
		System.out.println("==============================");
		
		boolean var6= a!=b;
		System.out.println("note equaltto value is :"+var1);
		System.out.println("==============================");
	}
}
