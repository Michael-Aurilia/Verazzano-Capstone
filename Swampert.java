
//Make this a multitype besides Blastoise. Priority implementation? Held items?
import java.util.ArrayList;
import java.util.List;

public class Swampert extends Pokemon{
	//Extra variable.
	private String info;
	
	public Swampert() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Blastois;
	public Swampert(int hp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry1, PokemonInfo1;
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
		
		moves1.add("Ice Beam");
		attackTypes1.add("Ice");
		basePowers1.add(90);
		moveDescriptions1.add("Ice Type, Special: Swampert fires a freezing beam of ice at the opposing Pokemon!");
		Attack IceBeam = new Attack(moveDescriptions1.get(1), 1, 15, attackTypes1.get(1), basePowers1.get(1), "Special");
		
		moves1.add("Earthquake");
		attackTypes1.add("Ground");
		basePowers1.add(100);
		moveDescriptions1.add("Ground Type, Physical: Swampert causes a massive earthquake to damage the opposing Pokemon!");
		Attack Earthquake = new Attack(moveDescriptions1.get(2), 1, 10, attackTypes1.get(2), basePowers1.get(2), "Physical");
		
		moves1.add("Rock Slide");
		attackTypes1.add("Rock");
		basePowers1.add(75);
		moveDescriptions1.add("Swampert hurls Large boulders at the opposing Pokemon!");
		Attack RockSlide = new Attack(moveDescriptions1.get(3), 1, 15, attackTypes1.get(3), basePowers1.get(3), "Physical");
		
		PokemonInfo1 = "Swampert is very strong. It has enough power to easily drag a boulder weighing more than a ton. This Pokémon also has powerful vision that lets it see even in murky water.";
		battleCry1 = "Swaaamp!";
		
		//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
		Swampert SWPRT = new Swampert(207, "Swampert", "Water", "Ground", moves1, battleCry1, 178, 156, 150, 172, 143, PokemonInfo1);
		
		int damageDealt;
		int remainingHP;
		
		if (attackIndex == 1) {
			System.out.println(moveDescriptions1.get(0));
			//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
			damageDealt = Liquidation.getDamage(Liquidation, SWPRT, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			else if (Liquidation.getDamageMultiplier(attackTypes1.get(0), other) == 0) {
				System.out.println("The move had no effect.");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 2) {
			System.out.println(moveDescriptions1.get(1));
			damageDealt = IceBeam.getDamage(IceBeam, SWPRT, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (IceBeam.getDamageMultiplier(attackTypes1.get(1), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (IceBeam.getDamageMultiplier(attackTypes1.get(1), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			else if (IceBeam.getDamageMultiplier(attackTypes1.get(1), other) == 0) {
				System.out.println("The move had no effect.");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 3) {
			System.out.println(moveDescriptions1.get(2));
			damageDealt = Earthquake.getDamage(Earthquake, SWPRT, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			else if (Earthquake.getDamageMultiplier(attackTypes1.get(2), other) == 0) {
				System.out.println("The move had no effect.");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 4) {
			System.out.println(moveDescriptions1.get(3));
			damageDealt = RockSlide.getDamage(RockSlide, SWPRT, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			else if (RockSlide.getDamageMultiplier(attackTypes1.get(3), other) == 0) {
				System.out.println("The move had no effect.");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
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
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
		s+= "Known moves: " + getAttacks() + "\n";
		s+= "Info: " + info + "\n";
		return s;
	}

}