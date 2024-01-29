import java.util.ArrayList;
import java.util.List;

public class Spiritomb extends Pokemon{
	//Extra variable.
	private String info;
	
	public Spiritomb() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Spiritomb
	public Spiritomb(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry8, PokemonInfo8;
		List<String> moves8 = new ArrayList<>();
		List<String> attackTypes8 = new ArrayList<>();
		List<Integer> basePowers8 = new ArrayList<>();
		List<String> moveDescriptions8 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves8.add("Shadow Ball");
				attackTypes8.add("Ghost");
				basePowers8.add(80);
				moveDescriptions8.add("Ghost Type, Special: Spiritomb hurls a shadowy blob at the opposing Pokemon!");
				Attack ShadowBall = new Attack(moveDescriptions8.get(0), 1, 15, attackTypes8.get(0), basePowers8.get(0), "Special");
				
				moves8.add("Dark Pulse");
				attackTypes8.add("Dark");
				basePowers8.add(80);
				moveDescriptions8.add("Dark Type, Special: Spiritomb releases a horrible aura imbued with dark thoughts!");
				Attack DarkPulse = new Attack(moveDescriptions8.get(1), 1, 15, attackTypes8.get(1), basePowers8.get(1), "Special");
				
				//Will become Will-o-wisp
				moves8.add("Icy Wind");
				attackTypes8.add("Ice");
				basePowers8.add(55);
				moveDescriptions8.add("Ice Type, Special: Spiritomb attacks with a gust of chilled air!");
				Attack IcyWind = new Attack(moveDescriptions8.get(2), 1, 15, attackTypes8.get(2), basePowers8.get(2), "Special");
				
				moves8.add("Hex");
				attackTypes8.add("Ghost");
				basePowers8.add(65);
				moveDescriptions8.add("Ghost type, Special: Spiritomb attacks with relentless intensity!");
				Attack Hex = new Attack(moveDescriptions8.get(3), 1, 10, attackTypes8.get(3), basePowers8.get(3), "Special");
				
				PokemonInfo8 = "Spiritomb was formed by 108 spirits. It is bound to a fissure in an Odd Keystone.";
				battleCry8 = "OOOOOO!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Spiritomb Tomb = new Spiritomb(157, 157, "Healthy", "Spiritomb", "Ghost", "Dark", moves8, battleCry8, 158, 176, 158, 176, 95, PokemonInfo8);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions8.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = ShadowBall.getDamage(ShadowBall, Tomb, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (ShadowBall.getDamageMultiplier(attackTypes8.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (ShadowBall.getDamageMultiplier(attackTypes8.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (ShadowBall.getDamageMultiplier(attackTypes8.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions8.get(1));
					damageDealt = DarkPulse.getDamage(DarkPulse, Tomb, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (DarkPulse.getDamageMultiplier(attackTypes8.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (DarkPulse.getDamageMultiplier(attackTypes8.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (DarkPulse.getDamageMultiplier(attackTypes8.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions8.get(2));
					damageDealt = IcyWind.getDamage(IcyWind, Tomb, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (IcyWind.getDamageMultiplier(attackTypes8.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (IcyWind.getDamageMultiplier(attackTypes8.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (IcyWind.getDamageMultiplier(attackTypes8.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions8.get(3));
					damageDealt = Hex.getDamage(Hex, Tomb, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Hex.getDamageMultiplier(attackTypes8.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Hex.getDamageMultiplier(attackTypes8.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Hex.getDamageMultiplier(attackTypes8.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		String battleCry8, PokemonInfo8;
		List<String> moves8 = new ArrayList<>();
		List<String> attackTypes8 = new ArrayList<>();
		List<Integer> basePowers8 = new ArrayList<>();
		List<String> moveDescriptions8 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves8.add("Shadow Ball");
				attackTypes8.add("Ghost");
				basePowers8.add(80);
				moveDescriptions8.add("Ghost Type, Special: Spiritomb hurls a shadowy blob at the opposing Pokemon!");
				Attack ShadowBall = new Attack(moveDescriptions8.get(0), 1, 15, attackTypes8.get(0), basePowers8.get(0), "Special");
				
				moves8.add("Dark Pulse");
				attackTypes8.add("Dark");
				basePowers8.add(80);
				moveDescriptions8.add("Dark Type, Special: Spiritomb releases a horrible aura imbued with dark thoughts!");
				Attack DarkPulse = new Attack(moveDescriptions8.get(1), 1, 15, attackTypes8.get(1), basePowers8.get(1), "Special");
				
				//Will become Will-o-wisp
				moves8.add("Icy Wind");
				attackTypes8.add("Ice");
				basePowers8.add(55);
				moveDescriptions8.add("Ice Type, Special: Spiritomb attacks with a gust of chilled air!");
				Attack IcyWind = new Attack(moveDescriptions8.get(2), 1, 15, attackTypes8.get(2), basePowers8.get(2), "Special");
				
				moves8.add("Hex");
				attackTypes8.add("Ghost");
				basePowers8.add(65);
				moveDescriptions8.add("Ghost type, Special: Spiritomb attacks with relentless intensity!");
				Attack Hex = new Attack(moveDescriptions8.get(3), 1, 10, attackTypes8.get(3), basePowers8.get(3), "Special");
				
				PokemonInfo8 = "Spiritomb was formed by 108 spirits. It is bound to a fissure in an Odd Keystone.";
				battleCry8 = "OOOOOO!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Spiritomb Tomb = new Spiritomb(157, 157, "Healthy", "Spiritomb", "Ghost", "Dark", moves8, battleCry8, 158, 176, 158, 176, 95, PokemonInfo8);
				
				int damageDealt1 = ShadowBall.getDamage(ShadowBall, Tomb, other);
				int damageDealt2 = DarkPulse.getDamage(DarkPulse, Tomb, other);
				int damageDealt3 = IcyWind.getDamage(IcyWind, Tomb, other);
				int damageDealt4 = Hex.getDamage(Hex, Tomb, other);
				
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
