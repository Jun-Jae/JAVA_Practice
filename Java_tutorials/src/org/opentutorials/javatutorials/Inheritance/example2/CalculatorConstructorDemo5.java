package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
	int left, right;
	
	public Calculator() {}
	// 부모클래스의 기본 생성자 생성, 필수!!
	
	public Calculator(int left, int right) {
	// 이것은 기본 생성자가 될 수 없다.
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
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


class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
		// 하위클래스에서 부모클래스 선언
		// 부모클래스를 의미, 부모클래스의 생성자를 의미
		// 초기화 코드는 반드시 super코드 보다 밑에 존재해야된다.
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo5 {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		// 클래스를 인스턴스화 하는 과정
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
