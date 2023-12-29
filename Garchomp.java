import java.util.ArrayList;
import java.util.List;

public class Garchomp extends Pokemon{
	//Extra variable.
	private String info;
	
	public Garchomp() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Garchomp
	public Garchomp(int hp, int mhp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry3, PokemonInfo3;
		List<String> moves3 = new ArrayList<>();
		List<String> attackTypes3 = new ArrayList<>();
		List<Integer> basePowers3 = new ArrayList<>();
		List<String> moveDescriptions3 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves3.add("Dragon Claw");
				attackTypes3.add("Dragon");
				basePowers3.add(80);
				moveDescriptions3.add("Dragon Type, Physical: Garchomp slashes the foe with its huge sharp claws!");
				Attack DragonClaw = new Attack(moveDescriptions3.get(0), 1, 15, attackTypes3.get(0), basePowers3.get(0), "Physical");
				
				moves3.add("Fire Fang");
				attackTypes3.add("Fire");
				basePowers3.add(65);
				moveDescriptions3.add("Fire Type, Physical: Garchomp bites with flame-cloaked fangs!");
				Attack FireFang = new Attack(moveDescriptions3.get(1), 1, 15, attackTypes3.get(1), basePowers3.get(1), "Physical");
				
				moves3.add("Earthquake");
				attackTypes3.add("Ground");
				basePowers3.add(100);
				moveDescriptions3.add("Ground Type, Physical: Garchomp causes a massive earthquake to damage the opposing Pokemon!");
				Attack Earthquake = new Attack(moveDescriptions3.get(2), 1, 10, attackTypes3.get(2), basePowers3.get(2), "Physical");
				
				moves3.add("Rock Slide");
				attackTypes3.add("Rock");
				basePowers3.add(75);
				moveDescriptions3.add("Rock Type, Physical: Garchomp hurls Large boulders at the opposing Pokemon!");
				Attack RockSlide = new Attack(moveDescriptions3.get(3), 1, 15, attackTypes3.get(3), basePowers3.get(3), "Physical");
				
				PokemonInfo3 = "When Garchomp folds up its body and extends its wings, it looks like a jet plane. It flies at sonic speed.";
				battleCry3 = "Roar!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Garchomp GRCMP = new Garchomp(215, 215, "Garchomp", "Dragon", "Ground", moves3, battleCry3, 200, 161, 145, 150, 169, PokemonInfo3);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions3.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = DragonClaw.getDamage(DragonClaw, GRCMP, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (DragonClaw.getDamageMultiplier(attackTypes3.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (DragonClaw.getDamageMultiplier(attackTypes3.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (DragonClaw.getDamageMultiplier(attackTypes3.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions3.get(1));
					damageDealt = FireFang.getDamage(FireFang, GRCMP, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (FireFang.getDamageMultiplier(attackTypes3.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (FireFang.getDamageMultiplier(attackTypes3.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (FireFang.getDamageMultiplier(attackTypes3.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions3.get(2));
					damageDealt = Earthquake.getDamage(Earthquake, GRCMP, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Earthquake.getDamageMultiplier(attackTypes3.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Earthquake.getDamageMultiplier(attackTypes3.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Earthquake.getDamageMultiplier(attackTypes3.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions3.get(3));
					damageDealt = RockSlide.getDamage(RockSlide, GRCMP, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (RockSlide.getDamageMultiplier(attackTypes3.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (RockSlide.getDamageMultiplier(attackTypes3.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (RockSlide.getDamageMultiplier(attackTypes3.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
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
