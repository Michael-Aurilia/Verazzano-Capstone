import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokemonRunner {
	public static void main(String args[]){
		Scanner humanName = new Scanner(System.in);
		Scanner computerName = new Scanner(System.in);
		Scanner moreInfo = new Scanner(System.in);
		Scanner initialChoice = new Scanner(System.in);
		Scanner switchChoice = new Scanner(System.in);
		
		Swampert SW = PokemonFactory.createSwampert();
		double SWBaseATK = SW.getAttackStat();
		double SWBaseSPATK = SW.getSpecialAttackStat();
		double SWBaseDEF = SW.getDefenseStat();
		double SWBaseSPDEF = SW.getSpecialDefenseStat();
		double SWBaseSPE = SW.getSpeedStat();
		
		Jolteon J = PokemonFactory.createJolteon();
		double JBaseATK = J.getAttackStat();
		double JBaseSPATK = J.getSpecialAttackStat();
		double JBaseDEF = J.getDefenseStat();
		double JBaseSPDEF = J.getSpecialDefenseStat();
		double JBaseSPE = J.getSpeedStat();
		
		Garchomp G = PokemonFactory.createGarchomp();
		double GBaseATK = G.getAttackStat();
		double GBaseSPATK = G.getSpecialAttackStat();
		double GBaseDEF = G.getDefenseStat();
		double GBaseSPDEF = G.getSpecialDefenseStat();
		double GBaseSPE = G.getSpeedStat();
		
		Roserade R = PokemonFactory.createRoserade();
		double RBaseATK = R.getAttackStat();
		double RBaseSPATK = R.getSpecialAttackStat();
		double RBaseDEF = R.getDefenseStat();
		double RBaseSPDEF = R.getSpecialDefenseStat();
		double RBaseSPE = R.getSpeedStat();
		
		Milotic MI = PokemonFactory.createMilotic();
		double MIBaseATK = MI.getAttackStat();
		double MIBaseSPATK = MI.getSpecialAttackStat();
		double MIBaseDEF = MI.getDefenseStat();
		double MIBaseSPDEF = MI.getSpecialDefenseStat();
		double MIBaseSPE = MI.getSpeedStat();
		
		Lucario L = PokemonFactory.createLucario();
		double LBaseATK = L.getAttackStat();
		double LBaseSPATK = L.getSpecialAttackStat();
		double LBaseDEF = L.getDefenseStat();
		double LBaseSPDEF = L.getSpecialDefenseStat();
		double LBaseSPE = L.getSpeedStat();
		
		Togekiss T = PokemonFactory.createTogekiss();
		double TBaseATK = T.getAttackStat();
		double TBaseSPATK = T.getSpecialAttackStat();
		double TBaseDEF = T.getDefenseStat();
		double TBaseSPDEF = T.getSpecialDefenseStat();
		double TBaseSPE = T.getSpeedStat();
		
		Spiritomb SP = PokemonFactory.createSpiritomb();
		double SPBaseATK = SP.getAttackStat();
		double SPBaseSPATK = SP.getSpecialAttackStat();
		double SPBaseDEF = SP.getDefenseStat();
		double SPBaseSPDEF = SP.getSpecialDefenseStat();
		double SPBaseSPE = SP.getSpeedStat();
		
		Staraptor ST = PokemonFactory.createStaraptor();
		double STBaseATK = ST.getAttackStat();
		double STBaseSPATK = ST.getSpecialAttackStat();
		double STBaseDEF = ST.getDefenseStat();
		double STBaseSPDEF = ST.getSpecialDefenseStat();
		double STBaseSPE = ST.getSpeedStat();
		
		Abomasnow A = PokemonFactory.createAbomasnow();
		double ABaseATK = A.getAttackStat();
		double ABaseSPATK = A.getSpecialAttackStat();
		double ABaseDEF = A.getDefenseStat();
		double ABaseSPDEF = A.getSpecialDefenseStat();
		double ABaseSPE = A.getSpeedStat();
	
		Chandelure C = PokemonFactory.createChandelure();
		double CBaseATK = C.getAttackStat();
		double CBaseSPATK = C.getSpecialAttackStat();
		double CBaseDEF = C.getDefenseStat();
		double CBaseSPDEF = C.getSpecialDefenseStat();
		double CBaseSPE = C.getSpeedStat();
		
		Metagross ME = PokemonFactory.createMetagross();
		double MEBaseATK = ME.getAttackStat();
		double MEBaseSPATK = ME.getSpecialAttackStat();
		double MEBaseDEF = ME.getDefenseStat();
		double MEBaseSPDEF = ME.getSpecialDefenseStat();
		double MEBaseSPE = ME.getSpeedStat();
		
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
		
		System.out.println("1. " + SW.getName());
		System.out.println("2. " + J.getName());
		System.out.println("3. " + ST.getName());
		System.out.println("4. " + A.getName());
		System.out.println("5. " + C.getName());
		System.out.println("6. " + ME.getName());
		
		System.out.println("And this is the computers team that they will send out in this order:" + "\n");
		
		System.out.println("1. " + SP.getName());
		System.out.println("2. " + MI.getName());
		System.out.println("3. " + L.getName());
		System.out.println("4. " + T.getName());
		System.out.println("5. " + R.getName());
		System.out.println("6. " + G.getName());
		
		while(true) {
			System.out.println("Do you want more information on each of the Pokemon?(1 yes, 2 no)");
			int infoChoice = moreInfo.nextInt();
			if (infoChoice == 1) {
				System.out.println("This is your team:" + "\n");
				
				System.out.println("1. " + SW + "\n");
				System.out.println("2. " + J + "\n");
				System.out.println("3. " + ST + "\n");
				System.out.println("4. " + A + "\n");
				System.out.println("5. " + C + "\n");
				System.out.println("6. " + ME + "\n");
				
				System.out.println("And this is the computers team that they will send out in this order:" + "\n");
				
				System.out.println("1. " + SP + "\n");
				System.out.println("2. " + MI + "\n");
				System.out.println("3. " + L + "\n");
				System.out.println("4. " + T + "\n");
				System.out.println("5. " + R + "\n");
				System.out.println("6. " + G + "\n");
				
				break;
			}
			else if (infoChoice == 2) {
				break;
			}
			else {
				System.out.println("Invalid option");
			}
		}
		
		int firstChoice;
		while (true) {
			System.out.println("Which Pokemon would you like to send out first? (Enter a number 1-6 for your choice): ");
			int answerForInitialChoice = initialChoice.nextInt();
			
			if (answerForInitialChoice > 6 || answerForInitialChoice <= 0) {
				System.out.println("Invalid input.");
			}
			
			else {
				firstChoice = answerForInitialChoice;
				break;
			}
			
		}
		
		//List of priority in the battle function goes as follows:
		//1. Computers turn decision
		//2. Humans turn decision
		//3. If Human is switching Pokemon then proceed to do so and not give any other action for their turn
		//4. Computer item usage
		//5. Human item usage
		//6. If both Pokemon are set to attack, by comparing the speed stat for which is higher, determine whether the computer or human players Pokemon attacks first. However, a Pokemon can't attack if it has no HP left so check for that before each attack but especially the one who will attack second.
		
		
		
		//Initializing the start of the battle.
		//Setting up which Pokemon enters first
		HumanPlayer humanPlayer = new HumanPlayer(humanTeam.get(firstChoice - 1));
		humanPlayer.setMyPokemon(humanTeam.get(firstChoice - 1));
		
		ComputerPlayer computerPlayer = new ComputerPlayer(computerTeam.get(0));
		computerPlayer.setMyPokemon(computerTeam.get(0));
		
		int humanCurrentPokemon = firstChoice - 1;
		int computerCurrentPokemon = 0;
		int humanFaintedCounter = 0;
		int computerFaintedCounter = 0;
		
		//Setting up items
		Potion computerPotions = new Potion(computerTeam.get(0));
		Item humanPotions = new Potion(humanTeam.get(firstChoice - 1));
		computerPlayer.setPotionCount(3);
		humanPlayer.setPotionCount(3);
		
		System.out.println(CPUName + " has challenged you to a battle!");
		System.out.println(CPUName + " sends out " + computerTeam.get(computerCurrentPokemon).getName() + "!");
		System.out.println("You send out " + humanTeam.get(humanCurrentPokemon).getName() + "!");
		//Battle starts here!
		while (true) {
			int SOTHumanCurrentHP = humanTeam.get(humanCurrentPokemon).getHitPoints();
			int SOTComputerCurrentHP = computerTeam.get(computerCurrentPokemon).getHitPoints();
			int damageDealt = 0;
			int recoilDamage = 0;
			
			System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " " + humanTeam.get(humanCurrentPokemon).getHitPoints() + "/" + humanTeam.get(humanCurrentPokemon).getMaxHitPoints());
			System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " " + computerTeam.get(computerCurrentPokemon).getHitPoints() + "/" + computerTeam.get(computerCurrentPokemon).getMaxHitPoints());
			
			//1.)
			int computerChoice = computerPlayer.computerChoice(computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon));
			
			//2.)
			
			int humanChoice = humanPlayer.humanChoice(humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam);
			
			//3.)
			if (humanChoice == 0) {
				while (true) {
					System.out.println("Choose a Pokemon to switch to:");
				    for (int i = 0; i < humanTeam.size(); i++) {
				        Pokemon pokemon = humanTeam.get(i);
				        System.out.println((i + 1) + ". " + pokemon.getName() + " (HP: " + pokemon.getHitPoints() + "/" + pokemon.getMaxHitPoints() + ")");
				    }

				    int ansSwitchChoice = switchChoice.nextInt();
				    if (ansSwitchChoice >= 1 && ansSwitchChoice <= humanTeam.size()) {
				        Pokemon selectedPokemon = humanTeam.get(ansSwitchChoice - 1);
				        if (selectedPokemon.getHitPoints() > 0 && selectedPokemon != humanTeam.get(humanCurrentPokemon)) {
				        	if (humanCurrentPokemon == 0) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(SWBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(SWBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(SWBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(SWBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(SWBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 1) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(JBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(JBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(JBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(JBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(JBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 2) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(STBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(STBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(STBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(STBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(STBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 3) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(ABaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(ABaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(ABaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(ABaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(ABaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 4) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(CBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(CBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(CBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(CBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(CBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 5) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(MEBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(MEBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(MEBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(MEBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(MEBaseSPE);
				        	}
				        	
				        	System.out.println("Enough " + humanTeam.get(humanCurrentPokemon).getName() + " come back!");
				        	humanCurrentPokemon = ansSwitchChoice - 1;
				            System.out.println("Go " + humanTeam.get(ansSwitchChoice - 1).getName() + "!");
				            humanPlayer.setMyPokemon(humanTeam.get(humanCurrentPokemon));
				            break;
				        } 
				        
				        else if (selectedPokemon == humanTeam.get(humanCurrentPokemon)) {
				            System.out.println("You can't switch to the same Pokemon. Please choose a different one.");
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
				computerPlayer.computerAction(1, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions, computerTeam);
			}
			
			//5.)
			if (humanChoice == 1) {
				humanPlayer.humanAction(1, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
			}
			
			//6.)
			if (humanChoice >= 3 && computerChoice != 1) {
				
				//Compare speed for turn order
				if (humanTeam.get(humanCurrentPokemon).getSpeedStat() > computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					humanAttack(humanPlayer, humanChoice, humanTeam, computerTeam, humanCurrentPokemon, computerCurrentPokemon, 
							SOTComputerCurrentHP, humanPotions, damageDealt, recoilDamage);
					
					//Checks if opposing Pokemon is still alive before readying their attack
					if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
						computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
					}
					
					else if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
						humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
					}
					
					else {
						computerAttack(computerPlayer, computerChoice, humanTeam, computerTeam, humanCurrentPokemon, 
								computerCurrentPokemon, SOTHumanCurrentHP, computerPotions);
						
						
						if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
						
						else if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
					}
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getSpeedStat() < computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					computerAttack(computerPlayer, computerChoice, humanTeam, computerTeam, humanCurrentPokemon, 
							computerCurrentPokemon, SOTHumanCurrentHP, computerPotions);
					
					//Checks if opposing Pokemon is still alive before readying their attack
					if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
						humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
					}
					
					else if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
						System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
						computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
					}
					
					else {
						humanAttack(humanPlayer, humanChoice, humanTeam, computerTeam, humanCurrentPokemon, computerCurrentPokemon, 
								SOTComputerCurrentHP, humanPotions, damageDealt, recoilDamage);
						
						if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
						
						else if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
					}
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getSpeedStat() == computerTeam.get(computerCurrentPokemon).getSpeedStat()) {
					Random rand = new Random();
					int int_random = rand.nextInt(2);
					
					if (int_random == 0) {
						humanAttack(humanPlayer, humanChoice, humanTeam, computerTeam, humanCurrentPokemon, computerCurrentPokemon, 
								SOTComputerCurrentHP, humanPotions, damageDealt, recoilDamage);
						
						//Checks if opposing Pokemon is still alive before readying their attack
						if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
						
						else if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
						
						else {
							computerAttack(computerPlayer, computerChoice, humanTeam, computerTeam, humanCurrentPokemon, 
									computerCurrentPokemon, SOTHumanCurrentHP, computerPotions);
							
							if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
								humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
							}
							
							else if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
								computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
							}
						}
					}
					
					else if (int_random == 1) {
						computerAttack(computerPlayer, computerChoice, humanTeam, computerTeam, humanCurrentPokemon, 
								computerCurrentPokemon, SOTHumanCurrentHP, computerPotions);
						
						//Checks if opposing Pokemon is still alive before readying their attack
						if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
							humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
						}
						
						else if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
							System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
							computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
						}
						
						else {
							humanAttack(humanPlayer, humanChoice, humanTeam, computerTeam, humanCurrentPokemon, computerCurrentPokemon, 
									SOTComputerCurrentHP, humanPotions, damageDealt, recoilDamage);
							
							if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
								computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
							}
							
							else if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
								System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
								humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
							}
						}
					}
				}
			}
			//Only human attacks
			else if (humanChoice >= 3 && computerChoice == 1) {
				humanAttack(humanPlayer, humanChoice, humanTeam, computerTeam, humanCurrentPokemon, computerCurrentPokemon, 
						SOTComputerCurrentHP, humanPotions, damageDealt, recoilDamage);
				
				if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
				}
				
				else if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
					humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
				}
			}
			
			//Only Computer attacks
			else if (humanChoice < 3 && computerChoice >= 2) {
				computerAttack(computerPlayer, computerChoice, humanTeam, computerTeam, humanCurrentPokemon, 
						computerCurrentPokemon, SOTHumanCurrentHP, computerPotions);
				
				//Checks if opposing Pokemon is still alive before readying their attack
				if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
					humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
				}
				
				else if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
				}
			}
			
			else if (humanChoice < 3 && computerChoice == 1) {
				System.out.println("Neither Pokemon attacked this turn!");
			}
			
			//Status effects go here
			if (humanTeam.get(humanCurrentPokemon).getStatus() == "Burned") {
				double tempMaxHP = humanTeam.get(humanCurrentPokemon).getMaxHitPoints();
				double burnDamage = tempMaxHP * (1.0/16.0);
				int burn = (int)(burnDamage + .5);
				humanTeam.get(humanCurrentPokemon).setHitPoints(humanTeam.get(humanCurrentPokemon).getHitPoints() - burn);
				System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " was hurt by its burn!");
				
				if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
					humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
				}
			}
			if (computerTeam.get(computerCurrentPokemon).getStatus() == "Burned") {
				double tempMaxHP = computerTeam.get(computerCurrentPokemon).getMaxHitPoints();
				double burnDamage = tempMaxHP * (1.0/16.0);
				int burn = (int)(burnDamage + .5);
				computerTeam.get(computerCurrentPokemon).setHitPoints(computerTeam.get(computerCurrentPokemon).getHitPoints() - burn);
				System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " was hurt by its burn!");
				
				if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
				}
			}
			
			if (humanTeam.get(humanCurrentPokemon).getStatus() == "Poisoned") {
				double tempMaxHP = humanTeam.get(humanCurrentPokemon).getMaxHitPoints();
				double poisonDamage = tempMaxHP * (1.0/8.0);
				int poison = (int)(poisonDamage + .5);
				humanTeam.get(humanCurrentPokemon).setHitPoints(humanTeam.get(humanCurrentPokemon).getHitPoints() - poison);
				System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " was hurt by the poison!");
				
				if (humanTeam.get(humanCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(humanTeam.get(humanCurrentPokemon).getName() + " has fainted!");
					humanTeam.get(humanCurrentPokemon).setStatus("Fainted");
				}
			}
			if (computerTeam.get(computerCurrentPokemon).getStatus() == "Poisoned") {
				double tempMaxHP = computerTeam.get(computerCurrentPokemon).getMaxHitPoints();
				double poisonDamage = tempMaxHP * (1.0/8.0);
				int poison = (int)(poisonDamage + .5);
				computerTeam.get(computerCurrentPokemon).setHitPoints(computerTeam.get(computerCurrentPokemon).getHitPoints() - poison);
				System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " was hurt by the poison!");
				
				if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0) {
					System.out.println(computerTeam.get(computerCurrentPokemon).getName() + " has fainted!");
					computerTeam.get(computerCurrentPokemon).setStatus("Fainted");
				}
			}
			
			//CPU switches to next Pokemon if current Pokemon has fainted
			if (computerTeam.get(computerCurrentPokemon).getHitPoints() <= 0 && computerCurrentPokemon != 5) {
				if (computerCurrentPokemon == 0) {
					computerTeam.get(computerCurrentPokemon).setAttackStat(SPBaseATK);
	        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(SPBaseSPATK);
	        		computerTeam.get(computerCurrentPokemon).setDefenseStat(SPBaseDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(SPBaseSPDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpeedStat(SPBaseSPE);
				}
				else if (computerCurrentPokemon == 1) {
					computerTeam.get(computerCurrentPokemon).setAttackStat(MIBaseATK);
	        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(MIBaseSPATK);
	        		computerTeam.get(computerCurrentPokemon).setDefenseStat(MIBaseDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(MIBaseSPDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpeedStat(MIBaseSPE);
				}
				else if (computerCurrentPokemon == 2) {
					computerTeam.get(computerCurrentPokemon).setAttackStat(LBaseATK);
	        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(LBaseSPATK);
	        		computerTeam.get(computerCurrentPokemon).setDefenseStat(LBaseDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(LBaseSPDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpeedStat(LBaseSPE);
				}
				else if (computerCurrentPokemon == 3) {
					computerTeam.get(computerCurrentPokemon).setAttackStat(TBaseATK);
	        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(TBaseSPATK);
	        		computerTeam.get(computerCurrentPokemon).setDefenseStat(TBaseDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(TBaseSPDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpeedStat(TBaseSPE);
				}
				else if (computerCurrentPokemon == 4) {
					computerTeam.get(computerCurrentPokemon).setAttackStat(RBaseATK);
	        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(RBaseSPATK);
	        		computerTeam.get(computerCurrentPokemon).setDefenseStat(RBaseDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(RBaseSPDEF);
	        		computerTeam.get(computerCurrentPokemon).setSpeedStat(RBaseSPE);
				}
				
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
				computerTeam.get(computerCurrentPokemon).setAttackStat(GBaseATK);
        		computerTeam.get(computerCurrentPokemon).setSpecialAttackStat(GBaseSPATK);
        		computerTeam.get(computerCurrentPokemon).setDefenseStat(GBaseDEF);
        		computerTeam.get(computerCurrentPokemon).setSpecialDefenseStat(GBaseSPDEF);
        		computerTeam.get(computerCurrentPokemon).setSpeedStat(GBaseSPE);
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
				        System.out.println((i + 1) + ". " + pokemon.getName() + " (HP: " + pokemon.getHitPoints() + "/" + pokemon.getMaxHitPoints() + ")");
				    }

				    int ansSwitchChoice = switchChoice.nextInt();
				    if (ansSwitchChoice >= 1 && ansSwitchChoice <= humanTeam.size()) {
				        Pokemon selectedPokemon = humanTeam.get(ansSwitchChoice - 1);
				        if (selectedPokemon.getHitPoints() > 0 && selectedPokemon != humanTeam.get(humanCurrentPokemon)) {
				        	if (humanCurrentPokemon == 0) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(SWBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(SWBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(SWBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(SWBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(SWBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 1) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(JBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(JBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(JBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(JBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(JBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 2) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(STBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(STBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(STBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(STBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(STBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 3) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(ABaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(ABaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(ABaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(ABaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(ABaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 4) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(CBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(CBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(CBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(CBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(CBaseSPE);
				        	}
				        	else if (humanCurrentPokemon == 5) {
				        		humanTeam.get(humanCurrentPokemon).setAttackStat(MEBaseATK);
				        		humanTeam.get(humanCurrentPokemon).setSpecialAttackStat(MEBaseSPATK);
				        		humanTeam.get(humanCurrentPokemon).setDefenseStat(MEBaseDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpecialDefenseStat(MEBaseSPDEF);
				        		humanTeam.get(humanCurrentPokemon).setSpeedStat(MEBaseSPE);
				        	}
				        	
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
		moreInfo.close();
	}

public static void humanAttack(HumanPlayer humanPlayer, int humanChoice, List<Pokemon> humanTeam, List<Pokemon> computerTeam, int humanCurrentPokemon, int computerCurrentPokemon, 
	int SOTComputerCurrentHP, Item humanPotions, int damageDealt, int recoilDamage) {
	humanPlayer.humanAction(humanChoice, humanTeam.get(humanCurrentPokemon), computerTeam.get(computerCurrentPokemon), humanTeam, humanPotions);
}

public static void computerAttack(ComputerPlayer computerPlayer, int computerChoice, List<Pokemon> humanTeam, List<Pokemon> computerTeam, int humanCurrentPokemon, 
		int computerCurrentPokemon, int SOTHumanCurrentHP, Item computerPotions) {
	
	computerPlayer.computerAction(computerChoice, computerTeam.get(computerCurrentPokemon), humanTeam.get(humanCurrentPokemon), computerPotions, computerTeam);
}
}
