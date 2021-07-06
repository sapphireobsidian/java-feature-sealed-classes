package demo.rpg.gem;

public record Quartz(String color) implements IGem {

	@Override
	public String color() {
		return "quartz-" + color;
	}

}
