package demo.cars;

public interface ICar {

	record Sedan(String plateNumber) implements ICar {
		
	}
	
	record Van(String plateNumber) implements ICar {
		
	}

}
