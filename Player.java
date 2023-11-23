public abstract class Player{
	
	//Has the info for the player's Pokemon as well as what item they have.
	public Player(Pokemon myPokemon, Item potion) {
		super();
		myPokemon.getHitPoints();
		myPokemon.getAttacks();
		myPokemon.getAttackStat();
		myPokemon.getSpecialAttackStat();
		myPokemon.getBattleCry();
		myPokemon.getDefenseStat();
		myPokemon.getSpecialDefenseStat();
		myPokemon.getType1();
		myPokemon.getType2();
		myPokemon.getName();
	}
	
	public abstract void run();
	
}
