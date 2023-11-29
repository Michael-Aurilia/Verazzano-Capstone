//This file needs the most changes: Implement speed for turn order, JavaFX, Highest priority on switching Pokemon or using items, User and computer having six Pokemon,
//Battle only ends once a whole team has fainted, Only not fainted Pokemon can battle, Status moves?(Probably not), No running away
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PokemonRunner {
	public static void main(String args[]) throws InvalidInputException{
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
		
		
		//Start of program
		System.out.println("Welcome To The Pokemon battle simulator!");
		System.out.println("This simulator will pit you(Red) against a cpu controlled opponent(Blue).");
		System.out.println("You only have one potion which heals 50HP so use it wisely!");
		System.out.println("These are the availible Pokemon for this simulation:"   + "\n");
		
		System.out.println(SW + "\n");
		System.out.println(J + "\n");

		//User chooses which Pokemon to use while the CPU picks the remaining Pokemon.
		Scanner pokemonChoice = new Scanner(System.in);
		System.out.print("Which Pokemon Would you like to battle with?(1 for Swampert, 2 for Jolteon): ");
		int choice = pokemonChoice.nextInt();
		System.out.println("-----------------------------------------");
		
		//Runner for if the player chooses Swampert.
		if (choice == 1) {
			//Potions are created for the player and computer with only one use.
			Potion humanPotion = new Potion(SW);
			Potion computerPotion = new Potion(J);
			//Human player and computer player are created here.
			HumanPlayer Red = new HumanPlayer(SW, humanPotion);
			ComputerPlayer Blue = new ComputerPlayer(J, computerPotion);
			
			System.out.println("You sent out Swampert!");
			SW.speak();
			
			System.out.println("Blue sent out Jolteon!");
			J.speak();
			
			System.out.println("Swampert: " + SW.getHitPoints() + "/" + SW.getHitPoints() + " HP");
			System.out.println("Jolteon: " + J.getHitPoints() + "/" + J.getHitPoints() + " HP");
			int SwampertFullHP = SW.getHitPoints();
			int JolteonFullHP = J.getHitPoints();
			
			while(SW.getHitPoints() > 0) {
				//After each turn the program checks if the attacked Pokemon's HP dropped below zero as if they faint they don't get a turn.
				System.out.println("Red's turn!");
				Red.playerTurn(SW, J, humanPotion, SwampertFullHP);
				if (Red.isRun() == true) {
					break;
				}
				
				if (J.getHitPoints() > 0) {
					System.out.println("Blue's turn!");
					Blue.computerTurn(J, SW, computerPotion, JolteonFullHP);
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
				
				if (SW.getHitPoints() <= 0) {
					if (SW.getHitPoints() < 0) {
						SW.setHitPoints(SW.getHitPoints() + -SW.getHitPoints());
					}
					System.out.println("Swampert: " + SW.getHitPoints() + "/" + SwampertFullHP + " HP");
					System.out.println("Swampert fainted!");
					System.out.println("The battle is over! Blue is the winner!");
					System.out.println("Thanks for playing!");
					break;
				}
				
				//To keep track of the health they are displayed to the screen if both players get a turn but the game doesn't end.
				System.out.println("Swampert: " + SW.getHitPoints() + "/" + SwampertFullHP + " HP");
				System.out.println("Jolteon: " + J.getHitPoints() + "/" + JolteonFullHP + " HP");
				System.out.println("-----------------------------------------");
				System.out.println("Next turn!");
			}
		}
		
		//Runner for if the player chooses Jolteon.
		else if (choice == 2) {
			//Potions are created for the player and computer with only one use.
			Potion humanPotion = new Potion(J); 
			Potion computerPotion = new Potion(SW);
			//Human player and computer player are created here.
			HumanPlayer Red = new HumanPlayer(J, humanPotion);
			ComputerPlayer Blue = new ComputerPlayer(SW, computerPotion);
			
			System.out.println("You sent out Jolteon!");
			J.speak();
			
			System.out.println("Blue sent out Swampert!");
			SW.speak();
			
			System.out.println("Jolteon: " + J.getHitPoints() + "/" + J.getHitPoints() + " HP");
			System.out.println("Swampert: " + SW.getHitPoints() + "/" + SW.getHitPoints() + " HP");
			int SwampertFullHP = SW.getHitPoints();
			int JolteonFullHP = J.getHitPoints();
			
			while(J.getHitPoints() > 0) {
				//After each turn the program checks if the attacked Pokemon's HP dropped below zero as if they faint they don't get a turn.
				System.out.println("Red's turn!");
				Red.playerTurn(J, SW, humanPotion, JolteonFullHP);
				if (Red.isRun() == true) {
					break;
				}
				
				if (SW.getHitPoints() > 0) {
					System.out.println("Blue's turn!");
					Blue.computerTurn(SW, J, computerPotion, SwampertFullHP);
					if (Blue.isRun() == true) {
						break;
					}
				}
				else {
					if (SW.getHitPoints() <= 0) {
						SW.setHitPoints(SW.getHitPoints() + -SW.getHitPoints());
					}
					System.out.println("Swampert: " + SW.getHitPoints() + "/" + SwampertFullHP + " HP");
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
				System.out.println("Swampert: " + SW.getHitPoints() + "/" + SwampertFullHP + " HP");
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
