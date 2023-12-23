package org.opentutorials.javatutorials.scope;

public class ScopeDemo {

	static void a() {
		int i = 0; // 지역변수
		// i라는 변수가 a라는 메소드 안에서 선언되고 있기에
		// i라는 변수는 a() 밖에서는 영향을 미칠 수 없다.
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}

	}

} // 메소드a에서의 변수 i는 메소드a 안에서만 유효하다
