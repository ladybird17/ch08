package ch08;

public abstract class ImplClass implements Inter {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inter에서 상속받은 추상메서드1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Inter에서 상속받은 추상메서드2");
	}

//	@Override
//	public void method3() {
//		// TODO Auto-generated method stub
//		구현하지 않을 경우 해당 클래스는 추상 클래스가 된다.
//	}

}
