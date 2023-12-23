package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(1) { //해당 숫자의 케이스 뒤의 모든 조건이 실행
		case 1: //조건1
			System.out.println("one");
		case 2: //조건2
			System.out.println("two");
		case 3: //조건3
			System.out.println("three");
		}
		
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
			break; // 여기서 case문 종료, 이후 switch문 뒤로 이동
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default"); //어디에도 해당되지 않는 케이스
		}
		
		int val = 1;
		if(val == 1) {
			System.out.println("one");
		} else if(val == 2) {
			System.out.println("two");
		} else if(val == 3) {
			System.out.println("three");
		}
	}

}
