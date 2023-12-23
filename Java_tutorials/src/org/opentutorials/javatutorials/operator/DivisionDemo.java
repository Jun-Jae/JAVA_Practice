package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F; //기본값이 double이므로 float로 강제 형변환(F)
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);
	}
}
