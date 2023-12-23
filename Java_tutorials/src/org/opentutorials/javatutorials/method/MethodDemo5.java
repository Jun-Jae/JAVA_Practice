package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
	
	public static void numbering(int init, int limit) {
		int i = init; 
		while (i < limit) {
			System.out.println(i); // 3과 4를 출력한다.
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(3, 5); // 3,5가 입력값
	} // 여러개의 인자를 매개변수로 설정하는 방법

}
