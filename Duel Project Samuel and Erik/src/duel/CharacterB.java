package duel;

public class CharacterB implements Dueler {

	private int hp;
	private boolean isLoaded = false;
	private boolean round1 = true;
	
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

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp)
			return true;
		else
			return false;
	}

	public int getAction(Object caller) {
		if (caller instanceof Duel) {
			if(round1) {
				round1 = false;
				isLoaded = true;
				return 0;
			}
			if(!isLoaded)
				if((Math.random()) < .5) {
					isLoaded = true;
					return 0;
				}
				else
					return 2;
			else
				if((Math.random()) < .5) {
					isLoaded = false;
					return 1;
				}
				else
					return 2;
		}
		else
			return 3;
	}

	public void hit(Object caller) {
		if (caller instanceof Duel) 
			this.hp -= 10;
	}
}

