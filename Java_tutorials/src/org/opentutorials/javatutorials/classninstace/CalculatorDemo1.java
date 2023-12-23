package org.opentutorials.javatutorials.classninstace;

class Calculator {
	static double PI = 3.14; //모든 객체가 같은 값을 가져야한다.
	// 클래스 변수, PI는 클래스에 소속된 변수로 동일한 값을 할당한다.
	int left, right;
	
	public void setOprands(int left,int right) {
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
		
		Calculator c1 = new Calculator();
		// c1이라는 인스턴스 생성
		System.out.println(c1.PI); // 3.14출력
		//
		Calculator c2 = new Calculator();
		System.out.println(c2.PI); // 3.14출력
		
		System.out.println(Calculator.PI); // 3.14출력
		// 클래스를 통해 변수에 접근이 가능하다
	}

}
