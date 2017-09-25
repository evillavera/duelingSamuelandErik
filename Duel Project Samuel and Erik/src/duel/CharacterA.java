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

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp)
			return true;
		else
			return false;
	}
	

	public int getAction(Object caller) {
			if (caller instanceof Duel) {
				return (int) Math.round(Math.random()*2);
			} else
				return 3;
	}

	public void hit(Object caller) {
			if (caller instanceof Duel) {
				this.hp -= 10;
			}
	}
}
