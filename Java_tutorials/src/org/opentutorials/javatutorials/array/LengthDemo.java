package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		String[] classGroup = new String[4]; // 배열을 정의하는 또다른 방법 
		// 새로운 문자열을 만드는데 그 문자열의 원소는 4개이다.
		classGroup[0] = "choi"; // class그룹의 0번째 인덱스를 설정
		System.out.println(classGroup.length);
		// classGroup이라는 배열의 정의된 크기를 출력한다.
		classGroup[1] = "park";
		System.out.println(classGroup.length);
		classGroup[2] = "kim";
		System.out.println(classGroup.length);
		classGroup[3] = "lee";
		System.out.println(classGroup.length);

	}

}
