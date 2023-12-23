package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) { //입력값을 계속 받는다.
			 //hasNext 메소드를 불러오면 중지되었던 자바를 계속 실행
			 //hasNext는 숫자가 오면 True를 다른것은 False로 인식
			System.out.println(sc.nextInt()*1000);
		} //숫자가 아닌 다른 문자가 오면 실행이 종료된다.
		sc.close();
	}
}
