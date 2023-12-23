package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

	public static String[] getMembers() { // 문자열 배열
		String[] members = {"choi", "park", "lee"}; // 변수배열 정의
		return members; //반환하는 값이 배열
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		
	}
}
