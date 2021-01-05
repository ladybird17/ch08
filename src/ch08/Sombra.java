package ch08;

public class Sombra implements Character2 {

	@Override
	public void attack() {
		System.out.println("솜브라가 기관권총으로 공격합니다.");
	}

	@Override
	public void skill() {
		System.out.println("솜브라가 해킹을 사용합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("솜브라가 궁극기인 EMP를 사용합니다.");
	}

	@Override
	public void left() {
		System.out.println("솜브라가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("솜브라가 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		System.out.println("솜브라가 전진합니다.");
	}

	@Override
	public void backward() {
		System.out.println("솜브라가 후진합니다.");
	}

}
