//This file needs large changes: AI implementation?(Computer always targets weaknesses or does the highest amount of damage), Same changes as HumanPlayer too.
import java.util.Random;

public class ComputerPlayer extends Player{
	private int potionCount;
	private Pokemon myPokemon;
	
	public ComputerPlayer(Pokemon myPokemon) {
		super(myPokemon);
		this.myPokemon = myPokemon;
	}
	
	public int computerChoice(Pokemon myPokemon, Pokemon other) {
		//Change this to the proper logic
		Random rand = new Random();
		int int_random = rand.nextInt(2);
		
		//Attack.
		if (int_random == 0) {
			int attack_random = rand.nextInt(4);
			
			if (attack_random == 0) {
				return 2;
			}
			else if (attack_random == 1) {
				return 3;
			}
			else if (attack_random == 2) {
				return 4;
			}
			else if (attack_random == 3) {
				return 5;
			}
		}
		
		//Item.
		else if (int_random == 1) {
			if (getPotionCount() == 0) {
	        	//Just temporary
				System.out.println("CPU tried to use a potion but has no potions left!");
	        	return computerChoice(myPokemon, other);
	        }
			return 1;
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
