package org.opentutorials.javatutorials.object;
// 클래스가 소속되어 있는 패키지
class Calculator{ // 3)지금부터 Calculator라는 설계도를 알려준다.
	int left, right;
	// 변수 선언
	public void setOprands(int left, int right) {
		// 각각의 매개변수에 10과 20이 전달된다.
		this.left = left; // 뒤에 오는 left는 매개변수 left를 의미
		// this.은 Calculator 인스턴스 자신(객체 내 접근가능)을 가르킨다.
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
		// setOprands를 통해 설정한 left와 right를 이용한 출력
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// Calculator는 데이터타입이기도 하다. 즉, 데이터타입을 직접 생성
		Calculator c1 = new Calculator(); 
		// 1) Calculator라는 객체를 생성하고 c1이라는 변수에 담는다
		c1.setOprands(10, 20);
		// 2) setOprands라는 메소드의 인자값으로 보낸다.
		c1.sum(); // 결과는 30
		c1.avg(); // 결과는 15
		
		Calculator c2 = new Calculator();
		// Calculator라는 인스턴스 생성 후 c2라는 변수에 담기
		c2.setOprands(20, 40);
		// 내부적으로 left는 20이 right는 40이 된다
		c2.sum(); // 60을 출력
		c2.avg(); // 30을 출력
	}

}

