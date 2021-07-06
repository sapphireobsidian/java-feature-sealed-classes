package demo.rpg;


// Must be sealed or not sealed
public sealed interface IFlyingMount extends IMount 
	permits Dragon, IFlyingMount.Gryphon, IFlyingMount.Drake, IFlyingMount.Wyvern {

	void flutter();
	
	public final class Gryphon implements IFlyingMount {

		@Override
		public void flutter() {
			System.out.println("Gryphon fluttering.");
		}
		
	}
	
	public final class Drake implements IFlyingMount {

		@Override
		public void flutter() {
			System.out.println("Drake fluttering.");
			
		}
		
	}
	
	static final class Wyvern implements IFlyingMount {

		@Override
		public void flutter() {
			System.out.println("Wyvern fluttering.");
			
		}
		
	}
	
}
