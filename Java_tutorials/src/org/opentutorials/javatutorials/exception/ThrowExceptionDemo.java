package org.opentutorials.javatutorials.exception;

import java.io.*;

class B{
	void run() throws FileNotFoundException, IOException{
		// 메소드 run() 사용자에게 예외에 대응할 것을 강제하는 것
	}
}
class C{
	void run() {
		B b = new B();
		// 클래스 B() 인스턴스화
		try {
			b.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		// C클래스를 인스턴스화
		c.run();
		//c인스턴스의 run() 메소드 호출
	}
}
