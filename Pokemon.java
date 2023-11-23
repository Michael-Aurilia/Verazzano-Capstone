
import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon implements Comparable<Pokemon>{
	//Variables.
	private int hitPoints;
	private double attackStat, specialAttackStat;
	private double defenseStat, specialDefenseStat;
	private double speedStat;
	private String name;
	private String type1;
	private String type2;
	private List<String> attacks = new ArrayList<>();
	private String battleCry;
	
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();
	
	public Pokemon() {
		name = "Missingno";
		type1 = "Normal";
		setType2("Normal");
		hitPoints = 139;
		attackStat = 187;
		defenseStat = 0;
		battleCry = "............";
	}
	
	//This constructor gives each Pokemon it's stats.
	public Pokemon(int hp, String name, String type1, String type2, List<String> attacks, String bc, double atk, double def, double spAtk, double spDef, double spe) {
		super();
		setHitPoints(hp);
		setName(name);
		setType1(type1);
		setType2(type2);
		setAttacks(attacks);
		setAttackStat(atk);
		setDefenseStat(def);
		setSpecialAttackStat(spAtk);
		setSpecialDefenseStat(spDef);
		setSpeedStat(spe);
		setBattleCry(bc);
	}
	
	//Mutators.
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public List<String> getAttacks() {
		return attacks;
	}

	public void setAttacks(List<String> attacks) {
		this.attacks = attacks;
	}

	public String getBattleCry() {
		return battleCry;
	}

	public void setBattleCry(String battleCry) {
		this.battleCry = battleCry;
	}
	
	public double getAttackStat() {
		return attackStat;
	}
	
	public void setAttackStat(double attackStat) {
		this.attackStat = attackStat;
	}
	
	public double getDefenseStat() {
		return defenseStat;
	}
	
	public void setDefenseStat(double defenseStat) {
		this.defenseStat = defenseStat;
	}
	
	public String getType2() {
		return type2;
	}
	
	public void setType2(String type2) {
		this.type2 = type2;
	}
	
	public double getSpecialAttackStat() {
		return specialAttackStat;
	}
	
	public void setSpecialAttackStat(double specialAttackStat) {
		this.specialAttackStat = specialAttackStat;
	}
	
	public double getSpecialDefenseStat() {
		return specialDefenseStat;
	}
	
	public void setSpecialDefenseStat(double specialDefenseStat) {
		this.specialDefenseStat = specialDefenseStat;
	}
	
	public double getSpeedStat() {
		return speedStat;
	}
	
	public void setSpeedStat(double speedStat) {
		this.speedStat = speedStat;
	}
	
	//Method to print out Pokemon.
	public String toString() {
		String s = "";
		s+= "Name: " + name + "\n";
		s+= "First type: " + type1 + "\n";
		s+= "Second type: " + type2 + "\n";
		s+= "HP: " + hitPoints + "\n";
		s+= "Attack stat: " + attackStat + "\n";
		s+= "Spcial Attack stat: " + specialAttackStat + "\n";
		s+= "Defense stat: " + defenseStat + "\n";
		s+= "Special Defense stat: " + specialDefenseStat + "\n";
		s+= "Speed stat: " + speedStat + "\n";
		s+= "Known moves: " + attacks + "\n";
		return s;
	}
}