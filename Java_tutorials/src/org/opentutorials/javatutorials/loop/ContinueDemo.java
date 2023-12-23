package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if ( i == 5)
				continue; // 순간 반복문이 끝나지만 다시 반복문을 진행
			System.out.println("Coding Everybody " + i);
		}

	}

}
