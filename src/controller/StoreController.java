package controller;

import java.util.Scanner;
import model.CustomerModel;
import model.ProductModel;
import view.EndVIew;
import view.StartView;

public class StoreController {
	static String name;
	static int req;
	static Scanner sc = new Scanner(System.in);
	static EndVIew endView = EndVIew.getInstance();
	
	
	public static void request(String name) {
		CustomerModel.entrance(name);
	}
	
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			System.out.println("=========================");
			endView.productAll(ProductModel.getProduct());
			System.out.println("=========================");
			System.out.println();
		}else if(reqNumber == 2) {
			System.out.printf("상품 입력 : ");
			name=sc.nextLine();
			System.out.println();
			endView.search(name);	
			System.out.println();
		
		}else if(reqNumber == 3) {
			System.out.printf("상품 이름 : ");
			name=sc.nextLine();
			System.out.printf("상품 가격 : ");
			req=sc.nextInt();
			System.out.println();
			boolean r = ProductModel.insert(name, req);
				if(r) {
					endView.printSuccess("추가 성공");
				}else {
					endView.printFail("추가 실패");
				}
		
		}else if(reqNumber == 4) {
			System.out.printf("상품 이름 : ");
			name=sc.nextLine();
			ProductModel.delete(name);
			endView.deleteSuccess(name);
		
		}else if(reqNumber == 5) {
			System.out.println();
			endView.customerAll(CustomerModel.getCustomer());
		
		}else if(reqNumber == 6) {//가입
			System.out.printf("아이디 : ");
			name=sc.nextLine();
			boolean r = CustomerModel.insert(name);
				if(r) {
					System.out.println();
					endView.printSuccess("가입 성공");
					System.out.println("이름  방문횟수 : " + CustomerModel.search(name));
				}else {
					endView.printFail("가입 실패");
				}
		}
		
		else if(reqNumber == 0) {
			StartView.req = 0;
		}
	}
	
	
//	public static void main(String[] args) {
//		System.out.println(CustomerModel.entrance("송평현"));
//	}

}