package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		System.out.println(a == b); //false출력
		System.out.println(a.equals(b)); //문자열 비교방법
	}

}
