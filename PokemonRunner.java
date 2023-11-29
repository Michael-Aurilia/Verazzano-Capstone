//This file needs the most changes: Implement speed for turn order, JavaFX, Highest priority on switching Pokemon or using items, User and computer having six Pokemon,
//Battle only ends once a whole team has fainted, Only not fainted Pokemon can battle, Status moves?(Probably not), No running away
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PokemonRunner {
	public static void main(String args[]) throws InvalidInputException{
		//Variables to be passed in are manually defined in main
		String battleCry1, battleCry2, PokemonInfo1, PokemonInfo2;
		String battleCry3, battleCry4, PokemonInfo3, PokemonInfo4;
		String battleCry5, battleCry6, PokemonInfo5, PokemonInfo6;
		String battleCry7, battleCry8, PokemonInfo7, PokemonInfo8;
		String battleCry9, battleCry10, PokemonInfo9, PokemonInfo10;
		String battleCry11, battleCry12, PokemonInfo11, PokemonInfo12;
		List<String> moves1 = new ArrayList<>();
		List<String> moves2 = new ArrayList<>();
		List<String> moves3 = new ArrayList<>();
		List<String> moves4 = new ArrayList<>();
		List<String> moves5 = new ArrayList<>();
		List<String> moves6 = new ArrayList<>();
		List<String> moves7 = new ArrayList<>();
		List<String> moves8 = new ArrayList<>();
		List<String> moves9 = new ArrayList<>();
		List<String> moves10 = new ArrayList<>();
		List<String> moves11 = new ArrayList<>();
		List<String> moves12 = new ArrayList<>();
		
		//Creating Swampert object
		moves1.add("Liquidation");
		moves1.add("Ice Beam");
		moves1.add("Earthquake");
		moves1.add("Rock Slide");
		PokemonInfo1 = "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.";
		battleCry1 = "Blastoooise!";
		
		//Values are passed in the order of: HP, Name, Type, moves known, battle cry, Attack, Defense, special attack, special defense, speed, info.
		Swampert SW = new Swampert(207, "Swampert", "Water", "Ground", moves1, battleCry1, 178, 156, 150, 172, 143, PokemonInfo1);
		
		//Creating Jolteon object
		moves2.add("Thunderbolt");
		moves2.add("Hyper Voice");
		moves2.add("Shadow Ball");
		moves2.add("Double Kick");
		PokemonInfo2 = "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.";
		battleCry2 = "Jolteeee!";
		
		Jolteon J = new Jolteon(172, "Jolteon", "Electric", "Null", moves2, battleCry2, 128, 152, 178, 161, 200, PokemonInfo2);
		
		//Creating Garchomp object
		moves3.add("Dragon Claw");
		moves3.add("Fire Fang");
		moves3.add("Earthquake");
		moves3.add("Rock Slide");
		PokemonInfo3 = "When Garchomp folds up its body and extends its wings, it looks like a jet plane. It flies at sonic speed.";
		battleCry3 = "Roar!";
		
		Garchomp G = new Garchomp(215, "Garchomp", "Dragon", "Ground", moves3, battleCry3, 200, 161, 145, 150, 169, PokemonInfo3);
		
		//Creating Roserade object
		moves4.add("Energy Ball");
		moves4.add("Sludge Bomb");
		moves4.add("Dazzling Gleam");
		moves4.add("Extasensory");
		PokemonInfo4 = "With the movements of a dancer, Roserade strikes with whips that are densely lined with poison thorns.";
		battleCry4 = "Rose!";
		
		Roserade R = new Roserade(167, "Roserade", "Grass", "Poison", moves4, battleCry4, 134, 128, 194, 172, 156, PokemonInfo4);
		
		//Creating Milotic object
		moves5.add("Surf");
		moves5.add("Ice Beam");
		moves5.add("Dragon Pulse");
		moves5.add("Water Pulse");
		PokemonInfo5 = "It is the world's most beautiful Pokémon. There are many works of art featuring Milotic.";
		battleCry5 = "Roar!";
		
		Milotic MI = new Milotic(202, "Milotic", "Water", "Null", moves5, battleCry5, 123, 144, 167, 194, 146, PokemonInfo5);
		
		//Creating Lucario object
		moves6.add("Aura Sphere");
		moves6.add("Flash Cannon");
		moves6.add("Close Combat");
		moves6.add("Crunch");
		PokemonInfo6 = "A well-trained Lucario can sense auras to identify and take in the feelings of creatures over half a mile away.";
		battleCry6 = "Roar!";
		
		Lucario L = new Lucario(177, "Lucario", "Fighting", "Steel", moves6, battleCry6, 178, 134, 183, 134, 156, PokemonInfo6);
		
		//Creating Togekiss object
		moves7.add("Air Slash");
		moves7.add("Tri Attack");
		moves7.add("Dazzling Gleam");
		moves7.add("Flamethrower");
		PokemonInfo7 = "Togekiss shares many blessings with people who respect one another's rights and avoid needless strife.";
		battleCry7 = "Kisss!";
		
		Togekiss T = new Togekiss(192, "Togekiss", "Fairy", "Flying", moves7, battleCry7, 112, 161, 189, 183, 145, PokemonInfo7);
		
		//Creating Spiritomb object
		moves8.add("Shadow Ball");
		moves8.add("Dark Pulse");
		//Will become Will-o-wisp
		moves8.add("Icy Wind");
		moves8.add("Hex");
		PokemonInfo8 = "Spiritomb was formed by 108 spirits. It is bound to a fissure in an Odd Keystone.";
		battleCry8 = "OOOOOO!";

		Spiritomb SP = new Spiritomb(157, "Spiritomb", "Ghost", "Dark", moves8, battleCry8, 158, 176, 158, 176, 95, PokemonInfo8);
		
		//Creating Staraptor object
		moves9.add("Brave Bird");
		moves9.add("Facade");
		moves9.add("Close Combat");
		//Code this attack specifically
		moves9.add("Endeavor");
		PokemonInfo9 = "Staraptor never stops attacking even if it is injured. It fusses over the shape of its comb.";
		battleCry9 = "Bird Up!";
		
		Staraptor ST = new Staraptor(192, "Staraptor", "Normal", "Flying", moves9, battleCry9, 189, 134, 112, 123, 167, PokemonInfo9);
		
		//Creating Abomasnow object
		moves10.add("Energy Ball");
		moves10.add("Blizzard");
		moves10.add("Wood Hammer");
		moves10.add("Ice Punch");
		PokemonInfo10 = "Abomasnow lives a quiet life on mountains that are perpetually covered in snow. It hides itself by whipping up blizzards.";
		battleCry10 = "Roar!";
		
		Abomasnow A = new Abomasnow(167, "Abomasnow", "Grass", "Ice", moves10, battleCry10, 117, 156, 216, 156, 145, PokemonInfo10);
		
		//Creating Chandelure object
		moves11.add("Shadow Ball");
		//Remember to implement stat changes
		moves11.add("Overheat");
		moves11.add("Psychic");
		moves11.add("Flamethrower");
		PokemonInfo11 = "Being consumed in Chandelure's flame burns up the spirit, leaving the body behind.";
		battleCry11 = "Ssss!";
		
		Chandelure C = new Chandelure(192, "Chandelure", "Ghost", "Fire", moves11, battleCry11, 112, 161, 189, 183, 145, PokemonInfo11);
		
		//Creating Metagross object
		moves12.add("Psychic");
		moves12.add("Flash Cannon");
		moves12.add("Zen Headbutt");
		moves12.add("Meteor Mash");
		PokemonInfo12 = "Metagross folds its four legs when flying. Its four brains are said to be superior to a supercomputer.";
		battleCry12 = "Roar!";
		
		Metagross ME = new Metagross(187, "Metagross", "Steel", "Psychic", moves12, battleCry12, 205, 200, 161, 156, 134, PokemonInfo12);
		
		
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
