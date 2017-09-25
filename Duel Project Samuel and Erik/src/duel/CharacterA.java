package duel;

public class CharacterA implements Dueler {
	private int hp;
	private int loaded = 0;
	private boolean round1 = true;
	
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
		System.out.println("You smell like poopy! ");
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp)
			return true;
		else
			return false;
	}
	

	public int getAction(Object caller) {
			if (caller instanceof Duel) {
				if (round1) {
					round1 = false;
					loaded = 1;
					return 0;
				}
				if(loaded == 0) {
					if(Math.random() > .2) {
						loaded = 1;
						return 0;
					}
					else return 2;
				}
				else 
					if(Math.random() > .5) {
						loaded = 0;
						return 1;
					}
					else return 2;
			} else
				return 3;
	}

	public void hit(Object caller) {
			if (caller instanceof Duel) {
				this.hp -= 10;
			}
	}
}
