package javafundamentals.Collection;

public enum Vehicle {
	CAR("sport"),VAN("High Roof"),SUV("4x4"),BUS("Long Bus"); 
	
	private String type;
	private Vehicle(String type) {
		this.type = type;
	}
	public String getType() {
		
		return this.type;		
	}

}
