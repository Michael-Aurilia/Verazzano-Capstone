import java.util.ArrayList;
import java.util.List;

public class Staraptor extends Pokemon{
	//Extra variable.
	private String info;
	
	public Staraptor() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Staraptor
	public Staraptor(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		List<String> moves9 = new ArrayList<>();
		List<String> attackTypes9 = new ArrayList<>();
		List<Integer> basePowers9 = new ArrayList<>();
		List<String> moveDescriptions9 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves9.add("Brave Bird");
				attackTypes9.add("Flying");
				basePowers9.add(120);
				moveDescriptions9.add("Flying Type, Physical: Staraptor used Brave Bird!");
				Attack BraveBird = new Attack(moveDescriptions9.get(0), 1, 15, attackTypes9.get(0), basePowers9.get(0), "Physical");
				
				moves9.add("Facade");
				attackTypes9.add("Normal");
				basePowers9.add(70);
				moveDescriptions9.add("Normal Type, Physical: Staraptor used Facade!");
				Attack Facade = new Attack(moveDescriptions9.get(1), 1, 20, attackTypes9.get(1), basePowers9.get(1), "Physical");
				
				moves9.add("Close Combat");
				attackTypes9.add("Fighting");
				basePowers9.add(120);
				moveDescriptions9.add("Fighting Type, Physical: Staraptor used Close Combat!");
				Attack CloseCombat = new Attack(moveDescriptions9.get(2), 1, 5, attackTypes9.get(2), basePowers9.get(2), "Physical");
				
				//Code this attack specifically
				moves9.add("Endeavor");
				attackTypes9.add("Normal");
				basePowers9.add(0);
				moveDescriptions9.add("Normal Type, Physical: Staraptor used Endeavor!");
				Attack Endeavor = new Attack(moveDescriptions9.get(3), 1, 15, attackTypes9.get(3), basePowers9.get(3), "Physical");
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions9.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = BraveBird.getDamage(BraveBird, myPokemon, other);
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
					double tempRecoil = damageDealt * (1.0/3);
					int recoilDamage = (int)(tempRecoil + .5);
					myPokemon.setHitPoints(myPokemon.getHitPoints() - recoilDamage);
					System.out.println("Staraptor takes " + recoilDamage + " damage in recoil!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions9.get(1));
					damageDealt = Facade.getDamage(Facade, myPokemon, other);
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
					damageDealt = CloseCombat.getDamage(CloseCombat, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					myPokemon.setDefenseStat(myPokemon.getDefenseStat() * 0.75);
					myPokemon.setSpecialDefenseStat(myPokemon.getSpecialDefenseStat() * 0.75);
					
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
					System.out.println("Staraptor's Defense and Special Defense dropped from closing the distance!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions9.get(3));
					
					if (Endeavor.getDamageMultiplier(attackTypes9.get(3), other) == 0) {
						System.out.println("The move had no effect.");
						System.out.println(other.getName() + " takes 0 damage!");
					}
					
					else if (myPokemon.getHitPoints() < other.getHitPoints()) {
						other.setHitPoints(myPokemon.getHitPoints());
						System.out.println("Staraptor and the target now have the same amount of hp!");
					}
					
					else if (myPokemon.getHitPoints() >= other.getHitPoints()) {
						System.out.println("The move failed since the target had less hp!");
					}	
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
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
				
				//Code this attack specifically
				moves9.add("Endeavor");
				attackTypes9.add("Normal");
				basePowers9.add(0);
				moveDescriptions9.add("Normal Type, Physical: Staraptor attacks by cutting down the foe's HP to equal the user's HP!");
				Attack Endeavor = new Attack(moveDescriptions9.get(3), 1, 15, attackTypes9.get(3), basePowers9.get(3), "Physical");
				
				int damageDealt1 = BraveBird.getDamage(BraveBird, myPokemon, other);
				int damageDealt2 = Facade.getDamage(Facade, myPokemon, other);
				int damageDealt3 = CloseCombat.getDamage(CloseCombat, myPokemon, other);
				int damageDealt4 = Endeavor.getDamage(Endeavor, myPokemon, other);
				
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
