package ch08;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.turnOff();
		
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		
		System.out.println("------인터페이스의 다형성-----");
		/*
		 인터페이스도 다형성 구현 가능
		 인터페이스 타입의 변수는 생성 가능(객체화 불가)
		 인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입 가능
		 */
		
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
		
		rc = audio;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(8);
		rc.turnOff();
	}

}
