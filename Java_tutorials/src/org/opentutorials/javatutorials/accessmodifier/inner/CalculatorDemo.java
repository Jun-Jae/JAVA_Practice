package org.opentutorials.javatutorials.accessmodifier.inner;

class Calculator{
	private int left, right;
	// 사용자가 의도하지 않은 방법으로 메소드의 상태를 변경하지 못하게 함.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int sum() {
		// 내부적으로 사용하여 사용자 통제
		return this.left + this.right;
	}
	public void sumDecoPlus() {
		System.out.println("++++" + sum() + "++++");
	}
	public void sumDecoMinus() {
		System.out.println("----" + sum() + "----");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	}
}
