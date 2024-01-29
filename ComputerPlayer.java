//This file needs large changes: AI implementation?(Computer always targets weaknesses or does the highest amount of damage), Same changes as HumanPlayer too.
import java.util.List;

public class ComputerPlayer extends Player{
	private int potionCount;
	private Pokemon myPokemon;
	
	public ComputerPlayer(Pokemon myPokemon) {
		super(myPokemon);
		this.myPokemon = myPokemon;
	}
	
	public int computerChoice(Pokemon myPokemon, Pokemon other) {
		//Add conditions for Pokemon Specific moves such as burn if target is healthy, use recover if low on hp, etc
		
		if (myPokemon.getMaxHitPoints() * 0.25 > myPokemon.getHitPoints() && getPotionCount() > 0) {
			return 1;
		}
		
		int highestDamageIndex = 0;
		List<Integer> damageList = myPokemon.getDamages(myPokemon, other);
		int max = damageList.get(0);
		
        for (int i = 1; i < damageList.size(); i++) {
            if (damageList.get(i) > max) {
                max = damageList.get(i);
                highestDamageIndex = i;
            }
        }
		
		//Attack.
		if (highestDamageIndex == 0) {
			return 2;
		}
		else if (highestDamageIndex == 1) {
			return 3;
		}
		else if (highestDamageIndex == 2) {
			return 4;
		}
		else if (highestDamageIndex == 3) {
			return 5;
		}
		
		//Base case that the computer shouldn't reach. Just prevents errors
		return 2;
	}
	
	public void computerAction(int choice, Pokemon myPokemon, Pokemon other, Item potion) {
		if (choice == 1) {
			potion.useItem(myPokemon, myPokemon.getMaxHitPoints());
			setPotionCount(getPotionCount() - 1);
		}
		
		else if (choice == 2) {
			myPokemon.attack(other, 1);
		}
		
		else if (choice == 3) {
			myPokemon.attack(other, 2);
		}
		
		else if (choice == 4) {
			myPokemon.attack(other, 3);
		}
		
		else if (choice == 5) {
			myPokemon.attack(other, 4);
		}
	}

	
	//Mutators.
	public Pokemon getMyPokemon() {
		return myPokemon;
	}

	public void setMyPokemon(Pokemon myPokemon) {
		this.myPokemon = myPokemon;
	}

	public int getPotionCount() {
		return potionCount;
	}

	public void setPotionCount(int potionCount) {
		this.potionCount = potionCount;
	}
}
