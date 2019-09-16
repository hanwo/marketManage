package model.domain;

public class Customer {
	private String name;
	private int useNumber;
	
	public Customer() {}
	public Customer(String name, int useNumber) {
		this.name = name;
		this.useNumber = useNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUseNumber() {
		return useNumber;
	}
	public void setUseNumber(int useNumber) {
		this.useNumber = useNumber;
	}
	
	public String toString(){
		return name + " " + useNumber;
	}

}
