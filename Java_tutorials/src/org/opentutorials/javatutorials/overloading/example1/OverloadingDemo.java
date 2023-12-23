package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo {
	void A () {System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A (int arg1)");}
	void A (String arg1) {System.out.println("void A(String arg1)");}
	// int A(){System.out.println("void A()");}
	// 오버로딩하기 위해서는 데이터타입의 통일이 선행되어야 한다.
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("coding everybody");

	}

}
