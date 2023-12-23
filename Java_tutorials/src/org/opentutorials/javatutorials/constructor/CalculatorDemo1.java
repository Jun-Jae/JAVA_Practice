package org.opentutorials.javatutorials.constructor;

class Calculator {
	// main문의 Calculator와 이름이 같은게 중요
	int left, right;
	
	public Calculator(int left, int right) {
		// main문의 Calculator와 이름이 똑같은것이 중요
		// Calculator가 생성자이다.
		// 생성자의 역할은 클래스가 생성될 때 클래스와 똑같은 생성자가 생성
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10, 20);
		// Calculator는 메소드를 호출하는 클래스가 아닌 생성자이다.
		// Calculator를 지정할 때 left와 right를 지정
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}
} // 생성자는 클래스와 이름이 똑같은 것이 자동생성  