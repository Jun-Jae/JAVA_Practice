package org.opentutorials.javatutorials.io;

import java.util.Scanner; // Scanner를 구동시키기 위해 가져오기
// Scanner는 실행중 데이터를 입력할 때 사용하는 방법이다
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//괄호 안(System.in) 먼저 실행, 사용자가 입력한 값을 의미
		//Scanner는 사용자가 입력한 값을 알아내는 것
		//이후 sc라는 변수에 입력 값을 담는다.
		int i = sc.nextInt(); 
		//nextInt가 실행되면 입력값을 받기위해 기다린다.
		System.out.println(i*1000);//입력값을 계산하여 출력
		sc.close();
	}

}
