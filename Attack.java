import java.util.Scanner;
import java.io.File;
import java.lang.Math;

/* 
 * Legend for types:
 * 0: Normal
 * 1: Fighting
 * 2: Flying
 * 3: Poison
 * 4: Ground
 * 5: Rock
 * 6: Bug
 * 7: Ghost
 * 8: Steel
 * 9: Fire
 * 10: Water
 * 11: Grass
 * 12: Electric
 * 13: Psychic
 * 14: Ice
 * 15: Dragon
 * 16: Dark
 * 17: Fairy
 * 18: Null
*/

public class Attack {
	private String attackName;
	private int movePowerPoints;
	private String attackType;
	private int baseDamage;
	private String attackCategory;
	
	Scanner input;
	static String[][] grid = new String[19][19];
	
	public Attack() {
		attackName = "The user Has no moves left and struggles!";
		attackType = "Null";
		baseDamage = 50;
	}
	
	public Attack(String an, int mpp, String at, int bd, String ac) {
		setAttackName(an);
		setAttackType(at);
		
		setmovePowerPoints(mpp);
		setBaseDamage(bd);
		setAttackCategory(ac);
	}
	//Enum to simplify the types into string
	public enum PokemonType {
	    Bug(6), Dragon(15), Electric(12), Fighting(1), Fire(9),
	    Flying(2), Ghost(7), Grass(11), Ground(4), Ice(14),
	    Normal(0), Poison(3), Psychic(13), Rock(5), Water(10),
	    Null(18), Steel(8), Dark(16), Fairy(17);

	    private final int value;

	    PokemonType(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	//Enum to simplify the multiplier strings into doubles.
	public enum AttackMultiplier {
	    S(2.0),
	    N(0.0),
	    R(0.5),
	    B(1.0);

	    private final double multiplier;

	    AttackMultiplier(double multiplier) {
	        this.multiplier = multiplier;
	    }

	    public double getMultiplier() {
	        return multiplier;
	    }
	}
	
	public double getDamageMultiplier(String at, Pokemon other) {
		//Reads in the type flowchart from a file
		try {
			input = new Scanner(new File("C:\\Users\\miro1\\eclipse-workspace\\Pokemon_World_Champion_Edition\\src\\TypeInfo.txt"));
		} catch(Exception e) {
			//code to deal with this exception
			e.printStackTrace();
			System.out.println("Error opening the file!");
			input = new Scanner(System.in);
		}
		
		for(int r = 0; r < grid.length; r++) {
			   for(int c = 0; c < grid[r].length; c++) {
			      grid[r][c] = input.next().trim();
			   }
			}
		input.close();
		
		//Sets values based on the type of the attack. The 18 is a default case which has all its interactions as no multiplier
		int attackType = 18;
		int oppType1 = 18;
		int oppType2 = 18;
		
		//Turns the attacks type into an int.
		attackType = PokemonType.valueOf(at).getValue();
		
		//Turns the opposing Pokemon's first type to an int.
		oppType1 = PokemonType.valueOf(other.getType1()).getValue();

		//Turns the opposing Pokemon's second type to an int.
		oppType2 = PokemonType.valueOf(other.getType2()).getValue();
		
		//Reads the data from the array to determine the effectiveness of the move against the opposing Pokemon.
		AttackMultiplier multiplier1 = AttackMultiplier.valueOf(grid[attackType][oppType1].toUpperCase());
		AttackMultiplier multiplier2 = AttackMultiplier.valueOf(grid[attackType][oppType2].toUpperCase());

		//Calculates the total damage multiplier and returns it.
		double totalMultiplier = multiplier1.getMultiplier() * multiplier2.getMultiplier();
		return totalMultiplier;
	}
	
	public int getDamage(Attack move, Pokemon myPokemon, Pokemon other) {
		//Calculates the damage each attack does
		double STAB; //This stands for Same-Type-Attack-Bonus. If the Pokemon has one of the same types as the moved it uses, it deals 1.5 times the normal amount of damage
		if (attackType == myPokemon.getType1() || attackType == myPokemon.getType2()) {
			STAB = 1.5;
		}
		else {
			STAB = 1;
		}
		//Pokemon damage is actually somewhat random. Damage dealt by the same move on the same opponent isn't always the same. This is called a high or low roll
		double rand = (Math.random() * (100 - 85 + 1) + 85) / 100;
		double damageMultiplier = move.getDamageMultiplier(attackType, other);
		double AtkOverDef = myPokemon.getAttackStat() / other.getDefenseStat();
		double spAtkOverspDef = myPokemon.getSpecialAttackStat() / other.getSpecialDefenseStat();
		double totalDamage = 0;
		
		//These equations are the way that damage is calculated in the mainline games. There are actually a few special attacks that can hit an opponents physical defense but I won't go into that here.
		if (attackCategory == "Physical") {
			totalDamage = (((22 * move.getBaseDamage() * AtkOverDef) / 50) + 2) * STAB * damageMultiplier * rand;
		}
		else if (attackCategory == "Special") {
			totalDamage = (((22 * move.getBaseDamage() * spAtkOverspDef) / 50) + 2) * STAB * damageMultiplier * rand;
		}
		
		//Casts the damage to an int to better relate to the HP which is also an int.
		int roundedDamage = (int)totalDamage;
		return roundedDamage;
	}
	
	//Mutators.
	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}
	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public String getAttackCategory() {
		return attackCategory;
	}

	public void setAttackCategory(String attackCategory) {
		this.attackCategory = attackCategory;
	}

	public int getmovePowerPoints() {
		return movePowerPoints;
	}

	public void setmovePowerPoints(int movePowerPoints) {
		this.movePowerPoints = movePowerPoints;
	}
	
	public String toString() {
		String s = "";
		s+= " Attack name: " + attackName + "\n";
		s+= "Attack type: " + attackType + "\n";
		s+= "Base Power: " + baseDamage + "\n";
		s+= "Attack Category: " + attackCategory + "\n";
		s+= "Move Power Points: " + movePowerPoints + "\n";
		return s;
	}
}
