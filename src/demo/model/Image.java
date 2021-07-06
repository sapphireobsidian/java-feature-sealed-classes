package demo.model;

// Demo Sealed Sub Type
public sealed class Image extends Widget {

	public static final class LineBorderedImage extends Image {	}
	
	public static final class EtchedBorderedImage extends Image {	}
	
}
