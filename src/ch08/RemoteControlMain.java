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
		
		System.out.println("\n-----익명 구현 객체 사용-----\n");
		
		RemoteControl rc1 = new RemoteControl() {
			
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("전원이 켜집니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("전원이 꺼집니다.");
			}
			@Override
			public void setVolume(int volume) {
				if (volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}
				else if(volume <RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				System.out.printf("현재 볼륨은 : %d\n",this.volume);
			}
		};
		
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();
	}

}
