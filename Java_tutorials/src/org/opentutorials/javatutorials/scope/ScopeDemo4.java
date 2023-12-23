package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding everybody";
		// 
	}
	
	public static void main(String[] args) {
		a();
		// System.out.println(title); 오류
		// title이라는 변수의 선언이 인식되지 않는다.
	}

}
