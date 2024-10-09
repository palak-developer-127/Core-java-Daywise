package typecasting;

// explicit type casting
class Program1 {
	public static void main(String args[])
	{
		long l=123;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
	}
}
