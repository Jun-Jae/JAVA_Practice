package org.opentutorials.javatutorials.condition;

public class Condition4Demo {

	public static void main(String[] args) {
		if(false) {
			System.out.println(1);
		} else if (true) {
			System.out.println(2); // 이 문장만 출력된다
		} else if (true) {
			System.out.println(3);
		}else
			System.out.println(4);
	}
}
