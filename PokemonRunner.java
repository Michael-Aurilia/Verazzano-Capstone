//This file needs the most changes: Implement speed for turn order, JavaFX, Highest priority on switching Pokemon or using items, User and computer having six Pokemon,
//Battle only ends once a whole team has fainted, Only not fainted Pokemon can battle, Status moves?(Probably not), No running away
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PokemonRunner {
	public static void main(String args[]) throws InvalidInputException{
		//Variables to be passed in are manually defined in main
		String battleCry1, battleCry2, PokemonInfo1, PokemonInfo2;
		List<String> moves1 = new ArrayList<>();
		List<String> moves2 = new ArrayList<>();
		
		//Creating Blastoise object
		moves1.add("Liquidation");
		moves1.add("Ice Beam");
		moves1.add("Earthquake");
		moves1.add("Rock Slide");
		PokemonInfo1 = "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.";
		battleCry1 = "Blastoooise!";
		
		//Values are passed in the order of: HP, Name, Type, moves known, battle cry, Attack, Defense, special attack, special defense, speed, info.
		Swampert B = new Swampert(207, "Swampert", "Water", "Ground", moves1, battleCry1, 178, 156, 150, 172, 143, PokemonInfo1);
		//Placeholder
		
		//Creating Jolteon object
		moves2.add("Thunderbolt");
		moves2.add("Hyper Voice");
		moves2.add("Shadow Ball");
		moves2.add("Double Kick");
		PokemonInfo2 = "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.";
		battleCry2 = "Jolteeee!";
		
		Jolteon J = new Jolteon(172, "Jolteon", "Electric", "Null", moves2, battleCry2, 128, 152, 178, 161, 200, PokemonInfo2);
		
		//Start of program
		System.out.println("Welcome To The Pokemon battle simulator!");
		System.out.println("This simulator will pit you(Red) against a cpu controlled opponent(Blue).");
		System.out.println("You only have one potion which heals 50HP so use it wisely!");
		System.out.println("These are the availible Pokemon for this simulation:"   + "\n");
		
		System.out.println(B + "\n");
		System.out.println(J + "\n");

		//User chooses which Pokemon to use while the CPU picks the remaining Pokemon.
		Scanner pokemonChoice = new Scanner(System.in);
		System.out.print("Which Pokemon Would you like to battle with?(1 for Swampert, 2 for Jolteon): ");
		int choice = pokemonChoice.nextInt();
		System.out.println("-----------------------------------------");
		
		//Runner for if the player chooses Blastoise.
		if (choice == 1) {
			//Potions are created for the player and computer with only one use.
			Potion humanPotion = new Potion(B);
			Potion computerPotion = new Potion(J);
			//Human player and computer player are created here.
			HumanPlayer Red = new HumanPlayer(B, humanPotion);
			ComputerPlayer Blue = new ComputerPlayer(J, computerPotion);
			
			System.out.println("You sent out Swampert!");
			B.speak();
			
			System.out.println("Blue sent out Jolteon!");
			J.speak();
			
			System.out.println("Swampert: " + B.getHitPoints() + "/" + B.getHitPoints() + " HP");
			System.out.println("Jolteon: " + J.getHitPoints() + "/" + J.getHitPoints() + " HP");
			int BlastoiseFullHP = B.getHitPoints();
			int JolteonFullHP = J.getHitPoints();
			
			while(B.getHitPoints() > 0) {
				//After each turn the program checks if the attacked Pokemon's HP dropped below zero as if they faint they don't get a turn.
				System.out.println("Red's turn!");
				Red.playerTurn(B, J, humanPotion, BlastoiseFullHP);
				if (Red.isRun() == true) {
					break;
				}
				
				if (J.getHitPoints() > 0) {
					System.out.println("Blue's turn!");
					Blue.computerTurn(J, B, computerPotion, JolteonFullHP);
					if (Blue.isRun() == true) {
						break;
					}
				}
				else {
					if (J.getHitPoints() <= 0) {
						J.setHitPoints(J.getHitPoints() + -J.getHitPoints());
					}
					System.out.println("Jolteon: " + J.getHitPoints() + "/" + JolteonFullHP + " HP");
					System.out.println("Jolteon fainted!");
					System.out.println("The battle is over! Red is the winner!");
					System.out.println("Thanks for playing!");
					break;
				}
				
				if (B.getHitPoints() <= 0) {
					if (B.getHitPoints() < 0) {
						B.setHitPoints(B.getHitPoints() + -B.getHitPoints());
					}
					System.out.println("Swampert: " + B.getHitPoints() + "/" + BlastoiseFullHP + " HP");
					System.out.println("Swampert fainted!");
					System.out.println("The battle is over! Blue is the winner!");
					System.out.println("Thanks for playing!");
					break;
				}
				
				//To keep track of the health they are displayed to the screen if both players get a turn but the game doesn't end.
				System.out.println("Swampert: " + B.getHitPoints() + "/" + BlastoiseFullHP + " HP");
				System.out.println("Jolteon: " + J.getHitPoints() + "/" + JolteonFullHP + " HP");
				System.out.println("-----------------------------------------");
				System.out.println("Next turn!");
			}
		}
		
		//Runner for if the player chooses Jolteon.
		else if (choice == 2) {
			//Potions are created for the player and computer with only one use.
			Potion humanPotion = new Potion(J); 
			Potion computerPotion = new Potion(B);
			//Human player and computer player are created here.
			HumanPlayer Red = new HumanPlayer(J, humanPotion);
			ComputerPlayer Blue = new ComputerPlayer(B, computerPotion);
			
			System.out.println("You sent out Jolteon!");
			J.speak();
			
			System.out.println("Blue sent out Swampert!");
			B.speak();
			
			System.out.println("Jolteon: " + J.getHitPoints() + "/" + J.getHitPoints() + " HP");
			System.out.println("Swampert: " + B.getHitPoints() + "/" + B.getHitPoints() + " HP");
			int BlastoiseFullHP = B.getHitPoints();
			int JolteonFullHP = J.getHitPoints();
			
			while(J.getHitPoints() > 0) {
				//After each turn the program checks if the attacked Pokemon's HP dropped below zero as if they faint they don't get a turn.
				System.out.println("Red's turn!");
				Red.playerTurn(J, B, humanPotion, JolteonFullHP);
				if (Red.isRun() == true) {
					break;
				}
				
				if (B.getHitPoints() > 0) {
					System.out.println("Blue's turn!");
					Blue.computerTurn(B, J, computerPotion, BlastoiseFullHP);
					if (Blue.isRun() == true) {
						break;
					}
				}
				else {
					if (B.getHitPoints() <= 0) {
						B.setHitPoints(B.getHitPoints() + -B.getHitPoints());
					}
					System.out.println("Swampert: " + B.getHitPoints() + "/" + BlastoiseFullHP + " HP");
					System.out.println("Swampert fainted!");
					System.out.println("The battle is over! Red is the winner!");
					System.out.println("Thanks for playing!");
					break;
				}
				
				
				
				if (J.getHitPoints() <= 0) {
					if (J.getHitPoints() < 0) {
						J.setHitPoints(J.getHitPoints() + -J.getHitPoints());
					}
					System.out.println("Jolteon: " + J.getHitPoints() + "/" + JolteonFullHP + " HP");
					System.out.println("Jolteon fainted!");
					System.out.println("The battle is over! Blue is the winner!");
					System.out.println("Thanks for playing!");
					break;
				}
				
				//To keep track of the health they are displayed to the screen if both players get a turn but the game doesn't end.
				System.out.println("Jolteon: " + J.getHitPoints() + "/" + JolteonFullHP + " HP");
				System.out.println("Swampert: " + B.getHitPoints() + "/" + BlastoiseFullHP + " HP");
				System.out.println("-----------------------------------------");
				System.out.println("Next turn!");
			}
		}
		
		//Throws an error if an invalid input is given.
		else {
			pokemonChoice.close();
			throw new InvalidInputException("Invalid input given. Please type either 1 or 2.");
		}
		pokemonChoice.close();
		}
}
