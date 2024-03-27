import java.util.ArrayList;
import java.util.List;

public class Milotic extends Pokemon{
	//Extra variable.
	private String info;
	
	public Milotic() {
		setInfo("How did you find this?");
	}
	
	public Milotic(int hp, int mhp, String status, String name, String type1, String type2, List<Attack> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		int damageDealt;
		int remainingHP;
				
		if (attackIndex == 1) {
			System.out.println("Milotic used Surf!");
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
		}
		else if (attackIndex == 2) {
			System.out.println("Milotic used Ice Beam!");
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
			System.out.println("Milotic used Dragon Pulse!");
			System.out.println("Abomasnow used Wood Hammer!");
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
			System.out.println("Milotic Used Recover!");
			myPokemon.setHitPoints(myPokemon.getHitPoints() + (myPokemon.getMaxHitPoints() / 2));
			System.out.println(myPokemon.getName() + " recovers " + (myPokemon.getMaxHitPoints() / 2) + " health!");
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
