package demo.rpg;

// Sealed class or interface lacks the permits clause and no class or interface from the same compilation unit declares Adventurer as its direct superclass or superinterface
//public sealed class Adventurer {
//	public static final class Warrior extends Adventurer {}
//	public static final class Priest extends Adventurer {}
//}

public sealed class Adventurer {
	public final class Warrior extends Adventurer {}
	public final class Priest extends Adventurer {}
}