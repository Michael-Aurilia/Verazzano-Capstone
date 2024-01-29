import java.util.ArrayList;
import java.util.List;

public class Togekiss extends Pokemon{
	//Extra variable.
	private String info;
	
	public Togekiss() {
		setInfo("How did you find this?");
	}
	
	//Takes info from the abstract Pokemon class to define Togekiss
	public Togekiss(int hp, int mhp, String status, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe, String info) {
		super(hp, mhp, status, name, type1, type2, attacks, bc, atk, def, spAtk, spDef, spe);
		setInfo(info);
	}
	
	//Performs the attack on the opposing Pokemon based on the index.
	@Override
	public void attack(Pokemon other, int attackIndex) {
		String battleCry7, PokemonInfo7;
		List<String> moves7 = new ArrayList<>();
		List<String> attackTypes7 = new ArrayList<>();
		List<Integer> basePowers7 = new ArrayList<>();
		List<String> moveDescriptions7 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves7.add("Air Slash");
				attackTypes7.add("Flying");
				basePowers7.add(75);
				moveDescriptions7.add("Flying Type, Special: Togekiss attacks with a blade of air that slices even the sky!");
				Attack AirSlash = new Attack(moveDescriptions7.get(0), 1, 15, attackTypes7.get(0), basePowers7.get(0), "Special");
				
				moves7.add("Tri Attack");
				attackTypes7.add("Normal");
				basePowers7.add(80);
				moveDescriptions7.add("Normal Type, Special: Togekiss strikes with a simultaneous three-beam attack!");
				Attack TriAttack = new Attack(moveDescriptions7.get(1), 1, 10, attackTypes7.get(1), basePowers7.get(1), "Special");
				
				moves7.add("Dazzling Gleam");
				attackTypes7.add("Fairy");
				basePowers7.add(80);
				moveDescriptions7.add("Fairy Type, Special: Togekiss damages opposing Pokémon by emitting a powerful flash!");
				Attack DazzlingGleam = new Attack(moveDescriptions7.get(2), 1, 10, attackTypes7.get(2), basePowers7.get(2), "Special");
				
				moves7.add("Flamethrower");
				attackTypes7.add("Fire");
				basePowers7.add(90);
				moveDescriptions7.add("Fire type, Special: Togekiss' foe is scorched with an intense blast of fire!");
				Attack Flamethrower = new Attack(moveDescriptions7.get(3), 1, 15, attackTypes7.get(3), basePowers7.get(3), "Special");
				
				PokemonInfo7 = "Togekiss shares many blessings with people who respect one another's rights and avoid needless strife.";
				battleCry7 = "Kisss!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Togekiss Kiss = new Togekiss(192, 192, "Healthy", "Togekiss", "Fairy", "Flying", moves7, battleCry7, 112, 161, 189, 183, 145, PokemonInfo7);
				
				int damageDealt;
				int remainingHP;
				
				if (attackIndex == 1) {
					System.out.println(moveDescriptions7.get(0));
					//This could be the key to the computer calculating damage before the turn starts. Check if this works in the runner maybe
					damageDealt = AirSlash.getDamage(AirSlash, Kiss, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (AirSlash.getDamageMultiplier(attackTypes7.get(0), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (AirSlash.getDamageMultiplier(attackTypes7.get(0), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (AirSlash.getDamageMultiplier(attackTypes7.get(0), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 2) {
					System.out.println(moveDescriptions7.get(1));
					damageDealt = TriAttack.getDamage(TriAttack, Kiss, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (TriAttack.getDamageMultiplier(attackTypes7.get(1), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (TriAttack.getDamageMultiplier(attackTypes7.get(1), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (TriAttack.getDamageMultiplier(attackTypes7.get(1), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 3) {
					System.out.println(moveDescriptions7.get(2));
					damageDealt = DazzlingGleam.getDamage(DazzlingGleam, Kiss, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (DazzlingGleam.getDamageMultiplier(attackTypes7.get(2), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (DazzlingGleam.getDamageMultiplier(attackTypes7.get(2), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (DazzlingGleam.getDamageMultiplier(attackTypes7.get(2), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
				else if (attackIndex == 4) {
					System.out.println(moveDescriptions7.get(3));
					damageDealt = Flamethrower.getDamage(Flamethrower, Kiss, other);
					remainingHP = other.getHitPoints() - damageDealt;
					other.setHitPoints(remainingHP);
					if (Flamethrower.getDamageMultiplier(attackTypes7.get(3), other) >= 2) {
						System.out.println("It's super effective!");
					}
					else if (Flamethrower.getDamageMultiplier(attackTypes7.get(3), other) == 0) {
						System.out.println("The move had no effect.");
					}
					else if (Flamethrower.getDamageMultiplier(attackTypes7.get(3), other) <= 0.5) {
						System.out.println("It's not very effective...");
					}
					System.out.println(other.getName() + " takes " + damageDealt + " damage!");
				}
	}
	
	public List<Integer> getDamages(Pokemon myPokemon, Pokemon other){
		String battleCry7, PokemonInfo7;
		List<String> moves7 = new ArrayList<>();
		List<String> attackTypes7 = new ArrayList<>();
		List<Integer> basePowers7 = new ArrayList<>();
		List<String> moveDescriptions7 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
				moves7.add("Air Slash");
				attackTypes7.add("Flying");
				basePowers7.add(75);
				moveDescriptions7.add("Flying Type, Special: Togekiss attacks with a blade of air that slices even the sky!");
				Attack AirSlash = new Attack(moveDescriptions7.get(0), 1, 15, attackTypes7.get(0), basePowers7.get(0), "Special");
				
				moves7.add("Tri Attack");
				attackTypes7.add("Normal");
				basePowers7.add(80);
				moveDescriptions7.add("Normal Type, Special: Togekiss strikes with a simultaneous three-beam attack!");
				Attack TriAttack = new Attack(moveDescriptions7.get(1), 1, 10, attackTypes7.get(1), basePowers7.get(1), "Special");
				
				moves7.add("Dazzling Gleam");
				attackTypes7.add("Fairy");
				basePowers7.add(80);
				moveDescriptions7.add("Fairy Type, Special: Togekiss damages opposing Pokémon by emitting a powerful flash!");
				Attack DazzlingGleam = new Attack(moveDescriptions7.get(2), 1, 10, attackTypes7.get(2), basePowers7.get(2), "Special");
				
				moves7.add("Flamethrower");
				attackTypes7.add("Fire");
				basePowers7.add(90);
				moveDescriptions7.add("Fire type, Special: Togekiss' foe is scorched with an intense blast of fire!");
				Attack Flamethrower = new Attack(moveDescriptions7.get(3), 1, 15, attackTypes7.get(3), basePowers7.get(3), "Special");
				
				PokemonInfo7 = "Togekiss shares many blessings with people who respect one another's rights and avoid needless strife.";
				battleCry7 = "Kisss!";
				
				//HP, Type1, Type2, moves, battlecry, atk, def, spAtk, spDef, spe, Info
				Togekiss Kiss = new Togekiss(192, 192, "Healthy", "Togekiss", "Fairy", "Flying", moves7, battleCry7, 112, 161, 189, 183, 145, PokemonInfo7);
				
				int damageDealt1 = AirSlash.getDamage(AirSlash, Kiss, other);
				int damageDealt2 = TriAttack.getDamage(TriAttack, Kiss, other);
				int damageDealt3 = DazzlingGleam.getDamage(DazzlingGleam, Kiss, other);
				int damageDealt4 = Flamethrower.getDamage(Flamethrower, Kiss, other);
				
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
