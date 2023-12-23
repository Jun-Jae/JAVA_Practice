package org.opentutorials.javatutorials.polymorphism;
class O{
	// 오버로딩으로 표현
	public void a(int param) {
		System.out.println("print out number");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("print out text");
		System.out.println(param);
	}
}
public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
		// 매개변수에 따라 다른 메소드를 호출
	}
}
