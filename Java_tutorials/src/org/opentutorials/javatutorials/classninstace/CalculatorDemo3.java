package org.opentutorials.javatutorials.classninstace;

class Calculator3 {
	
	public static void sum(int left, int right) {
		// static이 붙은 클래스 메소드는 클래스를 통해 직접적인 접근이 가능
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator3.sum(10, 20); // 30출력
		// 클래스에 직접 접근하여 작동
		Calculator3.avg(10, 20); // 15출력
		// 클래스.sum, 클래스.avg
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);

	}

}
