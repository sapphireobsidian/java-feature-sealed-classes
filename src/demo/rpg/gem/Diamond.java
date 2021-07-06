package demo.rpg.gem;

enum Diamond implements IGem {
	RedDiamond("red"), BlackDiamond("black");

	private String color;

	private Diamond(String color) {
		this.color = color;
	}

	@Override
	public String color() {
		return this.color;
	}

}
