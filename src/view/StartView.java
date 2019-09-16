package view;

import java.util.Scanner;
import controller.StoreController;
import model.CustomerModel;


public class StartView {
	static String name;
	public static int req;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1. 로그인");
		System.out.println("2. 가입");
		System.out.printf("입력 : ");
		req=sc.nextInt();
			if(req == 1) {
				System.out.print("로그인 : ");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println();
				for(req = 1 ; req ==1;) {
					if(name.equals("admin")) {
						System.out.println("0.나가기");
						System.out.println("1.상품 전체 list");
						System.out.println("2.상품 검색");
						System.out.println("3.상품 추가");
						System.out.println("4.상품 제거");
						System.out.println("5.고객 list");
						System.out.printf("입력 : ");
						req=sc.nextInt();
						StoreController.request(req);
						System.out.println();
						System.out.println("나가시겠습니까?");
						System.out.println("YES : 0");
						System.out.println("No : 1");
						System.out.printf("입력 : ");
						req=sc.nextInt();
						System.out.println();
					}
					else if(name.equals(CustomerModel.search(name).getName())) {
						System.out.println("0.나가기");
						System.out.println("1.상품 전체 list");
						System.out.println("2.상품 검색");
						System.out.printf("입력 : ");
						req=sc.nextInt();
						if(req == 0 || req == 1 || req == 2) {
							StoreController.request(req);
							System.out.println("나가시겠습니까?");
							System.out.println("YES : 0");
							System.out.println("No : 1");
							System.out.printf("입력 : ");
							req=sc.nextInt();
						}else {
							System.out.println("권한이 없습니다.");
							System.out.println("나가시겠습니까?");
							System.out.println("YES : 0");
							System.out.println("No : 1");
							System.out.printf("입력 : ");
							req=sc.nextInt();
						}
					}
				}
			}
			else if(req ==2) {
				StoreController.request(6);
			}
	}
}

		





