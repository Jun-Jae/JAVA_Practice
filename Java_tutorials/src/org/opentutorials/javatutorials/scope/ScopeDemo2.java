package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i; // 전역변수 선언
	
	static void a() {
		i = 0;
		// i 앞에 int를 붙여주면 원하던대로 값이 출력된다.
	}
	
	
	public static void main(String[] args) {
		for(i = 0; i < 5; i++) {
			// 전역변수로 선언된 i에 0을 할당
			a();
			System.out.println(i);
			// 계속해서 0을 출력하게 된다.
		} // for문 안 i앞에 int를 붙이게 되면 i의 유효번위는 
		  // for문 안에서만 유효하게 된다.

	}

} // 유효범위를 이해하기 위해서는 변수선언이 중요하다.
