package demo.rpg;

public abstract sealed class Item {

	public abstract void socket(Gem gem);
	
	public static final class Dagger extends Item {
		public void socket(Gem gem) { System.out.println("Place Gem on Dagger."); }
	}
	
	public static final class Wand extends Item {
		public void socket(Gem gem) { System.out.println("Place Gem on Wand."); }
	}
}
