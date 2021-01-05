package ch08;

public class Mac implements CharacterInterface {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 이동합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 이동을 멈춥니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 피스키퍼로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 황야의 무법자를 사용합니다.");
	}

}