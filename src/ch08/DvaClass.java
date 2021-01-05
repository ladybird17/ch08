package ch08;

//추상클래스만 사용했을 시, MovementClass를 상속받은 AttackClass를 상속받아야 사용가능(단일상속만 가능)
public class DvaClass extends AttackClass {
	@Override
	public void attack() {
		System.out.println("D.Va가 융합포로 공격합니다.");
	}

	@Override
	public void skill() {
		System.out.println("D.Va가 방어 매트릭스를 사용합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("D.Va가 궁극기인 자폭을 사용합니다.");
	}

	@Override
	public void left() {
		System.out.println("D.Va가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("D.Va가 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		System.out.println("D.Va가 전진합니다.");
	}

	@Override
	public void backward() {
		System.out.println("D.Va가 후진합니다.");
	}
	
}
