package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() { // 메소드b의 유효범위는 정적인 유효범위(static)이다.
		System.out.println(i);
		// 전역변수의 i를 인식하여 출력.
		// 메소드 b에 지역변수가 존재하지 않으면 전역변수 i를 사용
	}
	
	public static void main(String[] args) {
		int i = 1;
		a(); // 결과는 5를 출력한다.
	}
}
