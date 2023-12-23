package org.opentutorials.javatutorials.exception;

class A{
	private int[] arr = new int[3];
	// 3의 크기를 가진 정수배열 생성
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second) {
		System.out.println(arr[first] / arr[second]);
		// first에는 10, second에 1 대입
		// 이후 에러발생
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		// A클래스 인스턴스화 작업
		a.z(10, 1);
		// z메소드 호출
	}

}
