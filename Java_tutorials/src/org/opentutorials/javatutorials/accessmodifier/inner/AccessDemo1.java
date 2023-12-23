package org.opentutorials.javatutorials.accessmodifier.inner;
class A {
	public String y() {
		return "public void y()";
	}
	private String z() {
		// 접근제어자 private은 클래스 내부적으로만 사용 가능,
		// 외부의 클래스에서는 사용이 불가
		return "public void z()";
	}
	public String x() {
		return z();
	}
}
public class AccessDemo1 {
	public static void main(String[] args) {
		// 접근제어자는 은행으로 생각하자
		A a = new A();
		System.out.println(a.y());
		//아래코드는 오류가 발생한다.
		//System.out.println(a.z());
		//z()는 private이기 때문
		System.out.println(a.x());
		//직접적으로 부르는 것이 아닌 간접적으로 접근
	}

}
