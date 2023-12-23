package org.opentutorials.javatutorials.method;

public class ReturnDemo {
	public static int one() {
		return 1; // return은 메소드를 중단시키는 역할도 한다.
		return 2; // 따라서 자동 컴파일 거부
		return 3;
	}
	
	public static void main(String[] args) {
		System.out.println(one()); // 1로 치환되어 출력한다.

	}

}
