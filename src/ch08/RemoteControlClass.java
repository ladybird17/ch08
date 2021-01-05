  
package ch08;

//추상클래스버전
public abstract class RemoteControlClass {
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int Volume);

	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
}