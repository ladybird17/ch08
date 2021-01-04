package ch08;

public class Player {
	public void cMove(CharacterInterface c) {
		c.move();
	}
	
	public void cStop(CharacterInterface c) {
		c.stop();
	}
	
	public void cAttack(CharacterInterface c) {
		c.attack();
	}
	
	public void cSkill(CharacterInterface c) {
		c.skill();
	}
}
