import java.util.ArrayList;
import java.util.List;

public class Staraptor extends Pokemon{
	//Extra variable.
	private String info;
	
	public Staraptor() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Staraptor
	public Staraptor(int hp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry9, PokemonInfo9;
		List<String> moves9 = new ArrayList<>();
		List<String> attackTypes9 = new ArrayList<>();
		List<Integer> basePowers9 = new ArrayList<>();
		List<String> moveDescriptions9 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves9.add("Brave Bird");
				attackTypes9.add("Flying");
				basePowers9.add(120);
				moveDescriptions9.add("Flying Type, Physical: Staraptor tucks in its wings and charges from a low altitude!");
				Attack BraveBird = new Attack(moveDescriptions9.get(0), 1, 15, attackTypes9.get(0), basePowers9.get(0), "Physical");
				
				moves9.add("Facade");
				attackTypes9.add("Normal");
				basePowers9.add(70);
				moveDescriptions9.add("Normal Type, Physical: Staraptor attacks by bashing the target!");
				Attack Facade = new Attack(moveDescriptions9.get(1), 1, 20, attackTypes9.get(1), basePowers9.get(1), "Physical");
				
				moves9.add("Close Combat");
				attackTypes9.add("Fighting");
				basePowers9.add(120);
				moveDescriptions9.add("Fighting Type, Physical: Staraptor fights the foe in close without guarding itself!");
				Attack CloseCombat = new Attack(moveDescriptions9.get(2), 1, 5, attackTypes9.get(2), basePowers9.get(2), "Physical");
				
				//Codee this attack specifically
				moves9.add("Endeavor");
				attackTypes9.add("Normal");
				basePowers9.add(0);
				moveDescriptions9.add("Normal Type, Physical: Staraptor attacks by cutting down the foe's HP to equal the user's HP!");
				Attack Endeavor = new Attack(moveDescriptions9.get(3), 1, 15, attackTypes9.get(3), basePowers9.get(3), "Physical");
				
				PokemonInfo9 = "Staraptor never stops attacking even if it is injured. It fusses over the shape of its comb.";
				battleCry9 = "Bird Up!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Staraptor Star = new Staraptor(192, "Staraptor", "Normal", "Flying", moves9, battleCry9, 189, 134, 112, 123, 167, PokemonInfo9);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions9.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = BraveBird.getDamage(BraveBird, Star, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (BraveBird.getDamageMultiplier(attackTypes9.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (BraveBird.getDamageMultiplier(attackTypes9.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (BraveBird.getDamageMultiplier(attackTypes9.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions9.get(1));
					damageDealt = Facade.getDamage(Facade, Star, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Facade.getDamageMultiplier(attackTypes9.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Facade.getDamageMultiplier(attackTypes9.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Facade.getDamageMultiplier(attackTypes9.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions9.get(2));
					damageDealt = CloseCombat.getDamage(CloseCombat, Star, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (CloseCombat.getDamageMultiplier(attackTypes9.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes9.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (CloseCombat.getDamageMultiplier(attackTypes9.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions9.get(3));
					damageDealt = Endeavor.getDamage(Endeavor, Star, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Endeavor.getDamageMultiplier(attackTypes9.get(3), other) == 0) {
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
		s+= "Special Attack stat: " + getSpecialAttackStat() + "\n";
		s+= "Special Defense stat: " + getSpecialDefenseStat() + "\n";
		s+= "Speed stat: " + getSpeedStat() + "\n";
		s+= "Known moves: " + getAttacks() + "\n";
		s+= "Info: " + info + "\n";
		return s;
	}
}
