package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;
	
	void m() {
		System.out.println(v);
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C(); 
		// C라는 클래스를 c1이라는 인스턴스에 담는다.
		c1.m();
		// c1이라는 인스턴스의 m이라는 메소드를 호출
	}

}
