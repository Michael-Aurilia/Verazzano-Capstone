public abstract class Player{
	
	private Pokemon myPokemon;

	//Has the info for the player's Pokemon as well as what item they have.
	public Player(Pokemon myPokemon) {
		super();
		this.myPokemon = myPokemon;
		myPokemon.getHitPoints();
		myPokemon.getAttacks();
		myPokemon.getAttackStat();
		myPokemon.getSpecialAttackStat();
		myPokemon.getBattleCry();
		myPokemon.getDefenseStat();
		myPokemon.getSpecialDefenseStat();
		myPokemon.getSpeedStat();
		myPokemon.getType1();
		myPokemon.getType2();
		myPokemon.getName();
		myPokemon.getStatus();
	}

	public Pokemon getMyPokemon() {
		return myPokemon;
	}

	public void setMyPokemon(Pokemon myPokemon) {
		this.myPokemon = myPokemon;
	}
}
