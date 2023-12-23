package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() { // 메소드의 정의
		int i = 0;
		while (i < 10) {
			System.out.println(i); // 0부터 9까지 출력
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(); // numbering이라는 이름의 메소드 호출
		numbering(); // 메소드를 호출시킨만큼 호출되어 출력된다.
	}

}
