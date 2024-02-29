import java.util.ArrayList;
import java.util.List;

public class Swampert extends Pokemon{
	//Extra variable.
	private String info;
	
	public Swampert() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Swampert
	public Swampert(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		List<String> moves1 = new ArrayList<>();
		List<String> attackTypes1 = new ArrayList<>();
		List<Integer> basePowers1 = new ArrayList<>();
		List<String> moveDescriptions1 = new ArrayList<>();
		
		//Creates attacks for this Pokemon to use.
		moves1.add("Liquidation");
		attackTypes1.add("Water");
		basePowers1.add(85);
		moveDescriptions1.add("Water Type, Physical: Swampert used Liquidation!");
		Attack Liquidation = new Attack(moveDescriptions1.get(0), 1, 15, attackTypes1.get(0), basePowers1.get(0), "Physical");
		
		moves1.add("Ice Punch");
		attackTypes1.add("Ice");
		basePowers1.add(75);
		moveDescriptions1.add("Ice Type, Physical: Swampert used Ice Punch!");
		Attack IcePunch = new Attack(moveDescriptions1.get(1), 1, 15, attackTypes1.get(1), basePowers1.get(1), "Physical");
		
		moves1.add("Earthquake");
		attackTypes1.add("Ground");
		basePowers1.add(100);
		moveDescriptions1.add("Ground Type, Physical: Swampert used Earthquake!");
		Attack Earthquake = new Attack(moveDescriptions1.get(2), 1, 10, attackTypes1.get(2), basePowers1.get(2), "Physical");
		
		moves1.add("Rock Slide");
		attackTypes1.add("Rock");
		basePowers1.add(75);
		moveDescriptions1.add("Rock Type, Physical: Swampert used Rock Slide!");
		Attack RockSlide = new Attack(moveDescriptions1.get(3), 1, 15, attackTypes1.get(3), basePowers1.get(3), "Physical");
		
		int damageDealt;
		int remainingHP;
		
		if (attackIndex == 1) {
			System.out.println(moveDescriptions1.get(0));
			//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
			damageDealt = Liquidation.getDamage(Liquidation, myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 2) {
			System.out.println(moveDescriptions1.get(1));
			damageDealt = IcePunch.getDamage(IcePunch, myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (IcePunch.getDamageMultiplier(attackTypes1.get(1), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (IcePunch.getDamageMultiplier(attackTypes1.get(1), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (IcePunch.getDamageMultiplier(attackTypes1.get(1), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 3) {
			System.out.println(moveDescriptions1.get(2));
			damageDealt = Earthquake.getDamage(Earthquake, myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 4) {
			System.out.println(moveDescriptions1.get(3));
			damageDealt = RockSlide.getDamage(RockSlide, myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		List<String> moves1 = new ArrayList<>();
		List<String> attackTypes1 = new ArrayList<>();
		List<Integer> basePowers1 = new ArrayList<>();
		List<String> moveDescriptions1 = new ArrayList<>();
		
		//Creates attacks for this Pokemon to use.
		moves1.add("Liquidation");
		attackTypes1.add("Water");
		basePowers1.add(85);
		moveDescriptions1.add("Water Type, Physical: Swampert slams into the target using a full-force blast of water!");
		Attack Liquidation = new Attack(moveDescriptions1.get(0), 1, 15, attackTypes1.get(0), basePowers1.get(0), "Physical");
		
		moves1.add("Ice Punch");
		attackTypes1.add("Ice");
		basePowers1.add(75);
		moveDescriptions1.add("Ice Type, Special: Swampert punches the opposing Pokemon with an ice covered fist!");
		Attack IcePunch = new Attack(moveDescriptions1.get(1), 1, 15, attackTypes1.get(1), basePowers1.get(1), "Physical");
		
		moves1.add("Earthquake");
		attackTypes1.add("Ground");
		basePowers1.add(100);
		moveDescriptions1.add("Ground Type, Physical: Swampert causes a massive earthquake to damage the opposing Pokemon!");
		Attack Earthquake = new Attack(moveDescriptions1.get(2), 1, 10, attackTypes1.get(2), basePowers1.get(2), "Physical");
		
		moves1.add("Rock Slide");
		attackTypes1.add("Rock");
		basePowers1.add(75);
		moveDescriptions1.add("Rock Type, Physical: Swampert hurls Large boulders at the opposing Pokemon!");
		Attack RockSlide = new Attack(moveDescriptions1.get(3), 1, 15, attackTypes1.get(3), basePowers1.get(3), "Physical");
		
		int damageDealt1 = Liquidation.getDamage(Liquidation, myPokemon, other);
		int damageDealt2 = IcePunch.getDamage(IcePunch, myPokemon, other);
		int damageDealt3 = Earthquake.getDamage(Earthquake, myPokemon, other);
		int damageDealt4 = RockSlide.getDamage(RockSlide, myPokemon, other);
		
		List<Integer> damageList = new ArrayList<>();
		damageList.add(damageDealt1);
		damageList.add(damageDealt2);
		damageList.add(damageDealt3);
		damageList.add(damageDealt4);
		
		return damageList;
	}

	//Creates the speak function from the abstract class.
	@Override
	public void speak() {
		System.out.println(getBattleCry());
	}
	
	@Override
	public int compareTo(Pokemon o) {
		return 0;
	}

	//Mutators.
	public String getInfo1() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
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
