package org.opentutorials.javatutorials.polymorphism;
class A{
	// 부모클래스 A
	public String x() {return "x";}
}
class B extends A{
	public String y() {return "y";}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		// 클래스 B의 데이터 타입이 A로 설정된다.
		obj.x();
		//obj.y();
		// 오류발생, obj의 데이터 타입은 A이기 때문이다.
	}

}
