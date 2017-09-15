package duel;

public class CharacterB implements Dueler {

	private int hp;
	public CharacterB() {
	}
	
	
	public String getName() {
		return "Samuel Khong ";
	}

	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}

	public void taunt() {
		System.out.println("You look like a monkey");
	}


	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int getAction(Object caller) {
		
		return 0;
	}


	@Override
	public void hit(Object caller) {
		
	}
}

