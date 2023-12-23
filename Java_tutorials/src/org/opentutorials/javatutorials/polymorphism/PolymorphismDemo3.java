package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		D obj = new D();
		// obj 인스턴스의 데이터 타입은 D
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		// 오류발생, 인터페이스의 강제로 인해 A()만을 실행할 수 있다.
		// B() 메소드는 I3에서 정의하고 있다.
		
	}
}