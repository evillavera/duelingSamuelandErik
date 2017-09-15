package duel;

public class CharacterA implements Dueler {

	private int hp;

	public CharacterA() {}
	
	public String getName() {
		return "Erik Villavera ";
	}

	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}

	public void taunt() {
		System.out.println("You smell like poop! ");
	}

	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}
}
