//Interface that declares the use item function.
//Add more than just potions by implementing this interface in some new files

public interface Item{
	public void useItem(Pokemon myPokemon, int maxHP, int count);
}