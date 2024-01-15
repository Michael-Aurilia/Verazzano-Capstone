//Either change this to have more potions or have them heal for more health such as full or always half
public class Potion implements Item{

	//Potion really only needs HP but I plan to make stat enhancing items in the future.
	public Potion(Pokemon myPokemon) {
		myPokemon.getHitPoints();
		myPokemon.getName();
	}
	@Override
	public void useItem(Pokemon myPokemon, int maxHP) {
		System.out.println(myPokemon.getName() + " was given a Max Potion!");
		//If the users Pokemon HP is already full, the potion will be wasted and have no effect.
		if (myPokemon.getHitPoints() == maxHP) {
			System.out.println("But their HP was already full! It has no effect!");
		}
			
		else {
			System.out.println(myPokemon.getName() + " was healed back to full health!");
			myPokemon.setHitPoints(maxHP);
		}
	}	
}
