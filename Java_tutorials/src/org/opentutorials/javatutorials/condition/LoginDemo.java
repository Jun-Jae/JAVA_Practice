package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0]; // 입력값 자리
		if(id.equals("egoing")) { // 비교연산자에서 equals는 일치, 불일치를 판별
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}