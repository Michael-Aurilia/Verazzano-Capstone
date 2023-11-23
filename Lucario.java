import java.util.ArrayList;
import java.util.List;

public class Lucario extends Pokemon{
	//Extra variable.
	private String info;
	
	public Lucario() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Blastois;
	public Lucario(int hp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry6, PokemonInfo6;
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
				
				PokemonInfo6 = "A well-trained Lucario can sense auras to identify and take in the feelings of creatures over half a mile away.";
				battleCry6 = "Roar!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Lucario LUC = new Lucario(177, "Lucario", "Fighting", "Steel", moves6, battleCry6, 178, 134, 183, 134, 156, PokemonInfo6);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions6.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = AuraSphere.getDamage(AuraSphere, LUC, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					else if (AuraSphere.getDamageMultiplier(attackTypes6.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions6.get(1));
					damageDealt = FlashCannon.getDamage(FlashCannon, LUC, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					else if (FlashCannon.getDamageMultiplier(attackTypes6.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions6.get(2));
					damageDealt = CloseCombat.getDamage(CloseCombat, LUC, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes6.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions6.get(3));
					damageDealt = Crunch.getDamage(Crunch, LUC, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					else if (Crunch.getDamageMultiplier(attackTypes6.get(3), other) == 0) {
						System.out.println("The move had no effect.");
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
		s+= "Known moves: " + getAttacks() + "\n";
		s+= "Info: " + info + "\n";
		return s;
	}
}