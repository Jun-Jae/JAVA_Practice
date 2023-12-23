package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); // 4출력
		++i;
		System.out.println(i);
		System.out.println(++i); // 6출력 
		System.out.println(i++); // 6출력, 출력 이후에 +1 실행
		System.out.println(i); // 7출력
	}

}
