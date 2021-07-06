package demo.model;

//public abstract sealed class Widget permits Button, Label {

// Permitted type Spinner in an unnamed module should be declared in the same package demo.model of declaring type Widget
//public sealed class Widget permits Button, Label, Spinner {

//Sealed class or interface lacks the permits clause and no class or interface from the same compilation unit declares Widget as its direct superclass or superinterface
//public sealed class Widget {


public sealed class Widget permits Button, Label, Image {
	
}
