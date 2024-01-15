import java.util.ArrayList;
import java.util.List;

public class Jolteon extends Pokemon{
	//Extra variable.
	private String info;
	
	public Jolteon() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Jolteon
	public Jolteon(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry2, PokemonInfo2;
		List<String> moves2 = new ArrayList<>();
		List<String> attackTypes2 = new ArrayList<>();
		List<Integer> basePowers2 = new ArrayList<>();
		List<String> moveDescriptions2 = new ArrayList<>();
		
		//Creates attacks for this Pokemon to use.
		moves2.add("Thunderbolt");
		attackTypes2.add("Electric");
		basePowers2.add(90);
		moveDescriptions2.add("Electric Type, Special: Jolteon unleahes a strong electric blast to crash down on the opposing Pokemon!");
		Attack Thunderbolt = new Attack(moveDescriptions2.get(0), 1, 15, attackTypes2.get(0), basePowers2.get(0), "Special");
		
		moves2.add("Hyper Voice");
		attackTypes2.add("Normal");
		basePowers2.add(90);
		moveDescriptions2.add("Normal Type, Special: Jolteon lets loose a horribly echoing shout!");
		Attack HyperVoice = new Attack(moveDescriptions2.get(1), 1, 10, attackTypes2.get(1), basePowers2.get(1), "Special");
		
		moves2.add("Shadow Ball");
		attackTypes2.add("Ghost");
		basePowers2.add(80);
		moveDescriptions2.add("Ghost Type, Special: Jolteon hurls a shadowy blob at the opposing Pokemon!");
		Attack ShadowBall = new Attack(moveDescriptions2.get(2), 1, 15, attackTypes2.get(2), basePowers2.get(2), "Special");
		
		moves2.add("Double Kick");
		attackTypes2.add("Fighting");
		basePowers2.add(60);
		moveDescriptions2.add("Fighting Type, Physical: The opposing Pokemon is quickly kicked twice in succession by Jolteon!");
		Attack DoubleKick = new Attack(moveDescriptions2.get(3), 1, 30, attackTypes2.get(3), basePowers2.get(3), "Physical");
		
		PokemonInfo2 = "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.";
		battleCry2 = "Jolteeee!";
		
		//Creates a seperate jolteon object that really is only needed for the attack stat and type of Jolteon.
		//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, Info
		Jolteon J1 = new Jolteon(172, 172, "Healthy", "Jolteon", "Electric", "Null", moves2, battleCry2, 128, 152, 178, 161, 200, PokemonInfo2);
		
		int damageDealt;
		int remainingHP;
		
		if (attackIndex == 1) {
			System.out.println(moveDescriptions2.get(0));
			damageDealt = Thunderbolt.getDamage(Thunderbolt, J1, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (Thunderbolt.getDamageMultiplier(attackTypes2.get(0), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (Thunderbolt.getDamageMultiplier(attackTypes2.get(0), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (Thunderbolt.getDamageMultiplier(attackTypes2.get(0), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 2) {
			System.out.println(moveDescriptions2.get(1));
			damageDealt = HyperVoice.getDamage(HyperVoice, J1, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (HyperVoice.getDamageMultiplier(attackTypes2.get(1), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (HyperVoice.getDamageMultiplier(attackTypes2.get(1), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (HyperVoice.getDamageMultiplier(attackTypes2.get(1), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 3) {
			System.out.println(moveDescriptions2.get(2));
			damageDealt = ShadowBall.getDamage(ShadowBall, J1, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (ShadowBall.getDamageMultiplier(attackTypes2.get(2), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (ShadowBall.getDamageMultiplier(attackTypes2.get(2), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (ShadowBall.getDamageMultiplier(attackTypes2.get(2), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 4) {
			System.out.println(moveDescriptions2.get(3));
			damageDealt = DoubleKick.getDamage(DoubleKick, J1, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (DoubleKick.getDamageMultiplier(attackTypes2.get(3), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (DoubleKick.getDamageMultiplier(attackTypes2.get(3), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (DoubleKick.getDamageMultiplier(attackTypes2.get(3), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
	}
	
	//Creates the speak function from the abstract class.
	@Override
	public void speak() {
		System.out.println(getBattleCry());
	}

	//Mutators.
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public int compareTo(Pokemon o) {
		return 0;
	}
	
	//Prints Jolteon's info.
	@Override
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
