import java.util.ArrayList;
import java.util.List;

public class Milotic extends Pokemon{
	//Extra variable.
	private String info;
	
	public Milotic() {
		setInfo("How did you find this?");
	}
	
	public Milotic(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		List<String> moves5 = new ArrayList<>();
		List<String> attackTypes5 = new ArrayList<>();
		List<Integer> basePowers5 = new ArrayList<>();
		List<String> moveDescriptions5 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves5.add("Surf");
				attackTypes5.add("Water");
				basePowers5.add(90);
				moveDescriptions5.add("Water Type, Special: Milotic used Surf!");
				Attack Surf = new Attack(moveDescriptions5.get(0), 1, 15, attackTypes5.get(0), basePowers5.get(0), "Special");
				
				moves5.add("Ice Beam");
				attackTypes5.add("Ice");
				basePowers5.add(90);
				moveDescriptions5.add("Ice Type, Special: Milotic used Ice Beam!");
				Attack IceBeam = new Attack(moveDescriptions5.get(1), 1, 15, attackTypes5.get(1), basePowers5.get(1), "Special");
				
				moves5.add("Dragon Pulse");
				attackTypes5.add("Dragon");
				basePowers5.add(85);
				moveDescriptions5.add("Dragon Type, Special: Milotic used Dragon Pulse!");
				Attack DragonPulse = new Attack(moveDescriptions5.get(2), 1, 10, attackTypes5.get(2), basePowers5.get(2), "Special");
				
				moves5.add("Water Pulse");
				attackTypes5.add("Water");
				basePowers5.add(60);
				moveDescriptions5.add("Water Type, Special: Milotic used Water Pulse!");
				Attack WaterPulse = new Attack(moveDescriptions5.get(3), 1, 20, attackTypes5.get(3), basePowers5.get(3), "Special");
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions5.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = Surf.getDamage(Surf, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Surf.getDamageMultiplier(attackTypes5.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Surf.getDamageMultiplier(attackTypes5.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Surf.getDamageMultiplier(attackTypes5.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions5.get(1));
					damageDealt = IceBeam.getDamage(IceBeam, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (IceBeam.getDamageMultiplier(attackTypes5.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (IceBeam.getDamageMultiplier(attackTypes5.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (IceBeam.getDamageMultiplier(attackTypes5.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions5.get(2));
					damageDealt = DragonPulse.getDamage(DragonPulse, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (DragonPulse.getDamageMultiplier(attackTypes5.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (DragonPulse.getDamageMultiplier(attackTypes5.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (DragonPulse.getDamageMultiplier(attackTypes5.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions5.get(3));
					damageDealt = WaterPulse.getDamage(WaterPulse, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (WaterPulse.getDamageMultiplier(attackTypes5.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (WaterPulse.getDamageMultiplier(attackTypes5.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (WaterPulse.getDamageMultiplier(attackTypes5.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		List<String> moves5 = new ArrayList<>();
		List<String> attackTypes5 = new ArrayList<>();
		List<Integer> basePowers5 = new ArrayList<>();
		List<String> moveDescriptions5 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves5.add("Surf");
				attackTypes5.add("Water");
				basePowers5.add(90);
				moveDescriptions5.add("Water Type, Special: Milotic attacks by swamping its surroundings with a giant wave!");
				Attack Surf = new Attack(moveDescriptions5.get(0), 1, 15, attackTypes5.get(0), basePowers5.get(0), "Special");
				
				moves5.add("Ice Beam");
				attackTypes5.add("Ice");
				basePowers5.add(90);
				moveDescriptions5.add("Ice Type, Special: Milotic fires a freezing beam of ice at the opposing Pokemon!");
				Attack IceBeam = new Attack(moveDescriptions5.get(1), 1, 15, attackTypes5.get(1), basePowers5.get(1), "Special");
				
				moves5.add("Dragon Pulse");
				attackTypes5.add("Dragon");
				basePowers5.add(85);
				moveDescriptions5.add("Dragon Type, Special: Milotic attacks with a shock wave generated by the it's gaping mouth!");
				Attack DragonPulse = new Attack(moveDescriptions5.get(2), 1, 10, attackTypes5.get(2), basePowers5.get(2), "Special");
				
				moves5.add("Water Pulse");
				attackTypes5.add("Water");
				basePowers5.add(60);
				moveDescriptions5.add("Water Type, Special: Milotic attacks with an odd, unseeable power!");
				Attack WaterPulse = new Attack(moveDescriptions5.get(3), 1, 20, attackTypes5.get(3), basePowers5.get(3), "Special");
		
		int damageDealt1 = Surf.getDamage(Surf, myPokemon, other);
		int damageDealt2 = IceBeam.getDamage(IceBeam, myPokemon, other);
		int damageDealt3 = DragonPulse.getDamage(DragonPulse, myPokemon, other);
		int damageDealt4 = WaterPulse.getDamage(WaterPulse, myPokemon, other);
		
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
