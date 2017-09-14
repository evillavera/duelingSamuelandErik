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
	}
