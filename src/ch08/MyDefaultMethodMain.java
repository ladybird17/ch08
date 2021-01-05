package ch08;

public class MyDefaultMethodMain {

	public static void main(String[] args) {
		MyInterface my1 = new MyClassA();
		my1.method1();
		my1.method2();
		
		MyInterface my2 = new MyClassB();
		my2.method1();
		my2.method2();
	}

}
