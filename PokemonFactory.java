import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonFactory {
	public static Swampert createSwampert() {
		List<String> moves1 = new ArrayList<>();
		List<String> attackTypes1 = new ArrayList<>();
		List<Integer> basePowers1 = new ArrayList<>();
		List<String> moveDescriptions1 = new ArrayList<>();
		
		moves1.add("Liquidation");
		attackTypes1.add("Water");
		basePowers1.add(85);
		moveDescriptions1.add("Water Type, Physical: Swampert used Liquidation!");
		Attack Liquidation = new Attack(moves1.get(0), 15, attackTypes1.get(0), basePowers1.get(0), "Physical");
		
		moves1.add("Ice Punch");
		attackTypes1.add("Ice");
		basePowers1.add(75);
		moveDescriptions1.add("Ice Type, Physical: Swampert used Ice Punch!");
		Attack IcePunch = new Attack(moves1.get(1), 15, attackTypes1.get(1), basePowers1.get(1), "Physical");
		
		moves1.add("Earthquake");
		attackTypes1.add("Ground");
		basePowers1.add(100);
		moveDescriptions1.add("Ground Type, Physical: Swampert used Earthquake!");
		Attack Earthquake = new Attack(moves1.get(2), 10, attackTypes1.get(2), basePowers1.get(2), "Physical");
		
		moves1.add("Rock Slide");
		attackTypes1.add("Rock");
		basePowers1.add(75);
		moveDescriptions1.add("Rock Type, Physical: Swampert used Rock Slide!");
		Attack RockSlide = new Attack(moves1.get(3), 15, attackTypes1.get(3), basePowers1.get(3), "Physical");
        
		List<Attack> moves = Arrays.asList(Liquidation, IcePunch, Earthquake, RockSlide);
        String battleCry = "Blastoooise!";
        String info = "Swampert is very strong. It has enough power to easily drag a boulder weighing more than a ton. This Pokémon also has powerful vision that lets it see even in murky water.";
        return new Swampert(207, 207, "Healthy", "Swampert", "Water", "Ground", moves, battleCry, 178, 156, 150, 172, 143, info);
	}
	
	public static Jolteon createJolteon() {
		List<String> moves2 = new ArrayList<>();
		List<String> attackTypes2 = new ArrayList<>();
		List<Integer> basePowers2 = new ArrayList<>();
		List<String> moveDescriptions2 = new ArrayList<>();
		
		//Creates attacks for this Pokemon to use.
		moves2.add("Thunderbolt");
		attackTypes2.add("Electric");
		basePowers2.add(90);
		moveDescriptions2.add("Electric Type, Special: Jolteon Thundebolt!");
		Attack Thunderbolt = new Attack(moves2.get(0), 15, attackTypes2.get(0), basePowers2.get(0), "Special");
		
		moves2.add("Hyper Voice");
		attackTypes2.add("Normal");
		basePowers2.add(90);
		moveDescriptions2.add("Normal Type, Special: Jolteon used Hyper Voice!");
		Attack HyperVoice = new Attack(moves2.get(1), 10, attackTypes2.get(1), basePowers2.get(1), "Special");
		
		moves2.add("Shadow Ball");
		attackTypes2.add("Ghost");
		basePowers2.add(80);
		moveDescriptions2.add("Ghost Type, Special: Jolteon used Shadow Ball!");
		Attack ShadowBall = new Attack(moves2.get(2), 15, attackTypes2.get(2), basePowers2.get(2), "Special");
		
		moves2.add("Double Kick");
		attackTypes2.add("Fighting");
		basePowers2.add(60);
		moveDescriptions2.add("Fighting Type, Physical: Jolteon used Double Kick!");
		Attack DoubleKick = new Attack(moves2.get(3), 30, attackTypes2.get(3), basePowers2.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(Thunderbolt, HyperVoice, ShadowBall, DoubleKick);
		String info = "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.";
		String battleCry = "Jolteeee!";
		return new Jolteon(172, 172, "Healthy", "Jolteon", "Electric", "Null", moves, battleCry, 128, 152, 178, 161, 200, info);
	}
	
	public static Garchomp createGarchomp() {
		List<String> moves3 = new ArrayList<>();
		List<String> attackTypes3 = new ArrayList<>();
		List<Integer> basePowers3 = new ArrayList<>();
		List<String> moveDescriptions3 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves3.add("Dragon Claw");
		attackTypes3.add("Dragon");
		basePowers3.add(80);
		moveDescriptions3.add("Dragon Type, Physical: Garchomp used Dragon Claw!");
		Attack DragonClaw = new Attack(moves3.get(0), 15, attackTypes3.get(0), basePowers3.get(0), "Physical");
				
		moves3.add("Fire Fang");
		attackTypes3.add("Fire");
		basePowers3.add(65);
		moveDescriptions3.add("Fire Type, Physical: Garchomp used Fire Fang!");
		Attack FireFang = new Attack(moves3.get(1), 15, attackTypes3.get(1), basePowers3.get(1), "Physical");
				
		moves3.add("Earthquake");
		attackTypes3.add("Ground");
		basePowers3.add(100);
		moveDescriptions3.add("Ground Type, Physical: Garchomp used Earthquake!");
		Attack Earthquake = new Attack(moves3.get(2), 10, attackTypes3.get(2), basePowers3.get(2), "Physical");
				
		moves3.add("Rock Slide");
		attackTypes3.add("Rock");
		basePowers3.add(75);
		moveDescriptions3.add("Rock Type, Physical: Garchomp used Rock Slide!");
		Attack RockSlide = new Attack(moves3.get(3), 15, attackTypes3.get(3), basePowers3.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(DragonClaw, FireFang, Earthquake, RockSlide);
		String info = "When Garchomp folds up its body and extends its wings, it looks like a jet plane. It flies at sonic speed.";
		String battleCry = "Roar!";
		return new Garchomp(215, 215, "Healthy", "Garchomp", "Dragon", "Ground", moves, battleCry, 200, 161, 145, 150, 169, info);
	}
	
	public static Roserade createRoserade() {
		List<String> moves4 = new ArrayList<>();
		List<String> attackTypes4 = new ArrayList<>();
		List<Integer> basePowers4 = new ArrayList<>();
		List<String> moveDescriptions4 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves4.add("Energy Ball");
		attackTypes4.add("Grass");
		basePowers4.add(80);
		moveDescriptions4.add("Grass Type, Special: Roserade used Energy Ball!");
		Attack EnergyBall = new Attack(moves4.get(0), 10, attackTypes4.get(0), basePowers4.get(0), "Special");
				
		moves4.add("Sludge Bomb");
		attackTypes4.add("Poison");
		basePowers4.add(90);
		moveDescriptions4.add("Poison Type, Special: Roserade used Sludge Bomb!");
		Attack SludgeBomb = new Attack(moves4.get(1), 10, attackTypes4.get(1), basePowers4.get(1), "Special");
				
		moves4.add("Dazzling Gleam");
		attackTypes4.add("Fairy");
		basePowers4.add(80);
		moveDescriptions4.add("Fairy Type, Special: Roserade used Dazzling Gleam!");
		Attack DazzlingGleam = new Attack(moves4.get(2), 10, attackTypes4.get(2), basePowers4.get(2), "Special");
				
		moves4.add("Extrasensory");
		attackTypes4.add("Psychic");
		basePowers4.add(80);
		moveDescriptions4.add("Psychic type, Special: Roserade used Extrasensory!");
		Attack Extrasensory = new Attack(moves4.get(3), 20, attackTypes4.get(3), basePowers4.get(3), "Special");
		
		List<Attack> moves = Arrays.asList(EnergyBall, SludgeBomb, DazzlingGleam, Extrasensory);
		String info = "With the movements of a dancer, Roserade strikes with whips that are densely lined with poison thorns.";
		String battleCry = "Rose!";
		return new Roserade(167, 167, "Healthy", "Roserade", "Grass", "Poison", moves, battleCry, 134, 128, 194, 172, 156, info);
	}
	
	public static Milotic createMilotic() {
		List<String> moves5 = new ArrayList<>();
		List<String> attackTypes5 = new ArrayList<>();
		List<Integer> basePowers5 = new ArrayList<>();
		List<String> moveDescriptions5 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves5.add("Surf");
		attackTypes5.add("Water");
		basePowers5.add(90);
		moveDescriptions5.add("Water Type, Special: Milotic used Surf!");
		Attack Surf = new Attack(moves5.get(0), 15, attackTypes5.get(0), basePowers5.get(0), "Special");
				
		moves5.add("Ice Beam");
		attackTypes5.add("Ice");
		basePowers5.add(90);
		moveDescriptions5.add("Ice Type, Special: Milotic used Ice Beam!");
		Attack IceBeam = new Attack(moves5.get(1), 15, attackTypes5.get(1), basePowers5.get(1), "Special");
				
		moves5.add("Dragon Pulse");
		attackTypes5.add("Dragon");
		basePowers5.add(85);
		moveDescriptions5.add("Dragon Type, Special: Milotic used Dragon Pulse!");
		Attack DragonPulse = new Attack(moves5.get(2), 10, attackTypes5.get(2), basePowers5.get(2), "Special");
				
		moves5.add("Recover");
		attackTypes5.add("Normal");
		basePowers5.add(0);
		moveDescriptions5.add("Normal Type, Status: Milotic used Recover!");
		Attack Recover = new Attack(moves5.get(3), 20, attackTypes5.get(3), basePowers5.get(3), "Special");
		
		List<Attack> moves = Arrays.asList(Surf, IceBeam, DragonPulse, Recover);
		String info = "It is the world's most beautiful Pokémon. There are many works of art featuring Milotic.";
		String battleCry = "Roar!";
		return new Milotic(202, 202, "Healthy", "Milotic", "Water", "Null", moves, battleCry, 123, 144, 167, 194, 146, info);
	}
	
	public static Lucario createLucario() {
		List<String> moves6 = new ArrayList<>();
		List<String> attackTypes6 = new ArrayList<>();
		List<Integer> basePowers6 = new ArrayList<>();
		List<String> moveDescriptions6 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
	    moves6.add("Aura Sphere");
	    attackTypes6.add("Fighting");
	    basePowers6.add(80);
	    moveDescriptions6.add("Fighting Type, Special: Lucario used Aura Sphere!");
	    Attack AuraSphere = new Attack(moves6.get(0), 20, attackTypes6.get(0), basePowers6.get(0), "Special");
				
	    moves6.add("Flash Cannon");
	    attackTypes6.add("Steel");
	    basePowers6.add(80);
	    moveDescriptions6.add("Steel Type, Special: Lucario used Flash Cannon!");
	    Attack FlashCannon = new Attack(moves6.get(1), 10, attackTypes6.get(1), basePowers6.get(1), "Special");
				
	    moves6.add("Close Combat");
	    attackTypes6.add("Fighting");
	    basePowers6.add(120);
	    moveDescriptions6.add("Fighting Type, Physical: Lucario used Close Combat!");
	    Attack CloseCombat = new Attack(moves6.get(2), 5, attackTypes6.get(2), basePowers6.get(2), "Physical");
				
	    moves6.add("Crunch");
	    attackTypes6.add("Dark");
	    basePowers6.add(80);
	    moveDescriptions6.add("Dark Type, Physical: Lucario used Crunch!");
	    Attack Crunch = new Attack(moves6.get(3), 15, attackTypes6.get(3), basePowers6.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(AuraSphere, FlashCannon, CloseCombat, Crunch);
		String info = "A well-trained Lucario can sense auras to identify and take in the feelings of creatures over half a mile away.";
		String battleCry = "Roar!";
		return new Lucario(177, 177, "Healthy", "Lucario", "Fighting", "Steel", moves, battleCry, 178, 134, 183, 134, 156, info);
	}
	
	public static Togekiss createTogekiss() {
		List<String> moves7 = new ArrayList<>();
		List<String> attackTypes7 = new ArrayList<>();
		List<Integer> basePowers7 = new ArrayList<>();
		List<String> moveDescriptions7 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves7.add("Air Slash");
		attackTypes7.add("Flying");
		basePowers7.add(75);
		moveDescriptions7.add("Flying Type, Special: Togekiss used Air Slash!");
		Attack AirSlash = new Attack(moves7.get(0), 15, attackTypes7.get(0), basePowers7.get(0), "Special");
				
		moves7.add("Tri Attack");
		attackTypes7.add("Normal");
		basePowers7.add(80);
		moveDescriptions7.add("Normal Type, Special: Togekiss used Tri-Attack!");
		Attack TriAttack = new Attack(moves7.get(1), 10, attackTypes7.get(1), basePowers7.get(1), "Special");
				
		moves7.add("Dazzling Gleam");
		attackTypes7.add("Fairy");
		basePowers7.add(80);
		moveDescriptions7.add("Fairy Type, Special: Togekiss used Dazzling Gleam!");
		Attack DazzlingGleam = new Attack(moves7.get(2), 10, attackTypes7.get(2), basePowers7.get(2), "Special");
				
		moves7.add("Flamethrower");
		attackTypes7.add("Fire");
		basePowers7.add(90);
		moveDescriptions7.add("Fire type, Special: Togekiss used Flamethrower!");
		Attack Flamethrower = new Attack(moves7.get(3), 15, attackTypes7.get(3), basePowers7.get(3), "Special");
		
		List<Attack> moves = Arrays.asList(AirSlash, TriAttack, DazzlingGleam, Flamethrower);
		String info = "Togekiss shares many blessings with people who respect one another's rights and avoid needless strife.";
		String battleCry = "Kisss!";
		return new Togekiss(192, 192, "Healthy", "Togekiss", "Fairy", "Flying", moves, battleCry, 112, 161, 189, 183, 145, info);
	}
	
	public static Spiritomb createSpiritomb() {
		List<String> moves8 = new ArrayList<>();
		List<String> attackTypes8 = new ArrayList<>();
		List<Integer> basePowers8 = new ArrayList<>();
		List<String> moveDescriptions8 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves8.add("Shadow Ball");
		attackTypes8.add("Ghost");
		basePowers8.add(80);
		moveDescriptions8.add("Ghost Type, Special: Spiritomb used Shadow Ball!");
		Attack ShadowBall = new Attack(moves8.get(0), 15, attackTypes8.get(0), basePowers8.get(0), "Special");
				
		moves8.add("Dark Pulse");
		attackTypes8.add("Dark");
		basePowers8.add(80);
		moveDescriptions8.add("Dark Type, Special: Spiritomb used Dark Pulse!");
		Attack DarkPulse = new Attack(moves8.get(1), 15, attackTypes8.get(1), basePowers8.get(1), "Special");
				
		moves8.add("Will-O-Wisp");
		attackTypes8.add("Fire");
		basePowers8.add(0);
		moveDescriptions8.add("Fire Type, Status: Spiritomb used Will-O-Wisp!");
		Attack WillOWisp = new Attack(moves8.get(2), 15, attackTypes8.get(2), basePowers8.get(2), "Special");
				
		moves8.add("Hex");
		attackTypes8.add("Ghost");
		basePowers8.add(65);
		moveDescriptions8.add("Ghost type, Special: Spiritomb used Hex!");
		Attack Hex = new Attack(moves8.get(3), 10, attackTypes8.get(3), basePowers8.get(3), "Special");
		
		List<Attack> moves = Arrays.asList(ShadowBall, DarkPulse, WillOWisp, Hex);
		String info = "Spiritomb was formed by 108 spirits. It is bound to a fissure in an Odd Keystone.";
		String battleCry = "OOOOOO!";
		return new Spiritomb(157, 157, "Healthy", "Spiritomb", "Ghost", "Dark", moves, battleCry, 158, 176, 158, 176, 95, info);
	}
	
	public static Staraptor createStaraptor() {
		List<String> moves9 = new ArrayList<>();
		List<String> attackTypes9 = new ArrayList<>();
		List<Integer> basePowers9 = new ArrayList<>();
		List<String> moveDescriptions9 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves9.add("Brave Bird");
		attackTypes9.add("Flying");
		basePowers9.add(120);
		moveDescriptions9.add("Flying Type, Physical: Staraptor used Brave Bird!");
		Attack BraveBird = new Attack(moves9.get(0), 15, attackTypes9.get(0), basePowers9.get(0), "Physical");
		
		//Double damage here?
		moves9.add("Facade");
		attackTypes9.add("Normal");
		basePowers9.add(70);
		moveDescriptions9.add("Normal Type, Physical: Staraptor used Facade!");
		Attack Facade = new Attack(moves9.get(1), 20, attackTypes9.get(1), basePowers9.get(1), "Physical");
				
		moves9.add("Close Combat");
		attackTypes9.add("Fighting");
		basePowers9.add(120);
		moveDescriptions9.add("Fighting Type, Physical: Staraptor used Close Combat!");
		Attack CloseCombat = new Attack(moves9.get(2), 5, attackTypes9.get(2), basePowers9.get(2), "Physical");
				
		moves9.add("Endeavor");
		attackTypes9.add("Normal");
		basePowers9.add(0);
		moveDescriptions9.add("Normal Type, Physical: Staraptor used Endeavor!");
		Attack Endeavor = new Attack(moves9.get(3), 15, attackTypes9.get(3), basePowers9.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(BraveBird, Facade, CloseCombat, Endeavor);
		String info = "Staraptor never stops attacking even if it is injured. It fusses over the shape of its comb.";
		String battleCry = "Bird Up!";
		return new Staraptor(192, 192, "Healthy", "Staraptor", "Normal", "Flying", moves, battleCry, 189, 134, 112, 123, 167, info);
	}
	
	public static Abomasnow createAbomasnow() {
		List<String> moves10 = new ArrayList<>();
		List<String> attackTypes10 = new ArrayList<>();
		List<Integer> basePowers10 = new ArrayList<>();
		List<String> moveDescriptions10 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves10.add("Energy Ball");
		attackTypes10.add("Grass");
		basePowers10.add(80);
		moveDescriptions10.add("Grass Type, Special: Abomasnow used Energy Ball!");
		Attack EnergyBall = new Attack(moves10.get(0), 10, attackTypes10.get(0), basePowers10.get(0), "Special");
				
		moves10.add("Blizzard");
		attackTypes10.add("Ice");
		basePowers10.add(110);
		moveDescriptions10.add("Ice Type, Special: Abomasnow used Blizzard!");
		Attack Blizzard = new Attack(moves10.get(1), 5, attackTypes10.get(1), basePowers10.get(1), "Special");
				
		moves10.add("Wood Hammer");
		attackTypes10.add("Grass");
		basePowers10.add(120);
		moveDescriptions10.add("Grass Type, Physical: Abomasnow used Wood Hammer!");
		Attack WoodHammer = new Attack(moves10.get(2), 15, attackTypes10.get(2), basePowers10.get(2), "Physical");
				
		moves10.add("Ice Punch");
		attackTypes10.add("Ice");
		basePowers10.add(75);
		moveDescriptions10.add("Dark Type, Physical: Abomasnow used Ice Punch!");
		Attack IcePunch = new Attack(moves10.get(3), 15, attackTypes10.get(3), basePowers10.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(EnergyBall, Blizzard, WoodHammer, IcePunch);
		String info = "Abomasnow lives a quiet life on mountains that are perpetually covered in snow. It hides itself by whipping up blizzards.";
		String battleCry = "Roar!";
		return new Abomasnow(167, 167, "Healthy", "Abomasnow", "Grass", "Ice", moves, battleCry, 117, 156, 216, 156, 145, info);
	}
	
	public static Chandelure createChandelure() {
		List<String> moves11 = new ArrayList<>();
		List<String> attackTypes11 = new ArrayList<>();
		List<Integer> basePowers11 = new ArrayList<>();
		List<String> moveDescriptions11 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves11.add("Shadow Ball");
		attackTypes11.add("Ghost");
		basePowers11.add(80);
		moveDescriptions11.add("Ghost Type, Special: Chandelure used Shadow Ball!");
		Attack ShadowBall = new Attack(moves11.get(0), 15, attackTypes11.get(0), basePowers11.get(0), "Special");
				
		moves11.add("Overheat");
		attackTypes11.add("Fire");
		basePowers11.add(130);
		moveDescriptions11.add("Fire Type, Special: Chandelure used Overheat!");
		Attack Overheat = new Attack(moves11.get(1), 5, attackTypes11.get(1), basePowers11.get(1), "Special");
				
		moves11.add("Psychic");
		attackTypes11.add("Psychic");
		basePowers11.add(90);
		moveDescriptions11.add("Psychic Type, Special: Chandelure used Psychic!");
		Attack Psychic = new Attack(moves11.get(2), 10, attackTypes11.get(2), basePowers11.get(2), "Special");
				
		moves11.add("Flamethrower");
		attackTypes11.add("Fire");
		basePowers11.add(90);
		moveDescriptions11.add("Fire type, Special: Chandelure used Flamethrower!");
		Attack Flamethrower = new Attack(moves11.get(3), 15, attackTypes11.get(3), basePowers11.get(3), "Special");
		
		List<Attack> moves = Arrays.asList(ShadowBall, Overheat, Psychic, Flamethrower);
		String info = "Being consumed in Chandelure's flame burns up the spirit, leaving the body behind.";
		String battleCry = "Ssss!";
		return new Chandelure(192, 192, "Healthy", "Chandelure", "Ghost", "Fire", moves, battleCry, 112, 161, 189, 183, 145, info);
	}
	
	public static Metagross createMetagross() {
		List<String> moves12 = new ArrayList<>();
		List<String> attackTypes12 = new ArrayList<>();
		List<Integer> basePowers12 = new ArrayList<>();
		List<String> moveDescriptions12 = new ArrayList<>();
	
		//Creates attacks for this Pokemon to use.
		moves12.add("Psychic");
		attackTypes12.add("Psychic");
		basePowers12.add(90);
		moveDescriptions12.add("Psychic Type, Special: Metagross used Psychic!");
		Attack Psychic = new Attack(moves12.get(0), 10, attackTypes12.get(0), basePowers12.get(0), "Special");
				
		moves12.add("Flash Cannon");
		attackTypes12.add("Steel");
		basePowers12.add(80);
		moveDescriptions12.add("Steel Type, Special: Metagross used Flash Cannon!");
		Attack FlashCannon = new Attack(moves12.get(1), 10, attackTypes12.get(1), basePowers12.get(1), "Special");
				
		moves12.add("Zen Headbutt");
		attackTypes12.add("Psychic");
		basePowers12.add(80);
		moveDescriptions12.add("Psychic Type, Physical: Metagross used Zen Headbutt!");
		Attack ZenHeadbutt = new Attack(moves12.get(2), 15, attackTypes12.get(2), basePowers12.get(2), "Physical");
				
		moves12.add("Meteor Mash");
		attackTypes12.add("Steel");
		basePowers12.add(90);
		moveDescriptions12.add("Steel Type, Physical: Metagross used Meteor Mash!");
		Attack MeteorMash = new Attack(moves12.get(3), 10, attackTypes12.get(3), basePowers12.get(3), "Physical");
		
		List<Attack> moves = Arrays.asList(Psychic, FlashCannon, ZenHeadbutt, MeteorMash);
		String info = "Metagross folds its four legs when flying. Its four brains are said to be superior to a supercomputer.";
		String battleCry = "Roar!";
		return new Metagross(187, 187, "Healthy", "Metagross", "Steel", "Psychic", moves, battleCry, 205, 200, 161, 156, 134, info);
	}
}
