package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator {
	int left, right;
	
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
	// 새로운 클래스 선언, Calculator가 부모클래스
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {


		SubstractionableCalculator c1 = new SubstractionableCalculator();
		// 추가로 정의된 클래스
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		// 기존 메소드를 사용할 수 있는 이유는 Calculator를 확정했기 때문
		c1.substract();

	}

}
