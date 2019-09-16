package model;

import model.domain.Customer;

public class CustomerModel {
	private static Customer[] list = new Customer[5];
	private static int index;
	
	//test 데이터 저장
	static {
		list[0] = new Customer("admin",0);
		list[1] = new Customer("송평현", 88);
		index = 2;
	}
	
	public static boolean insert(String c) {
		if(index<5) {
			list[index++] = new Customer(c, 0);;
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Customer use(String name) {
		Customer c = null;
		for(int i = 0 ; i < list.length ; i++) {
			c = list[i];
			if(c.getName().equals(name)) {
				c.setUseNumber(c.getUseNumber() + 1);
				return c;
			}
		}
		return c;
	}
	
	public static Customer search(String name) {
		Customer c = null;
		for(int i = 0 ; i < list.length ; i++) {
			c = list[i];
			if(c != null && c.getName().equals(name)) {
				//c = c.getName();
				return c;
			}
		}
		return c;
	}
	
	
	
	public static boolean entrance(String name) {
		Customer c = null;
		for(int i = 0 ; i < list.length ; i++) {
			c = list[i];
			if(c != null && c.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static Customer [] getCustomer() {
		return list;
	}
}
