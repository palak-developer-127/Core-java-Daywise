package com.loaclvariable;

class Calculatror{
	void add() {
		int a=100;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("=============");

	}
	void sub() {
		int a=100;
		int b=20;
		int c=a-b;
		System.out.println(c);
		System.out.println("=============");

	}
	void mul() {
		int a=100;
		int b=20;
		int c=a*b;
		System.out.println(c);
		System.out.println("=============");

	}
	void div() {
		int a=100;
		int b=20;
		int c=a/b;
		System.out.println(c);
		System.out.println("=============");

	}
}
public class Localvariable {
		public static void main(String[] args) {
			Calculatror c=new Calculatror();
			c.add();
			c.sub();
			c.mul();
			c.div();
		}
}
