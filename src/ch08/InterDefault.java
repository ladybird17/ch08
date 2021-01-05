package ch08;
//디폴트메서드 사용하기
public interface InterDefault {

	//추상메서드
	public void method1();
	public void method2();
	
	//디폴트 메서드
	public default void defaultMethod() {
		System.out.println("InterDefault 인터페이스의 디폴트 메서드");
	}
}
