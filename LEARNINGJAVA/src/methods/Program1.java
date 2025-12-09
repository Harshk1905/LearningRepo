package methods;

public class Program1 {

	static int x = 10, y = 5;

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.substractionNoargumentNoreturntypeNonStatic();
		additionArgumentReturntypeStaticMethod(1, 25);
		program1.multiplicationArgumentReturntype(10, 6);
	}

	public static int additionArgumentReturntypeStaticMethod(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public void substractionNoargumentNoreturntypeNonStatic() {
		System.out.println(x - y);
	}

	public int multiplicationArgumentReturntype(int c, int d) {
		System.out.println(c * d);
		return c * d;

	}

}
