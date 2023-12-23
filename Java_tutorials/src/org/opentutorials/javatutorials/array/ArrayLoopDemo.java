package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = {"choi", "kim", "park"};
		for(int i = 0; i < members.length; i++) {
		//  초기화			반복조건(배열 값의 갯수	   반복실행
			String member = members[i]; // 문자열 변수 선언
			// member라는 변수안에 인덱스의 데이터가 순차적으로 들어간다.
			System.out.println(member + " is finish");
		}

	}

}
