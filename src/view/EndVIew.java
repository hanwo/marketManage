package view;

import model.ProductModel;
import model.domain.Customer;
import model.domain.Product;

public class EndVIew {
	private static EndVIew instance = new EndVIew();
	private EndVIew() {}
	public static EndVIew getInstance() {
		return instance;
	}
	
	public void productAll(Product [] all) {
		for(Product v : all) {
			if(v != null) {
			System.out.println(v.toString());
			}
		}
	}
	
	public void customerAll(Customer [] all) {
		for(Customer v : all) {
			if(v != null) {
			System.out.println(v.toString());
			}
		}
	}
	
	public void search(String pname) {
		Product p = ProductModel.searchProduct(pname);
		if (p != null) {
			System.out.println(p);
		}else {
			System.out.println("검색결과가 없습니다.");
		}
	}
	
	public void printSuccess(String msg) {
		System.out.println(msg);
		
	}

	public void printFail(String msg) {
		System.out.println(msg);
		
	}
	
	public void deleteSuccess(String name) {
		System.out.println(name + " 삭제 성공");
		
	}
	

}