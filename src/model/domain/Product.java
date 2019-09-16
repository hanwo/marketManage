package model.domain;

public class Product {
	private String pname;
	private int price;
	public Product() {}
	public Product(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		return pname + " " + price;
	}
	
}
