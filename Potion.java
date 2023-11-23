//Either change this to have more potions or have them heal for more health such as full or always half
public class Potion implements Item{

	//Potion really only needs HP but I plan to make stat enhancing items in the future.
	public Potion(Pokemon myPokemon) {
		myPokemon.getHitPoints();
		myPokemon.getName();
	}
	@Override
	public void useItem(Pokemon myPokemon, int maxHP, int count) {
		//If the program ran the item function before it won't work again.
		if (count == 1) {
			System.out.println("You have no items left!");
		}
		else {
			System.out.println(myPokemon.getName() + " was given a potion!");
			//If the users Pokemon HP is already full, the potion will be wasted and have no effect.
			if (myPokemon.getHitPoints() == maxHP) {
				System.out.println("But their HP was already full! It has no effect!");
			}
			//If the Pokemon hasn't lost more than 50HP, it is healed back to max and the user is told how much health it healed as opposed to 50.
			else  {
				System.out.println(myPokemon.getName() + " was healed for " + (maxHP - myPokemon.getHitPoints()) + " health!");
				myPokemon.setHitPoints(maxHP);
			}
		}
		
		
	}
	
}
