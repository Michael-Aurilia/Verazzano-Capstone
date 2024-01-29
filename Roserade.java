import java.util.ArrayList;
import java.util.List;

public class Roserade extends Pokemon{
	//Extra variable.
	private String info;
	
	public Roserade() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Roserade
	public Roserade(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry4, PokemonInfo4;
		List<String> moves4 = new ArrayList<>();
		List<String> attackTypes4 = new ArrayList<>();
		List<Integer> basePowers4 = new ArrayList<>();
		List<String> moveDescriptions4 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves4.add("Energy Ball");
				attackTypes4.add("Grass");
				basePowers4.add(80);
				moveDescriptions4.add("Grass Type, Special: Roserade draws power from nature and fires it at the foe!");
				Attack EnergyBall = new Attack(moveDescriptions4.get(0), 1, 10, attackTypes4.get(0), basePowers4.get(0), "Special");
				
				moves4.add("Sludge Bomb");
				attackTypes4.add("Poison");
				basePowers4.add(90);
				moveDescriptions4.add("Poison Type, Special: Roserade attacks by hurling filthy sludge at the foe!");
				Attack SludgeBomb = new Attack(moveDescriptions4.get(1), 1, 10, attackTypes4.get(1), basePowers4.get(1), "Special");
				
				moves4.add("Dazzling Gleam");
				attackTypes4.add("Fairy");
				basePowers4.add(80);
				moveDescriptions4.add("Fairy Type, Special: Roserade damages opposing Pokémon by emitting a powerful flash!");
				Attack DazzlingGleam = new Attack(moveDescriptions4.get(2), 1, 10, attackTypes4.get(2), basePowers4.get(2), "Special");
				
				moves4.add("Extasensory");
				attackTypes4.add("Psychic");
				basePowers4.add(80);
				moveDescriptions4.add("Psychic type, Special: Roserade attacks with an odd, unseeable power!");
				Attack Extrasensory = new Attack(moveDescriptions4.get(3), 1, 20, attackTypes4.get(3), basePowers4.get(3), "Special");
				
				PokemonInfo4 = "With the movements of a dancer, Roserade strikes with whips that are densely lined with poison thorns.";
				battleCry4 = "Rose!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Roserade Rose = new Roserade(167, 167, "Healthy", "Roserade", "Grass", "Poison", moves4, battleCry4, 134, 128, 194, 172, 156, PokemonInfo4);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions4.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = EnergyBall.getDamage(EnergyBall, Rose, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (EnergyBall.getDamageMultiplier(attackTypes4.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (EnergyBall.getDamageMultiplier(attackTypes4.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (EnergyBall.getDamageMultiplier(attackTypes4.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions4.get(1));
					damageDealt = SludgeBomb.getDamage(SludgeBomb, Rose, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (SludgeBomb.getDamageMultiplier(attackTypes4.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (SludgeBomb.getDamageMultiplier(attackTypes4.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (SludgeBomb.getDamageMultiplier(attackTypes4.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions4.get(2));
					damageDealt = DazzlingGleam.getDamage(DazzlingGleam, Rose, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (DazzlingGleam.getDamageMultiplier(attackTypes4.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (DazzlingGleam.getDamageMultiplier(attackTypes4.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (DazzlingGleam.getDamageMultiplier(attackTypes4.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions4.get(3));
					damageDealt = Extrasensory.getDamage(Extrasensory, Rose, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Extrasensory.getDamageMultiplier(attackTypes4.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Extrasensory.getDamageMultiplier(attackTypes4.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Extrasensory.getDamageMultiplier(attackTypes4.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		String battleCry4, PokemonInfo4;
		List<String> moves4 = new ArrayList<>();
		List<String> attackTypes4 = new ArrayList<>();
		List<Integer> basePowers4 = new ArrayList<>();
		List<String> moveDescriptions4 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves4.add("Energy Ball");
				attackTypes4.add("Grass");
				basePowers4.add(80);
				moveDescriptions4.add("Grass Type, Special: Roserade draws power from nature and fires it at the foe!");
				Attack EnergyBall = new Attack(moveDescriptions4.get(0), 1, 10, attackTypes4.get(0), basePowers4.get(0), "Special");
				
				moves4.add("Sludge Bomb");
				attackTypes4.add("Poison");
				basePowers4.add(90);
				moveDescriptions4.add("Poison Type, Special: Roserade attacks by hurling filthy sludge at the foe!");
				Attack SludgeBomb = new Attack(moveDescriptions4.get(1), 1, 10, attackTypes4.get(1), basePowers4.get(1), "Special");
				
				moves4.add("Dazzling Gleam");
				attackTypes4.add("Fairy");
				basePowers4.add(80);
				moveDescriptions4.add("Fairy Type, Special: Roserade damages opposing Pokémon by emitting a powerful flash!");
				Attack DazzlingGleam = new Attack(moveDescriptions4.get(2), 1, 10, attackTypes4.get(2), basePowers4.get(2), "Special");
				
				moves4.add("Extasensory");
				attackTypes4.add("Psychic");
				basePowers4.add(80);
				moveDescriptions4.add("Psychic type, Special: Roserade attacks with an odd, unseeable power!");
				Attack Extrasensory = new Attack(moveDescriptions4.get(3), 1, 20, attackTypes4.get(3), basePowers4.get(3), "Special");
				
				PokemonInfo4 = "With the movements of a dancer, Roserade strikes with whips that are densely lined with poison thorns.";
				battleCry4 = "Rose!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Roserade Rose = new Roserade(167, 167, "Healthy", "Roserade", "Grass", "Poison", moves4, battleCry4, 134, 128, 194, 172, 156, PokemonInfo4);
				
				int damageDealt1 = EnergyBall.getDamage(EnergyBall, Rose, other);
				int damageDealt2 = SludgeBomb.getDamage(SludgeBomb, Rose, other);
				int damageDealt3 = DazzlingGleam.getDamage(DazzlingGleam, Rose, other);
				int damageDealt4 = Extrasensory.getDamage(Extrasensory, Rose, other);
				
				List<Integer> damageList = new ArrayList<>();
				damageList.add(damageDealt1);
				damageList.add(damageDealt2);
				damageList.add(damageDealt3);
				damageList.add(damageDealt4);
				
				return damageList;
	}

	@Override
	public int compareTo(Pokemon o) {
		return 0;
	}

	@Override
	public void speak() {
		System.out.println(getBattleCry());
	}
	
	public String getInfo() {
		return info;
	}
	
	private void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {
		String s = "";
		s+= "Name: " + getName() + "\n";
		s+= "First type: " + getType1() + "\n";
		s+= "Second type: " + getType2() + "\n";
		s+= "HP: " + getHitPoints() + "\n";
		s+= "Attack stat: " + getAttackStat() + "\n";
		s+= "Defense stat: " + getDefenseStat() + "\n";
		s+= "Special Attack stat: " + getSpecialAttackStat() + "\n";
		s+= "Special Defense stat: " + getSpecialDefenseStat() + "\n";
		s+= "Speed stat: " + getSpeedStat() + "\n";
		s+= "Known moves: " + getAttacks() + "\n";
		s+= "Info: " + info + "\n";
		return s;
	}
}
