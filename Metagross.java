import java.util.ArrayList;
import java.util.List;

public class Metagross extends Pokemon{
	//Extra variable.
	private String info;
	
	public Metagross() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Lucario
	public Metagross(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry12, PokemonInfo12;
		List<String> moves12 = new ArrayList<>();
		List<String> attackTypes12 = new ArrayList<>();
		List<Integer> basePowers12 = new ArrayList<>();
		List<String> moveDescriptions12 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves12.add("Psychic");
				attackTypes12.add("Psychic");
				basePowers12.add(90);
				moveDescriptions12.add("Psychic Type, Special: Metagross' foe is hit by a strong telekinetic force!");
				Attack Psychic = new Attack(moveDescriptions12.get(2), 1, 10, attackTypes12.get(2), basePowers12.get(2), "Special");
				
				moves12.add("Flash Cannon");
				attackTypes12.add("Steel");
				basePowers12.add(80);
				moveDescriptions12.add("Steel Type, Special: Metagross gathers all its light energy and releases it at once!");
				Attack FlashCannon = new Attack(moveDescriptions12.get(1), 1, 10, attackTypes12.get(1), basePowers12.get(1), "Special");
				
				moves12.add("Zen Headbutt");
				attackTypes12.add("Psychic");
				basePowers12.add(80);
				moveDescriptions12.add("Psychic Type, Physical: Metagross focuses its willpower to its head and rams the foe!");
				Attack ZenHeadbutt = new Attack(moveDescriptions12.get(2), 1, 15, attackTypes12.get(2), basePowers12.get(2), "Physical");
				
				moves12.add("Meteor Mash");
				attackTypes12.add("Steel");
				basePowers12.add(90);
				moveDescriptions12.add("Steel Type, Physical: Metagross' foe is hit with a hard punch fired like a meteor!");
				Attack MeteorMash = new Attack(moveDescriptions12.get(3), 1, 10, attackTypes12.get(3), basePowers12.get(3), "Physical");
				
				PokemonInfo12 = "Metagross folds its four legs when flying. Its four brains are said to be superior to a supercomputer.";
				battleCry12 = "Roar!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Metagross Meta = new Metagross(187, 187, "Healthy", "Metagross", "Steel", "Psychic", moves12, battleCry12, 205, 200, 161, 156, 134, PokemonInfo12);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions12.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = Psychic.getDamage(Psychic, Meta, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Psychic.getDamageMultiplier(attackTypes12.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Psychic.getDamageMultiplier(attackTypes12.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Psychic.getDamageMultiplier(attackTypes12.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions12.get(1));
					damageDealt = FlashCannon.getDamage(FlashCannon, Meta, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (FlashCannon.getDamageMultiplier(attackTypes12.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes12.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes12.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions12.get(2));
					damageDealt = ZenHeadbutt.getDamage(ZenHeadbutt, Meta, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (ZenHeadbutt.getDamageMultiplier(attackTypes12.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (ZenHeadbutt.getDamageMultiplier(attackTypes12.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (ZenHeadbutt.getDamageMultiplier(attackTypes12.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions12.get(3));
					damageDealt = MeteorMash.getDamage(MeteorMash, Meta, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (MeteorMash.getDamageMultiplier(attackTypes12.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (MeteorMash.getDamageMultiplier(attackTypes12.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (MeteorMash.getDamageMultiplier(attackTypes12.get(3), other) <= 0.5) {
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
