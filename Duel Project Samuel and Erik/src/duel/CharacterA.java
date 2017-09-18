package duel;

public class CharacterA implements Dueler {

	private int loaded = 0;
	private int firstRound = 0;
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
			if(Math.random() < .5 && loaded == 0 || firstRound == 0) {
				this.loaded = 1;
				this.firstRound = 1;
				return 0;
			}
			else	
				if (Math.random() < .8 || loaded == 0){
					return 2;
				}else {
					this.loaded = 0;
					return 1;
		} 
	}

	public void hit(Object caller) {
	
	}
}
