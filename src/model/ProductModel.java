package model;

import model.domain.Product;

public class ProductModel {
	private static Product[] productlist = new Product[5];
	private static int index;

	static {
		productlist[0] = new Product("허쉬" , 1700);
		productlist[1] = new Product("페레레로쉐" , 2500);
		productlist[2] = new Product("가나" , 1200);
		index = 3;
	}
	
	public static Product [] getProduct() {
		return productlist;
	}
	
	public static boolean insert(String name, int req) {
		if(index<5) {
			productlist[index++] = new Product(name, req);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Product searchProduct(String pname) {
		Product p = null;
		for(int i = 0 ; i < productlist.length ; i++) {
			p = productlist[i];
			if(p != null && p.getPname().equals(pname)){
				return p;
			}
		}
		return p;
	}
	
	public static boolean delete(String pname) {
		Product p = null;
		for(int i = 0; i < productlist.length; i++) {
			p = productlist[i];
			if(p.getPname() != null && p.getPname().equals(pname)){
				productlist[i] = null;
				return true;
			}
		}
		
		return false;
	}

}