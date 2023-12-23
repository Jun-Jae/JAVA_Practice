package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println(i); 오류발생
		// for문에서 선언된 i는 for문 밖에서 인식하지 못한다.

	}

}
