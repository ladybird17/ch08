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
		
		System.out.println("------�������̽��� ������-----");
		/*
		 �������̽��� ������ ���� ����
		 �������̽� Ÿ���� ������ ���� ����(��üȭ �Ұ�)
		 �������̽� Ÿ���� ������ ���� Ŭ���� Ÿ���� ��ü�� ���� ����
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
