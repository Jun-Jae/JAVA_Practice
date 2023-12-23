package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

	public static void sum(int left, int right) {
		System.out.println(left + right);
	} // 중복을 제거하기 위해 메소드를 이용
	  // 유지보수에 용이하고 가독성이 올라간다.
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	} 

}
