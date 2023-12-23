package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		if(true && true) { // 참인 값, 즉 true
			System.out.println(1);
		}
		
		if (true && false) { // false, 출력되지 않는다
			System.out.println(2);
		}
		
		if(false && true) {
			System.out.println(3);
		}
		
		if(false && false) {
			System.out.println(4);
		}

	}

}
