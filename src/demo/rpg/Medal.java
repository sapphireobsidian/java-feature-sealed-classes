package demo.rpg;

// Demo Auxiliary Classes for Sealed Class
public sealed class Medal {
	public static Medal instance(String type) {
		return switch (type) {
			case "dungeon" -> new DungeonMedal();
			case "arena" -> new ArenaMedal();
			default -> throw new IllegalArgumentException();
		};
	}
}

final class DungeonMedal extends Medal {
}

final class ArenaMedal extends Medal {
}