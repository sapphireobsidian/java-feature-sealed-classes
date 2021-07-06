package demo;

import java.lang.constant.ClassDesc;
import java.util.Arrays;
import java.util.stream.Collectors;

import demo.calculators.IIntegerOperation;
import demo.calculators.IIntegerOperation.IntegerOperation;
import demo.cars.ICar;
import demo.cars.ICar.Sedan;
import demo.model.Button;
import demo.model.Image;
import demo.model.Widget;
import demo.model.label.ColoredLabel;
import demo.rpg.Adventurer;
import demo.rpg.Dragon;
import demo.rpg.IFlyingMount;
import demo.rpg.IFlyingMount.Gryphon;
import demo.rpg.IMount;
import demo.rpg.Item;
import demo.rpg.Item.Dagger;
import demo.rpg.Medal;
import demo.rpg.gem.GemFactory;
import demo.rpg.gem.IGem;

public class TryFeatureSealedClass {

	public static void main(String[] args) {
		
		tryBasicDeclaration();
		
		tryShortDeclaration();
		
		tryShortDeclarationStatic();
		
		tryShortDeclarationAuxilliary();
		
		tryNonSealed();
		
		trySealedInterface();
		
		trySealedInterface2();
		
		trySealedSubType();
		
		tryReducedSubTypeVisibility();
		
		trySubTypeRecord();
		
		trySubTypeEnum();

	}
	
	private static void tryBasicDeclaration() {
		Widget widget = new Button();
		System.out.println(widget);
		System.out.println("Button.CanonicalName(): " + widget.getClass().getCanonicalName());
		System.out.println("Button.IsSealed(): " + widget.getClass().isSealed());
		System.out.println("Button.PermittedSubclasses(): " + Arrays.asList(widget.getClass().permittedSubclasses())
			.stream().map(ClassDesc::displayName).collect(Collectors.toList()));
		System.out.println("Widget.CanonicalName(): " + Widget.class.getCanonicalName());
		System.out.println("Widget.IsSealed(): " +  Widget.class.isSealed());
		System.out.println("Widget.PermittedSubclasses(): " +  Arrays.asList(Widget.class.permittedSubclasses())
			.stream().map(ClassDesc::displayName).collect(Collectors.toList()));		
	}
	
	private static void tryShortDeclaration() {
		Adventurer adventurer = new Adventurer().new Warrior();
		System.out.println(adventurer);
	}

	private static void tryShortDeclarationStatic() {
		Item item = new Dagger();
		System.out.println(item);
	}
	
	private static void tryShortDeclarationAuxilliary() {
		Medal medal = Medal.instance("arena");
		System.out.println(medal);
	}
	
	private static void tryNonSealed() {
		Widget widget = new ColoredLabel();
		System.out.println(widget);
	}
	
	private static void trySealedInterface() {
		IMount mount = new Gryphon();
		System.out.println(mount);
		((IFlyingMount) mount).flutter();
	}
	
	private static void trySealedInterface2() {
		IMount mount = new Dragon();
		System.out.println(mount);
		((IFlyingMount) mount).flutter();
		IFlyingMount fmount = new Gryphon();
		fmount.flutter();
	}
	
	private static void trySealedSubType() {
		Widget widget = new Image.LineBorderedImage();
		System.out.println(widget);
	}
	
	private static void tryReducedSubTypeVisibility() {
		IGem gem = GemFactory.create("ruby");
		System.out.println(gem.color());
		gem = GemFactory.create("black-diamond");
		System.out.println(gem.color());
	}
	
	private static void trySubTypeRecord() {
		ICar car = new Sedan("NYI-19378-019");
		System.out.println(car);
	}
	
	private static void trySubTypeEnum() {
		IIntegerOperation op = IntegerOperation.Addition;
		System.out.println(op.evaluate(5, 3));
	}
}
