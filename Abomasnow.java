import java.util.ArrayList;
import java.util.List;

public class Abomasnow extends Pokemon{
	//Extra variable.
	private String info;
	
	public Abomasnow() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Lucario
	public Abomasnow(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon myPokemon, Pokemon other, int attackIndex) {
		List<String> moves10 = new ArrayList<>();
		List<String> attackTypes10 = new ArrayList<>();
		List<Integer> basePowers10 = new ArrayList<>();
		List<String> moveDescriptions10 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves10.add("Energy Ball");
				attackTypes10.add("Grass");
				basePowers10.add(80);
				moveDescriptions10.add("Grass Type, Special: Abomasnow used Energy Ball!");
				Attack EnergyBall = new Attack(moveDescriptions10.get(0), 1, 10, attackTypes10.get(0), basePowers10.get(0), "Special");
				
				moves10.add("Blizzard");
				attackTypes10.add("Ice");
				basePowers10.add(110);
				moveDescriptions10.add("Ice Type, Special: Abomasnow used Blizzard!");
				Attack Blizzard = new Attack(moveDescriptions10.get(1), 1, 5, attackTypes10.get(1), basePowers10.get(1), "Special");
				
				moves10.add("Wood Hammer");
				attackTypes10.add("Grass");
				basePowers10.add(120);
				moveDescriptions10.add("Grass Type, Physical: Abomasnow used Wood Hammer!");
				Attack WoodHammer = new Attack(moveDescriptions10.get(2), 1, 15, attackTypes10.get(2), basePowers10.get(2), "Physical");
				
				moves10.add("Ice Punch");
				attackTypes10.add("Ice");
				basePowers10.add(75);
				moveDescriptions10.add("Dark Type, Physical: Abomasnow used Ice Punch!");
				Attack IcePunch = new Attack(moveDescriptions10.get(3), 1, 15, attackTypes10.get(3), basePowers10.get(3), "Physical");
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions10.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = EnergyBall.getDamage(EnergyBall, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (EnergyBall.getDamageMultiplier(attackTypes10.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (EnergyBall.getDamageMultiplier(attackTypes10.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (EnergyBall.getDamageMultiplier(attackTypes10.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions10.get(1));
					damageDealt = Blizzard.getDamage(Blizzard, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Blizzard.getDamageMultiplier(attackTypes10.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Blizzard.getDamageMultiplier(attackTypes10.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Blizzard.getDamageMultiplier(attackTypes10.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions10.get(2));
					damageDealt = WoodHammer.getDamage(WoodHammer, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (WoodHammer.getDamageMultiplier(attackTypes10.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (WoodHammer.getDamageMultiplier(attackTypes10.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (WoodHammer.getDamageMultiplier(attackTypes10.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
					double tempRecoil = damageDealt * 0.33;
					int recoilDamage = (int)(tempRecoil + .5);
					myPokemon.setHitPoints(myPokemon.getHitPoints() - recoilDamage);
					System.out.println("Abomasnow takes " + recoilDamage + " damage in recoil!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions10.get(3));
					damageDealt = IcePunch.getDamage (IcePunch, myPokemon, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (IcePunch.getDamageMultiplier(attackTypes10.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (IcePunch.getDamageMultiplier(attackTypes10.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (IcePunch.getDamageMultiplier(attackTypes10.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		List<String> moves10 = new ArrayList<>();
		List<String> attackTypes10 = new ArrayList<>();
		List<Integer> basePowers10 = new ArrayList<>();
		List<String> moveDescriptions10 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves10.add("Energy Ball");
				attackTypes10.add("Grass");
				basePowers10.add(80);
				moveDescriptions10.add("Grass Type, Special: Abomasnow draws power from nature and fires it at the foe!");
				Attack EnergyBall = new Attack(moveDescriptions10.get(0), 1, 10, attackTypes10.get(0), basePowers10.get(0), "Special");
				
				moves10.add("Blizzard");
				attackTypes10.add("Ice");
				basePowers10.add(110);
				moveDescriptions10.add("Ice Type, Special: Abomasnow summons howling blizzard to strike the foe!");
				Attack Blizzard = new Attack(moveDescriptions10.get(1), 1, 5, attackTypes10.get(1), basePowers10.get(1), "Special");
				
				moves10.add("Wood Hammer");
				attackTypes10.add("Grass");
				basePowers10.add(120);
				moveDescriptions10.add("Grass Type, Physical: Abomasnow slams its rugged body into the foe to attack!");
				Attack WoodHammer = new Attack(moveDescriptions10.get(2), 1, 15, attackTypes10.get(2), basePowers10.get(2), "Physical");
				
				moves10.add("Ice Punch");
				attackTypes10.add("Ice");
				basePowers10.add(75);
				moveDescriptions10.add("Dark Type, Physical: Abomasnow punches the foe with an icy fist!");
				Attack IcePunch = new Attack(moveDescriptions10.get(3), 1, 15, attackTypes10.get(3), basePowers10.get(3), "Physical");
				
				int damageDealt1 = EnergyBall.getDamage(EnergyBall, myPokemon, other);
				int damageDealt2 = Blizzard.getDamage(Blizzard, myPokemon, other);
				int damageDealt3 = WoodHammer.getDamage(WoodHammer, myPokemon, other);
				int damageDealt4 = IcePunch.getDamage(IcePunch, myPokemon, other);
				
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
