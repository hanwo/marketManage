package model;

public class Single {
	private static Single instance = new Single();
	private Single() {}
	public static Single getInstance() {
		return instance;
	}
	
	public void loginSuccess() {
		System.out.println("login success.");
	}
	
	public void loginFail() {
		System.out.println("login Fail");
	}
	
	public void warn() {
		System.out.println("권한이 없습니다.");
	}
		

}
