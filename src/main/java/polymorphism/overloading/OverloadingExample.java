package polymorphism.overloading;

public class OverloadingExample {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(add(2,3));
		System.out.println(add(2,3,5));
		System.out.println(add("N","K"));
	}

}
