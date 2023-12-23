package org.opentutorials.javatutorials.loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다.
		while (i < 10) {
			System.out.println("coding Everybody" + i);
			// i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문을 검사하게 된다.
			i++; // i=i+1
		} // i는 1증가, // i가 10이 되었을 때 반복문에서 탈출

	}

}
