package ch08;

public class Overwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		CharacterInterface ch;
		ch = new Mac();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		
		ch = new Genzi();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cSkill(ch);
		player.cAttack(ch);
	}

}
