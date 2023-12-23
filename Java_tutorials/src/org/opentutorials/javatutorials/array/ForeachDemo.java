package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"choi", "kim", "park"};
		for(String e : members) { // 콜론 뒤에 오는 데이터의 값을 e라는 변수에 담는다.
			System.out.println(e + " is done");
			// 반복문과 배열의 결합
		}

	}

}
