import java.util.List;

public class ComputerPlayer extends Player{
	private int potionCount;
	private Pokemon myPokemon;
	
	public ComputerPlayer(Pokemon myPokemon) {
		super(myPokemon);
		this.myPokemon = myPokemon;
	}
	
	public int computerChoice(Pokemon myPokemon, Pokemon other) {
		int chosenAttack = 0;
		
		if (myPokemon.getAttacks().get(0).getmovePowerPoints() <= 0 && myPokemon.getAttacks().get(1).getmovePowerPoints() <= 0 
	    		&& myPokemon.getAttacks().get(2).getmovePowerPoints() <= 0 && myPokemon.getAttacks().get(3).getmovePowerPoints() <= 0) {
	    	return 6;
	    }
		
		else if ("Milotic".equals(myPokemon.getName()) && myPokemon.getMaxHitPoints() * 0.25 > myPokemon.getHitPoints() && myPokemon.getAttacks().get(3).getmovePowerPoints() > 0) {
		    chosenAttack = 3;
		}

		else if (myPokemon.getMaxHitPoints() * 0.25 > myPokemon.getHitPoints() && getPotionCount() > 0) {
		    //Use a potion
			return 1;
		}

		else if ("Spiritomb".equals(myPokemon.getName()) && "Healthy".equals(other.getStatus()) && !"Fire".equals(other.getType1()) && !"Fire".equals(other.getType2())
				&& myPokemon.getAttacks().get(2).getmovePowerPoints() > 0) {
			chosenAttack = 2;
		}
		
		else {
			List<Integer> damageList = myPokemon.getDamages(myPokemon, other);
			int max = damageList.get(0);
	        for (int i = 1; i < damageList.size(); i++) {
	        	if (damageList.get(i) > max) {
	                max = damageList.get(i);
	                chosenAttack = i;
	            }
	        }
		}
		
		//Attack.
		if (chosenAttack == 0) {
			return 2;
		}
		else if (chosenAttack == 1) {
			return 3;
		}
		else if (chosenAttack == 2) {
			return 4;
		}
		else if (chosenAttack == 3) {
			return 5;
		}
		
		//Base case that the computer shouldn't reach. Just prevents errors
		return 6;
	}
	
	public void computerAction(int choice, Pokemon myPokemon, Pokemon other, Item potion) {
		//Does the chosen action and decrements its usage by one
		if (choice == 1) {
			potion.useItem(myPokemon, myPokemon.getMaxHitPoints());
			setPotionCount(getPotionCount() - 1);
		}
		
		else if (choice == 2) {
			myPokemon.attack(myPokemon, other, 1);
			myPokemon.getAttacks().get(0).setmovePowerPoints(myPokemon.getAttacks().get(0).getmovePowerPoints() - 1);
		}
		
		else if (choice == 3) {
			myPokemon.attack(myPokemon, other, 2);
			myPokemon.getAttacks().get(1).setmovePowerPoints(myPokemon.getAttacks().get(1).getmovePowerPoints() - 1);
		}
		
		else if (choice == 4) {
			myPokemon.attack(myPokemon, other, 3);
			myPokemon.getAttacks().get(2).setmovePowerPoints(myPokemon.getAttacks().get(2).getmovePowerPoints() - 1);
		}
		
		else if (choice == 5) {
			myPokemon.attack(myPokemon, other, 4);
			myPokemon.getAttacks().get(3).setmovePowerPoints(myPokemon.getAttacks().get(3).getmovePowerPoints() - 1);
		}
		else if (choice == 6) {
			System.out.print(myPokemon.getName() + " has no moves left and can't attack!");
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
