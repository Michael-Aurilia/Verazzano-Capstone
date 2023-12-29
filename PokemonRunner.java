//This file needs the most changes: Implement speed for turn order, JavaFX, Highest priority on switching Pokemon or using items, User and computer having six Pokemon,
//Battle only ends once a whole team has fainted, Only not fainted Pokemon can battle, Status moves?(Probably not), No running away
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokemonRunner {
	public static void main(String args[]){
		Scanner initialChoice = new Scanner(System.in);
		
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
		System.out.println("This simulator will pit you(Red) against a cpu controlled opponent(Blue) in a 6v6 Pokemon Battle.");
		System.out.println("The opponent will target your weaknesses to try and deal the most damage possible.");
		System.out.println("You can switch to a different Pokemon at any time to take the hit so long as they have hp left.");
		System.out.println("You only have 3 potions which heals your Pokemon fully so use them wisely!");
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

		//Massive changes needed here...
		
		System.out.println("Which Pokemon would you like to send out first? (Enter a number 1-6 for your choice): ");
		int answerForInitialChoice = initialChoice.nextInt();
		
		//List of priority in the battle function goes as follows:
		//1. Computers turn decision
		//2. Humans turn decision
		//3. If Human is switching Pokemon then proceed to do so and not give any other action for their turn
		//4. Computer item usage
		//5. Human item usage
		//6. If both Pokemon are set to attack, by comparing the speed stat for which is higher, determine whether the computer or human players Pokemon attacks first. However, a Pokemon can't attack if it has no HP left so check for that before each attack but especially the one who will attack second.
		//7. Display health of on screen Pokemon only and force a switch if one or both Pokemon have fainted. Then check if one team is completely out of HP at which point the winner is the opposing team. If both teams have at least one Pokemon remaining then battle function loops back and starts again.
		
		//Initializing the start of the battle.
		//Setting up which Pokemon enters first
		HumanPlayer humanPlayer = new HumanPlayer(humanTeam.get(answerForInitialChoice - 1));
		humanPlayer.setMyPokemon(humanTeam.get(answerForInitialChoice - 1));
		
		ComputerPlayer computerPlayer = new ComputerPlayer(computerTeam.get(0));
		computerPlayer.setMyPokemon(computerTeam.get(0));
		
		int humanCurrentPokemon = answerForInitialChoice - 1;
		int computerCurrentPokemon = 0;
		
		//Setting up items
		Potion computerPotions = new Potion(computerTeam.get(0));
		Item humanPotions = new Potion(humanTeam.get(answerForInitialChoice - 1));
		computerPlayer.setPotionCount(3);
		humanPlayer.setPotionCount(3);
		
		//Battle starts here!
		while (true) {
			//1.)
			int computerChoice = computerPlayer.computerChoice(computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon));
			
			//2.)
			int humanChoice = humanPlayer.humanChoice(humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon));
			
			//3.)
			if (humanChoice == 2) {
				humanPlayer.humanAction(2, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
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
					}
					
					else {
						computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
					}
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getSpeedStat() < computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
					
					//Checks if opposing Pokemon is still alive before readying their attack
					if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(humanTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					}
					
					else {
						humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
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
						}
						
						else {
							computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
						}
					}
					
					else if (int_random == 1) {
						computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
						
						//Checks if opposing Pokemon is still alive before readying their attack
						if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(computerCurrentPokemon).getName() + " has fainted!");
						}
						
						else {
							humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
						}
					}
				}
			}
			//Only human attacks
			else if (humanChoice >= 3 && computerChoice == 1) {
				humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
				
				if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
				}
			}
			
			else if (humanChoice < 3 && computerChoice >= 2) {
				computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions);
				
				if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(computerCurrentPokemon).getName() + " has fainted!");
				}
			}
			
			else if (humanChoice < 3 && computerChoice == 1) {
				System.out.println("Neither Pokemon attacked this turn!");
			}
			
			//CPU switches to next pokemon if current Pokemon has fainted
			if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0 && computerCurrentPokemon != 5) {
				computerCurrentPokemon++;
				computerPlayer.setMyPokemon(computerTeam.get(computerCurrentPokemon));
				System.out.println("Blue has switched to " + computerPlayer.getMyPokemon().getName() + "!");
			}
			
			
			//Implement team health checker with a break here.
			break;
			
			/*if (humanTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
				humanPlayer.humanAction(2, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
			}
			*/
			
			
			
			
		}
		initialChoice.close();
	}
}
