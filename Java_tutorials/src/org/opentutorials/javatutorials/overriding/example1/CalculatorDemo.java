package org.opentutorials.javatutorials.overriding.example1;

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
	
	public void sum() {
		System.out.println("Result is " + (this.left + this.right));
		// 하위클래스에 높은 우선순위를 설정하게된다. 예외는 더 높은 우선순위 
	}
	
	public int avg() {
		// 부모는 리턴타입이 void인데 자식은 int이다. 오류 발생
		// 부모와 자식의 타입 불일치 = overriding 불가능
		// 부모 클래스의 타입을 int로 변경하면 오류수정 가능
		return ((this.left + this.right) / 2);
		// 부모 클래스와 중복, 중복제거 필요 
		// ruturn subper.avg();로 대체!!!!
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {

		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

	}

}
