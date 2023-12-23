package org.opentutorials.javatutorials.reference;
class A{
	public int id;
	A(int id) {
		this.id = id;
	}
}


public class ReferenceDemo1 {

	public static void runValue() {
		int a = 1; // 기본데이터 타입으로 설정
		int b = a; // 복제발생
		b = 2;
		System.out.println(a);
	}
	
	public static void runReference() {
		A a = new A(1);
		A b = a; // 참조발생, 서로 인스턴스를 가리키게 된다
		b.id = 2;
		System.out.println(a.id);
		// new를 통해 만든 데이터 타입은 기본데이터 타입과 다르게 동작한다.
	}
	
	public static void main(String[] args) {
		runValue(); // 1출력
		runReference(); // 2출력
	}
}
