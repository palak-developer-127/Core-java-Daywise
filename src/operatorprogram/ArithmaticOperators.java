package operatorprogram;

class Arithmatic1 {
    void add(int a, int b) {
        int var1 = a + b;
        System.out.println("Addition is: " + var1);
        System.out.println("==================");
    }

    void sub(int a, int b) {
        int var2 = a - b;
        System.out.println("Subtraction is: " + var2);
        System.out.println("==================");
    }

    void mul(int a, int b) {
        int var3 = a * b;
        System.out.println("Multiplication is: " + var3);
        System.out.println("==================");
    }

    void div(int a, int b) {
        int var4 = a / b;
        System.out.println("Division is: " + var4);
        System.out.println("==================");
    }

    void mode(int a, int b) {
        int var5 = a % b;
        System.out.println("Modulus is: " + var5);
        System.out.println("==================");
    }
}

public class ArithmaticOperators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        Arithmatic1 a1 = new Arithmatic1();
        a1.add(a, b);
        a1.sub(a, b);
        a1.mul(a, b);
        a1.div(a, b);
        a1.mode(a, b);
    }
}
