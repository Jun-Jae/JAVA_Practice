package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator {
	// 클래스 상속, Calculator는 Demo1에서 이미 선언
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		// MultiplicationableCalculatorfmf c1이라는 인스턴스에 할당
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}

}
