import java.util.Arrays;
import java.util.List;

public class PokemonFactory {
	public static Swampert createSwampert() {
        List<String> moves = Arrays.asList("Liquidation", "Ice Beam", "Earthquake", "Rock Slide");
        String battleCry = "Blastoooise!";
        String info = "Swampert is very strong. It has enough power to easily drag a boulder weighing more than a ton. This Pokémon also has powerful vision that lets it see even in murky water.";
        return new Swampert(207, 207, "Healthy", "Swampert", "Water", "Ground", moves, battleCry, 178, 156, 150, 172, 143, info);
	}
	
	public static Jolteon createJolteon() {
		List<String> moves = Arrays.asList("Thunderbolt", "Hyper Voice", "Shadow Ball", "Double Kick");
		String info = "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.";
		String battleCry = "Jolteeee!";
		return new Jolteon(172, 172, "Healthy", "Jolteon", "Electric", "Null", moves, battleCry, 128, 152, 178, 161, 200, info);
	}
	
	public static Garchomp createGarchomp() {
		List<String> moves = Arrays.asList("Dragon Claw", "Fire Fang", "Earthquake", "Rock Slide");
		String info = "When Garchomp folds up its body and extends its wings, it looks like a jet plane. It flies at sonic speed.";
		String battleCry = "Roar!";
		return new Garchomp(215, 215, "Healthy", "Garchomp", "Dragon", "Ground", moves, battleCry, 200, 161, 145, 150, 169, info);
	}
	
	public static Roserade createRoserade() {
		List<String> moves = Arrays.asList("Energy Ball", "Sludge Bomb", "Dazzling Gleam", "Extrasensory");
		String info = "With the movements of a dancer, Roserade strikes with whips that are densely lined with poison thorns.";
		String battleCry = "Rose!";
		return new Roserade(167, 167, "Healthy", "Roserade", "Grass", "Poison", moves, battleCry, 134, 128, 194, 172, 156, info);
	}
	
	public static Milotic createMilotic() {
		List<String> moves = Arrays.asList("Surf", "Ice Beam", "Dragon Pulse", "Water Pulse");
		String info = "It is the world's most beautiful Pokémon. There are many works of art featuring Milotic.";
		String battleCry = "Roar!";
		return new Milotic(202, 202, "Healthy", "Milotic", "Water", "Null", moves, battleCry, 123, 144, 167, 194, 146, info);
	}
	
	public static Lucario createLucario() {
		List<String> moves = Arrays.asList("Aura Sphere", "Flash Cannon", "Close Combat", "Crunch");
		String info = "A well-trained Lucario can sense auras to identify and take in the feelings of creatures over half a mile away.";
		String battleCry = "Roar!";
		return new Lucario(177, 177, "Healthy", "Lucario", "Fighting", "Steel", moves, battleCry, 178, 134, 183, 134, 156, info);
	}
	
	public static Togekiss createTogekiss() {
		List<String> moves = Arrays.asList("Air Slash", "Tri Attack", "Dazzling Gleam", "Flamethrower");
		String info = "Togekiss shares many blessings with people who respect one another's rights and avoid needless strife.";
		String battleCry = "Kisss!";
		return new Togekiss(192, 192, "Healthy", "Togekiss", "Fairy", "Flying", moves, battleCry, 112, 161, 189, 183, 145, info);
	}
	
	public static Spiritomb createSpiritomb() {
		List<String> moves = Arrays.asList("Shadow Ball", "Dark Pulse", "Icy Wind", "Hex");
		String info = "Spiritomb was formed by 108 spirits. It is bound to a fissure in an Odd Keystone.";
		String battleCry = "OOOOOO!";
		return new Spiritomb(157, 157, "Healthy", "Spiritomb", "Ghost", "Dark", moves, battleCry, 158, 176, 158, 176, 95, info);
	}
	
	public static Staraptor createStaraptor() {
		List<String> moves = Arrays.asList("Brave Bird", "Facade", "Close Combat", "Endeavor");
		String info = "Staraptor never stops attacking even if it is injured. It fusses over the shape of its comb.";
		String battleCry = "Bird Up!";
		return new Staraptor(192, 192, "Healthy", "Staraptor", "Normal", "Flying", moves, battleCry, 189, 134, 112, 123, 167, info);
	}
	
	public static Abomasnow createAbomasnow() {
		List<String> moves = Arrays.asList("Energy Ball", "Blizzard", "Wood Hammer", "Ice Punch");
		String info = "Abomasnow lives a quiet life on mountains that are perpetually covered in snow. It hides itself by whipping up blizzards.";
		String battleCry = "Roar!";
		return new Abomasnow(167, 167, "Healthy", "Abomasnow", "Grass", "Ice", moves, battleCry, 117, 156, 216, 156, 145, info);
	}
	
	public static Chandelure createChandelure() {
		List<String> moves = Arrays.asList("Shadow Ball", "Overheat", "Psychic", "Flamethrower");
		String info = "Being consumed in Chandelure's flame burns up the spirit, leaving the body behind.";
		String battleCry = "Ssss!";
		return new Chandelure(192, 192, "Healthy", "Chandelure", "Ghost", "Fire", moves, battleCry, 112, 161, 189, 183, 145, info);
	}
	
	public static Metagross createMetagross() {
		List<String> moves = Arrays.asList("Psychic", "Flash Cannon", "Zen Headbutt", "Meteor Mash");
		String info = "Metagross folds its four legs when flying. Its four brains are said to be superior to a supercomputer.";
		String battleCry = "Roar!";
		return new Metagross(187, 187, "Healthy", "Metagross", "Steel", "Psychic", moves, battleCry, 205, 200, 161, 156, 134, info);
	}
}
