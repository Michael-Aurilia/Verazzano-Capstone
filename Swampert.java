import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Swampert extends Pokemon{
	//Extra variable.
	private String info;
	
	public Swampert() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Swampert
	public Swampert(int hp, int mhp, String status, String name, String type1, String type2, List<Attack> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		int damageDealt;
		int remainingHP;
		
		if (attackIndex == 1) {
			System.out.println("Swampert Used Liquidation!");
			damageDealt = myPokemon.getAttacks().get(0).getDamage(myPokemon.getAttacks().get(0), myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (myPokemon.getAttacks().get(0).getDamageMultiplier(myPokemon.getAttacks().get(0).getAttackType(), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (myPokemon.getAttacks().get(0).getDamageMultiplier(myPokemon.getAttacks().get(0).getAttackType(), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (myPokemon.getAttacks().get(0).getDamageMultiplier(myPokemon.getAttacks().get(0).getAttackType(), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
			if (damageDealt > 0 && other.getHitPoints() > 0) {
				Random random = new Random();
			    int DEFDropChance = random.nextInt(5) + 1;
			    if (DEFDropChance == 1) {
			        other.setSpecialDefenseStat(other.getDefenseStat() * 0.75);
			        System.out.println(other.getName() + "'s Defense was droppeed by one stage!");
			    }
			}
		}
		else if (attackIndex == 2) {
			System.out.println("Swampert Used Ice Punch!");
			damageDealt = myPokemon.getAttacks().get(1).getDamage(myPokemon.getAttacks().get(1), myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (myPokemon.getAttacks().get(1).getDamageMultiplier(myPokemon.getAttacks().get(1).getAttackType(), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (myPokemon.getAttacks().get(1).getDamageMultiplier(myPokemon.getAttacks().get(1).getAttackType(), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (myPokemon.getAttacks().get(1).getDamageMultiplier(myPokemon.getAttacks().get(1).getAttackType(), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 3) {
			System.out.println("Swampert Used Earthquake!");
			damageDealt = myPokemon.getAttacks().get(2).getDamage(myPokemon.getAttacks().get(2), myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (myPokemon.getAttacks().get(2).getDamageMultiplier(myPokemon.getAttacks().get(2).getAttackType(), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (myPokemon.getAttacks().get(2).getDamageMultiplier(myPokemon.getAttacks().get(2).getAttackType(), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (myPokemon.getAttacks().get(2).getDamageMultiplier(myPokemon.getAttacks().get(2).getAttackType(), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
		else if (attackIndex == 4) {
			System.out.println("Swampert Used Rock Slide!");
			damageDealt = myPokemon.getAttacks().get(3).getDamage(myPokemon.getAttacks().get(3), myPokemon, other);
			remainingHP = other.getHitPoints() - damageDealt;
			other.setHitPoints(remainingHP);
			if (myPokemon.getAttacks().get(3).getDamageMultiplier(myPokemon.getAttacks().get(3).getAttackType(), other) >= 2) {
				System.out.println("It's super effective!");
			}
			else if (myPokemon.getAttacks().get(3).getDamageMultiplier(myPokemon.getAttacks().get(3).getAttackType(), other) == 0) {
				System.out.println("The move had no effect.");
			}
			else if (myPokemon.getAttacks().get(3).getDamageMultiplier(myPokemon.getAttacks().get(3).getAttackType(), other) <= 0.5) {
				System.out.println("It's not very effective...");
			}
			System.out.println(other.getName() + " takes " + damageDealt + " damage!");
		}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		int damageDealt1 = myPokemon.getAttacks().get(0).getDamage(myPokemon.getAttacks().get(0), myPokemon, other);
		int damageDealt2 = myPokemon.getAttacks().get(1).getDamage(myPokemon.getAttacks().get(1), myPokemon, other);
		int damageDealt3 = myPokemon.getAttacks().get(2).getDamage(myPokemon.getAttacks().get(2), myPokemon, other);
		int damageDealt4 = myPokemon.getAttacks().get(3).getDamage(myPokemon.getAttacks().get(3), myPokemon, other);
		
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
