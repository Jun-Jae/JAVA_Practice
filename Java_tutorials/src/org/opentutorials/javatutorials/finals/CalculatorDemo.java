package org.opentutorials.javatutorials.finals;

class Calculator {
	static final double PI = 3.14;
	// final로 지정하게 되면 절대 바꿀 수 없다.
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;
		//에러 발생, 이미 지정된 final 값이기 때문이다.
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10;
		// 이 또한 에러 발생
	}
} // final 메소드 또한 상속 및 오버라이딩이 불가능하다.
