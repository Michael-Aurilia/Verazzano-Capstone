import java.util.ArrayList;
import java.util.List;

public class Chandelure extends Pokemon{
	//Extra variable.
	private String info;
	
	public Chandelure() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Togekiss
	public Chandelure(int hp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry11, PokemonInfo11;
		List<String> moves11 = new ArrayList<>();
		List<String> attackTypes11 = new ArrayList<>();
		List<Integer> basePowers11 = new ArrayList<>();
		List<String> moveDescriptions11 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves11.add("Shadow Ball");
				attackTypes11.add("Ghost");
				basePowers11.add(80);
				moveDescriptions11.add("Ghost Type, Special: Chandelure hurls a shadowy blob at the opposing Pokemon!");
				Attack ShadowBall = new Attack(moveDescriptions11.get(0), 1, 15, attackTypes11.get(0), basePowers11.get(0), "Special");
				
				//Remember to implement stat changes
				moves11.add("Overheat");
				attackTypes11.add("Fire");
				basePowers11.add(130);
				moveDescriptions11.add("Fire Type, Special: Chandelure attacks the foe at full power! The attack's recoil sharply reduces the user's Sp. Atk stat.");
				Attack Overheat = new Attack(moveDescriptions11.get(1), 1, 5, attackTypes11.get(1), basePowers11.get(1), "Special");
				
				moves11.add("Psychic");
				attackTypes11.add("Psychic");
				basePowers11.add(90);
				moveDescriptions11.add("Psychic Type, Special: Chandelure's foe is hit by a strong telekinetic force!");
				Attack Psychic = new Attack(moveDescriptions11.get(2), 1, 10, attackTypes11.get(2), basePowers11.get(2), "Special");
				
				moves11.add("Flamethrower");
				attackTypes11.add("Fire");
				basePowers11.add(90);
				moveDescriptions11.add("Fire type, Special: Chandelure foe is scorched with an intense blast of fire!");
				Attack Flamethrower = new Attack(moveDescriptions11.get(3), 1, 15, attackTypes11.get(3), basePowers11.get(3), "Special");
				
				PokemonInfo11 = "Being consumed in Chandelure's flame burns up the spirit, leaving the body behind.";
				battleCry11 = "Ssss!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Chandelure Candle = new Chandelure(192, "Chandelure", "Ghost", "Fire", moves11, battleCry11, 112, 161, 189, 183, 145, PokemonInfo11);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions11.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = ShadowBall.getDamage(ShadowBall, Candle, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (ShadowBall.getDamageMultiplier(attackTypes11.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (ShadowBall.getDamageMultiplier(attackTypes11.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (ShadowBall.getDamageMultiplier(attackTypes11.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions11.get(1));
					damageDealt = Overheat.getDamage(Overheat, Candle, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Overheat.getDamageMultiplier(attackTypes11.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Overheat.getDamageMultiplier(attackTypes11.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Overheat.getDamageMultiplier(attackTypes11.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions11.get(2));
					damageDealt = Psychic.getDamage(Psychic, Candle, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Psychic.getDamageMultiplier(attackTypes11.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Psychic.getDamageMultiplier(attackTypes11.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Psychic.getDamageMultiplier(attackTypes11.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions11.get(3));
					damageDealt = Flamethrower.getDamage(Flamethrower, Candle, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Flamethrower.getDamageMultiplier(attackTypes11.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Flamethrower.getDamageMultiplier(attackTypes11.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Flamethrower.getDamageMultiplier(attackTypes11.get(3), other) <= 0.5) {
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
	
	private void setInfo(String string) {
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
