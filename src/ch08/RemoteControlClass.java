package ch08;

//�߻�Ŭ��������
public abstract class RemoteControlClass {
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int Volume);

	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
