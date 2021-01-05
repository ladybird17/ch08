package ch08;

public class InterImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ImplClass impl = new ImplClass();
//		impl.method1();
//		impl.method2();
		//추상클래스는 객체 생성 불가능
		
		ImplClassChild implc = new ImplClassChild();
		implc.method1();
		implc.method2();
		implc.method3();
	}

}
