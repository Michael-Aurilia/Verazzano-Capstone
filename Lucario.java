import java.util.ArrayList;
import java.util.List;

public class Lucario extends Pokemon{
	//Extra variable.
	private String info;
	
	public Lucario() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Lucario
	public Lucario(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		List<String> moves6 = new ArrayList<>();
		List<String> attackTypes6 = new ArrayList<>();
		List<Integer> basePowers6 = new ArrayList<>();
		List<String> moveDescriptions6 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves6.add("Aura Sphere");
				attackTypes6.add("Fighting");
				basePowers6.add(80);
				moveDescriptions6.add("Fighting Type, Special: Lucario used Aura Sphere!");
				Attack AuraSphere = new Attack(moveDescriptions6.get(0), 1, 20, attackTypes6.get(0), basePowers6.get(0), "Special");
				
				moves6.add("Flash Cannon");
				attackTypes6.add("Steel");
				basePowers6.add(80);
				moveDescriptions6.add("Steel Type, Special: Lucario used Flash Cannon!");
				Attack FlashCannon = new Attack(moveDescriptions6.get(1), 1, 10, attackTypes6.get(1), basePowers6.get(1), "Special");
				
				moves6.add("Close Combat");
				attackTypes6.add("Fighting");
				basePowers6.add(120);
				moveDescriptions6.add("Fighting Type, Physical: Lucario used Close Combat!");
				Attack CloseCombat = new Attack(moveDescriptions6.get(2), 1, 5, attackTypes6.get(2), basePowers6.get(2), "Physical");
				
				moves6.add("Crunch");
				attackTypes6.add("Dark");
				basePowers6.add(80);
				moveDescriptions6.add("Dark Type, Physical: Lucario used Crunch!");
				Attack Crunch = new Attack(moveDescriptions6.get(3), 1, 15, attackTypes6.get(3), basePowers6.get(3), "Physical");
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions6.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = AuraSphere.getDamage(AuraSphere, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions6.get(1));
					damageDealt = FlashCannon.getDamage(FlashCannon, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions6.get(2));
					damageDealt = CloseCombat.getDamage(CloseCombat, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					myPokemon.setDefenseStat(myPokemon.getDefenseStat() * 0.75);
					myPokemon.setSpecialDefenseStat(myPokemon.getSpecialDefenseStat() * 0.75);
					
					if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
					System.out.println("Lucario's Defense and Special Defense dropped from closing the distance!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions6.get(3));
					damageDealt = Crunch.getDamage(Crunch, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		List<String> moves6 = new ArrayList<>();
		List<String> attackTypes6 = new ArrayList<>();
		List<Integer> basePowers6 = new ArrayList<>();
		List<String> moveDescriptions6 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves6.add("Aura Sphere");
		attackTypes6.add("Fighting");
		basePowers6.add(80);
		moveDescriptions6.add("Fighting Type, Special: Lucario looses a blast of aura power from deep within its body!");
		Attack AuraSphere = new Attack(moveDescriptions6.get(0), 1, 20, attackTypes6.get(0), basePowers6.get(0), "Special");
				
		moves6.add("Flash Cannon");
		attackTypes6.add("Steel");
		basePowers6.add(80);
		moveDescriptions6.add("Steel Type, Special: Lucario gathers all its light energy and releases it at once!");
		Attack FlashCannon = new Attack(moveDescriptions6.get(1), 1, 10, attackTypes6.get(1), basePowers6.get(1), "Special");
				
		moves6.add("Close Combat");
		attackTypes6.add("Fighting");
		basePowers6.add(120);
		moveDescriptions6.add("Fighting Type, Physical: Lucario fights the foe in close without guarding itself!");
		Attack CloseCombat = new Attack(moveDescriptions6.get(2), 1, 5, attackTypes6.get(2), basePowers6.get(2), "Physical");
				
		moves6.add("Crunch");
		attackTypes6.add("Dark");
		basePowers6.add(80);
		moveDescriptions6.add("Dark Type, Physical: Lucario crunches up the foe with sharp fangs!");
		Attack Crunch = new Attack(moveDescriptions6.get(3), 1, 15, attackTypes6.get(3), basePowers6.get(3), "Physical");
		
		int damageDealt1 = AuraSphere.getDamage(AuraSphere, myPokemon, other);
		int damageDealt2 = FlashCannon.getDamage(FlashCannon, myPokemon, other);
		int damageDealt3 = CloseCombat.getDamage(CloseCombat, myPokemon, other);
		int damageDealt4 = Crunch.getDamage(Crunch, myPokemon, other);
		
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
