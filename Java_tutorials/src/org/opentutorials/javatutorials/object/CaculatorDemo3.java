package org.opentutorials.javatutorials.object;

public class CaculatorDemo3 {

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println(left + right / 2);
	}
	
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		// 변수 left, right는 입력값으로 들어가는 변수이다.
		sum(left, right);
		avg(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);

	} // 서로 그룹핑하여 유지보수에 용이하게 하는 것이 객체지향이다.
	  // 메소드 sum과 avg는 변수 left와 right와 서로 연관되어 있다.
}
