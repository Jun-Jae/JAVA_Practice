package org.opentutorials.javatutorials.classninstace;

class Calculator2 {
	static double PI = 3.14;
	static int base = 0; // base를 클래스의 멤버로 지정(static사용)
	// 클래스 변수인 base가 추가되었다.
	int left, right;
	// left와 right는 인스턴스의 멤버로 지정되었다.
	// 필요에 따라 값이 변한다.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
		// 더ㅏ기에 base의 값을 포함시킨다.
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
		// 평균치에 base의 값을 포함시킨다.
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20); // 30출력
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40); // 60출력
		c2.sum();
		
		Calculator2.base = 10;
		// 클래스 변수 base의 값을 10으로 지정했다.
		c1.sum(); // 40출력
		
		c2.sum(); // 70출력

	}

}
