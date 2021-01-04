package ch08;

public interface RemoteControl {
	
	/*
	 �������̽��� ���� �� �ִ� �����
	 -�������(���,�����޼���),
	 -�߻�޼���,
	 -����Ʈ �޼���
	 
	 �������̽��� ���� �� �ִ� ��������� �����.
	 final static Ű���尡 ������ ��.
	 */
	
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	/*
	 �������̽��� ������ �ִ� �޼���� �߻�޼����.
	 ���� abstract Ű���带 �����ص� �������.
	 */
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	
	/*
	 default �޼���� �Ϲ� �޼���� ����.
	 default Ű���� �ݵ�� ���,
	 public ���������ڰ� �⺻ 
	*/
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	/*
	 ���� �޼��嵵 �������̽��� ���
	 public ���� �����ڰ� �⺻��
	 */
	public static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
