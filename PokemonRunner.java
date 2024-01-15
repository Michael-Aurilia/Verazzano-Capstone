//This file needs the most changes: Implement speed for turn order, JavaFX, Highest priority on switching Pokemon or using items, User and computer having six Pokemon,
//Battle only ends once a whole team has fainted, Only not fainted Pokemon can battle, Status moves?(Probably not)
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokemonRunner {
	public static void main(String args[]){
		Scanner humanName = new Scanner(System.in);
		Scanner computerName = new Scanner(System.in);
		Scanner initialChoice = new Scanner(System.in);
		Scanner switchChoice = new Scanner(System.in);
		
		Swampert SW = PokemonFactory.createSwampert();
		Jolteon J = PokemonFactory.createJolteon();
		Garchomp G = PokemonFactory.createGarchomp();
		Roserade R = PokemonFactory.createRoserade();
		Milotic MI = PokemonFactory.createMilotic();
		Lucario L = PokemonFactory.createLucario();
		Togekiss T = PokemonFactory.createTogekiss();
		Spiritomb SP = PokemonFactory.createSpiritomb();
		Staraptor ST = PokemonFactory.createStaraptor();
		Abomasnow A = PokemonFactory.createAbomasnow();
		Chandelure C = PokemonFactory.createChandelure();
		Metagross ME = PokemonFactory.createMetagross();
		
		List<Pokemon> humanTeam = new ArrayList<>();
        humanTeam.add(SW);
        humanTeam.add(J);
        humanTeam.add(ST);
        humanTeam.add(A);
        humanTeam.add(C);
        humanTeam.add(ME);

        List<Pokemon> computerTeam = new ArrayList<>();
        computerTeam.add(SP);
        computerTeam.add(MI);
        computerTeam.add(L);
        computerTeam.add(T);
        computerTeam.add(R);
        computerTeam.add(G);
		
		//Start of program
		System.out.println("Welcome To The Pokemon battle simulator!");
		System.out.println("This simulator will pit you against a cpu controlled opponent in a 6v6 Pokemon Battle.");
		System.out.println("The opponent will target your weaknesses to try and deal the most damage possible.");
		System.out.println("You can switch to a different Pokemon at any time to take the hit so long as they have hp left.");
		System.out.println("You only have 3 potions which heals your Pokemon fully so use them wisely!");
		
		System.out.println("Please enter your name: ");
		String playerName = humanName.next();
		
		System.out.println("Enter the computer players name: ");
		String CPUName = computerName.next();
		
		System.out.println("This is your team:" + "\n");
		
		System.out.println(SW + "\n");
		System.out.println(J + "\n");
		System.out.println(ST + "\n");
		System.out.println(A + "\n");
		System.out.println(C + "\n");
		System.out.println(ME + "\n");
		
		System.out.println("And this is the computers team that they will send out in this order:" + "\n");
		
		System.out.println(SP + "\n");
		System.out.println(MI + "\n");
		System.out.println(L + "\n");
		System.out.println(T + "\n");
		System.out.println(R + "\n");
		System.out.println(G + "\n");
		
		System.out.println("Which Pokemon would you like to send out first? (Enter a number 1-6 for your choice): ");
		int answerForInitialChoice = initialChoice.nextInt();
		
		//List of priority in the battle function goes as follows:
		//1. Computers turn decision
		//2. Humans turn decision
		//3. If Human is switching Pokemon then proceed to do so and not give any other action for their turn
		//4. Computer item usage
		//5. Human item usage
		//6. If both Pokemon are set to attack, by comparing the speed stat for which is higher, determine whether the computer or human players Pokemon attacks first. However, a Pokemon can't attack if it has no HP left so check for that before each attack but especially the one who will attack second.
		
		
		//Initializing the start of the battle.
		//Setting up which Pokemon enters first
		HumanPlayer humanPlayer = new HumanPlayer(humanTeam.get(answerForInitialChoice - 1));
		humanPlayer.setMyPokemon(humanTeam.get(answerForInitialChoice - 1));
		
		ComputerPlayer computerPlayer = new ComputerPlayer(computerTeam.get(0));
		computerPlayer.setMyPokemon(computerTeam.get(0));
		
		int humanCurrentPokemon = answerForInitialChoice - 1;
		int computerCurrentPokemon = 0;
		int humanFaintedCounter = 0;
		int computerFaintedCounter = 0;
		
		//Setting up items
		Potion computerPotions = new Potion(computerTeam.get(0));
		Item humanPotions = new Potion(humanTeam.get(answerForInitialChoice - 1));
		computerPlayer.setPotionCount(3);
		humanPlayer.setPotionCount(3);
		
		System.out.println(CPUName + " has challenged you to a battle!");
		System.out.println(CPUName + " sends out " + computerTeam.get(computerCurrentPokemon).getName() + "!");
		System.out.println("You send out " + humanTeam.get(humanCurrentPokemon).getName() + "!");
		//Battle starts here!
		while (true) {
			System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " " + humanTeam.get(humanCurrentPokemon).getHitPoints() + "/" + humanTeam.get(humanCurrentPokemon).getMaxHitPoints());
			System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " " + computerTeam.get(computerCurrentPokemon).getHitPoints() + "/" + computerTeam.get(computerCurrentPokemon).getMaxHitPoints());
			
			//1.)
			int computerChoice = computerPlayer.computerChoice(computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon));
			
			//2.)
			
			int humanChoice = humanPlayer.humanChoice(humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam);
			
			//3.)
			if (humanChoice == 2) {
				while (true) {
					System.out.println("Choose a Pokemon to switch to:");
				    for (int i = 0; i < humanTeam.size(); i++) {
				        Pokemon pokemon = humanTeam.get(i);
				        System.out.println((i + 1) + ". " + pokemon.getName() + " (HP: " + pokemon.getHitPoints() + ")");
				    }

				    int ansSwitchChoice = switchChoice.nextInt();
				    if (ansSwitchChoice >= 1 && ansSwitchChoice <= humanTeam.size()) {
				        Pokemon selectedPokemon = humanTeam.get(ansSwitchChoice - 1);
				        if (selectedPokemon.getHitPoints() > 0 && selectedPokemon != humanTeam.get(humanCurrentPokemon)) {
				        	System.out.println("Enough " + humanTeam.get(humanCurrentPokemon).getName() + " come back!");
				        	humanCurrentPokemon = ansSwitchChoice - 1;
				            System.out.println("Go " + humanTeam.get(ansSwitchChoice - 1).getName() + "!");
				            humanPlayer.setMyPokemon(humanTeam.get(humanCurrentPokemon));
				            break;
				        } 
				        
				        else if (selectedPokemon == humanTeam.get(humanCurrentPokemon)) {
				            System.out.println("You can't switch to the same Pokemon. Choose a different one.");
				        } 
				        
				        else {
				            System.out.println(selectedPokemon.getName() + " has no HP remaining. Choose a different Pokemon.");
				        }
				        } 
				    else {
				        System.out.println("Invalid choice. Please choose a number between 1 and 6");
				    }
				}
			}
			
			//4.)
			if (computerChoice == 1) {
				computerPlayer.computerAction(1, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
			}
			
			//5.)
			if (humanChoice == 1) {
				humanPlayer.humanAction(1, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
			}
			
			//6.)
			if (humanChoice >= 3 && computerChoice != 1) {
				
				//Compare speed for turn order
				if (humanTeam.get(humanCurrentPokemon).getSpeedStat() > computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
					
					//Checks if opposing Pokemon is still alive before readying their attack
					if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
						computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
					}
					
					else {
						computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
						if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
					}
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getSpeedStat() < computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
					
					//Checks if opposing Pokemon is still alive before readying their attack
					if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
						humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
					}
					
					else {
						humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
						if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
					}
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getSpeedStat() == computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					Random rand = new Random();
					int int_random = rand.nextInt(2);
					
					if (int_random == 0) {
						humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
						
						//Checks if opposing Pokemon is still alive before readying their attack
						if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
						
						else {
							computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
							if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
								humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
							}
						}
					}
					
					else if (int_random == 1) {
						computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
						
						//Checks if opposing Pokemon is still alive before readying their attack
						if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
						
						else {
							humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
							if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
								computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
							}
						}
					}
				}
			}
			//Only human attacks
			else if (humanChoice >= 3 && computerChoice == 1) {
				humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
				
				if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
				}
			}
			
			else if (humanChoice < 3 && computerChoice >= 2) {
				computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
				
				if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
					humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
				}
			}
			
			else if (humanChoice < 3 && computerChoice == 1) {
				System.out.println("Neither Pokemon attacked this turn!");
			}
			
			//CPU switches to next Pokemon if current Pokemon has fainted
			if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0 && computerCurrentPokemon != 5) {
				computerCurrentPokemon++;
				computerPlayer.setMyPokemon(computerTeam.get(computerCurrentPokemon));
				System.out.println(CPUName + " has switched to " + computerPlayer.getMyPokemon().getName() + "!");
			}
			
			//Team health checker for human player.
			for (int i = 0; i < 6; i++) {
				if (humanTeam.get(i).getStatus() == "Fainted") {
					humanFaintedCounter++;
				}
			}
			
			if (humanFaintedCounter == 6) {
				//If the entire human team has fainted the game ends in a loss for the player.
				System.out.println(CPUName + ": Better luck next time " + playerName + ". Challenge me again anytime!");
				break;
			}
			
			else {
				humanFaintedCounter = 0;
			}
			
			//Team health checker for computer player.
			for (int j = 0; j < 6; j++) {
				if (computerTeam.get(j).getStatus() == "Fainted") {
					computerFaintedCounter++;
				}
			}
			
			if (computerFaintedCounter == 6) {
				//If the entire computer team has fainted then the human player wins and is congratulated.
				System.out.println(CPUName + ": You have defeated me. Well done " + playerName + "!");
				break;
			}
			
			else {
				computerFaintedCounter = 0;
			}
			
			//Allows the human player to choose who they want to switch to if their Pokemon fainted during the turn
			if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
				humanTeam.get(humanCurrentPokemon).setHitPoints(0);
				while (true) {
					System.out.println("Choose a Pokemon to switch to:");
				    for (int i = 0; i < humanTeam.size(); i++) {
				        Pokemon pokemon = humanTeam.get(i);
				        System.out.println((i + 1) + ". " + pokemon.getName() + " (HP: " + pokemon.getHitPoints() + ")");
				    }

				    int ansSwitchChoice = switchChoice.nextInt();
				    if (ansSwitchChoice >= 1 && ansSwitchChoice <= humanTeam.size()) {
				        Pokemon selectedPokemon = humanTeam.get(ansSwitchChoice - 1);
				        if (selectedPokemon.getHitPoints() > 0 && selectedPokemon != humanTeam.get(humanCurrentPokemon)) {
				        	humanCurrentPokemon = ansSwitchChoice - 1;
				            System.out.println("Go " + humanTeam.get(ansSwitchChoice - 1).getName() + "!");
				            humanPlayer.setMyPokemon(humanTeam.get(humanCurrentPokemon));
				            break;
				        } 
				        
				        else if (selectedPokemon == humanTeam.get(humanCurrentPokemon)) {
				            System.out.println("You can't switch to the same Pokemon. Choose a different one.");
				        } 
				        
				        else {
				            System.out.println(selectedPokemon.getName() + " has no HP remaining. Choose a different Pokemon.");
				        }
				        } 
				    else {
				        System.out.println("Invalid choice. Please choose a number between 1 and 6");
				    }
				}
			}
		}
		System.out.println("Thanks for playing! See you next time!");
		initialChoice.close();
		humanName.close();
		computerName.close();
		switchChoice.close();
	}
}
