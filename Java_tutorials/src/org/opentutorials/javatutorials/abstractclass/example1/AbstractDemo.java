package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A {
	//클래스 A는 추상클래스
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c() {System.out.println("Hello")}
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {
		return 1;
		//클래스 A의 메소드 b()를 오버라이딩 해야된다.
		//메소드 b()는 추상메소드이기 때문에 바로 사용할 수 없다.
		//abstract는 상속을 강제한다.
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		//A obj = new A();
		//A라는 클래스를 인트턴스화 하는 작업
		B obj = new B();
	}

}
