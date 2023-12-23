package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if( i == 5)
				break; // 순간 반복문은 아예 끝나고 반복문을 나가게 된다.
			System.out.println("Coding Everybody " + i);
		}

	}

}
