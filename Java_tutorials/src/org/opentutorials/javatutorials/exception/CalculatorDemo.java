package org.opentutorials.javatutorials.exception;
class Calculator{
	int left, right;
	// 전역변수 선언
	public void setOprands(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	public void divide() {

		try { // try-catch는 예외를 처리하는 대표적인 로직이다.
		// 예외처리 문법, '예외의 발생이 예상되는 로직'	
			System.out.println("Result is "); // 출력
			System.out.println(this.left/this.right);
			// 예외발생 로직
		} catch(Exception e) {
			// (예외클래스 인스턴스), '예외가 발생했을 때 실행되는 로직'
			System.out.println("Error occur : " + e.getMessage());
			// getMessage는 간단한 예외사항을 알려준다
			// toString은 보다 자세한 예외사항을 알려준다.
		}
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// Calculator 클래스를 인스턴스화 하는 작업
		c1.setOprands(10, 0);
		// 10을 0으로 나누기 실행
		// 에러발생, 나누기 불가능
		c1.divide();
		// 호출 시 에러발생
	}
}
