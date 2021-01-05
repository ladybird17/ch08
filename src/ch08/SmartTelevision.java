package ch08;

//인터페이스 다중 상속
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume = 0;
	
	@Override
	public void search(String url) {
		System.out.printf("%s을 검색합니다.\n",url);
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int Volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.printf("현재 스마트 TV의 볼륨은 %d입니다.\n",this.volume);

	}

}
