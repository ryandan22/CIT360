package main.model;

public enum Classification {
	
	NEWHIRE("New Hire"),
	ONEYEAR("One Year"),
	FIVEYEAR("Five Year"),
	TENYEARPLUS("Ten Year Plus");
	
	private String name;
	
	private Classification(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}