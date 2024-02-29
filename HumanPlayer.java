//This file needs some changes: Add new menu for multiple items, Make multiple itemCounts for each different item the player can use
import java.util.Scanner;
import java.util.List;

public class HumanPlayer extends Player{
	private int potionCount;
	Scanner turnChoice = new Scanner(System.in);
	Scanner moveChoice = new Scanner(System.in);
	private Pokemon myPokemon;
	
	public HumanPlayer(Pokemon myPokemon) {
		super(myPokemon);
		this.myPokemon = myPokemon;
	}

	public int humanChoice(Pokemon myPokemon, Pokemon other, List<Pokemon> team) {
	    // Creates scanners to ask the player what they want to do and performs it based on their input.
	    int faintedCounter = 0;
		System.out.println("What would you like to do?");
	    System.out.println("1. Attack");
	    System.out.println("2. Item");
	    System.out.println("3. Switch Pokemon");
	    int answerForTurnChoice = turnChoice.nextInt();

	    // Attack
	    if (answerForTurnChoice == 1) {
	        return selectAttack(myPokemon);
	    }

	    // Item
	    else if (answerForTurnChoice == 2) {
	        if (getPotionCount() == 0) {
	        	System.out.println("You have no potions left!");
	        	return humanChoice(myPokemon, other, team);
	        }
	    	return 1;
	    }

	    // Switch
	    else if (answerForTurnChoice == 3) {
	    	for (int i = 0; i < 6; i++) {
				if (team.get(i).getStatus() == "Fainted") {
					faintedCounter++;
				}
			}
	    	
	    	if (faintedCounter == 5) {
	    		System.out.println("You don't have any other party members to switch to!");
	    		return humanChoice(myPokemon, other, team);
	    	}
	    	
	    	else {
	    		faintedCounter = 0;
	    		return 2;
	    	}
	    }

	    // Throws an error if an invalid input is given.
	    else {
	        System.out.println("Invalid Input. Please enter 1, 2, or 3");
	        // Recursive call
	        return humanChoice(myPokemon, other, team);
	    }
	}

	private int selectAttack(Pokemon myPokemon) {
	    // Creates scanners to ask the player which attack they want to use and performs it based on their input.
	    System.out.println("Which attack do you want to use?");
	    System.out.println(myPokemon.getAttacks());
	    System.out.print("Enter 1, 2, 3, or 4: ");
	    int answerForMoveChoice = moveChoice.nextInt();

	    if (answerForMoveChoice >= 1 && answerForMoveChoice <= 4) {
	        return answerForMoveChoice + 2; // Convert move choice to corresponding action code
	    } 
	    else {
	        // Throws an error if an invalid input is given.
	        System.out.println("Invalid input given. Please type either 1, 2, 3, or 4.");
	        // Recursive call
	        return selectAttack(myPokemon);
	    }
	}
	
	public void humanAction(int choice, Pokemon myPokemon, Pokemon other, List<Pokemon> team, Item potion) {
		if (choice == 1) {
			potion.useItem(myPokemon, myPokemon.getMaxHitPoints());
			setPotionCount(getPotionCount() - 1);
		}
		
		else if (choice == 2) {
			System.out.print("");
		}
		
		else if (choice == 3) {
			myPokemon.attack(myPokemon, other, 1);
		}
		
		else if (choice == 4) {
			myPokemon.attack(myPokemon, other, 2);
		}
		
		else if (choice == 5) {
			myPokemon.attack(myPokemon, other, 3);
		}
		
		else if (choice == 6) {
			myPokemon.attack(myPokemon, other, 4);
		}
	}

	//Mutators.
	public Pokemon getMyPokemon() {
		return myPokemon;
	}

	public void setMyPokemon(Pokemon myPokemon) {
		this.myPokemon = myPokemon;
	}
	
	public void closeScanners() {
        turnChoice.close();
        moveChoice.close();
    }

	public int getPotionCount() {
		return potionCount;
	}

	public void setPotionCount(int potionCount) {
		this.potionCount = potionCount;
	}
}
