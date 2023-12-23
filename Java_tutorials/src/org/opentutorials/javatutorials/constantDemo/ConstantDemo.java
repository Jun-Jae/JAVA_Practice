package org.opentutorials.javatutorials.constantDemo;

public class ConstantDemo {

	public static void main(String[] args) {
		float a = 2.2F; //a는 변수, 2.2는 상수
						//상수 뒤 F는 int에서 float로의 형변환을 강제한다.
		long b = 2147483648L; //int에서 long으로 형변환
		byte c = 100;//기본값은 항상 int이다.
					 //실수의 기본형은 double이다.
		short d = 200;
		
		int a1 = 3;
		float b1 = 1.0F;
		double c1 = a1 + b1; //자동 형변환
		
		System.out.println(c1);
		
		float n = (float)100.0;
		int m = (int)100.0F; //명시적 형변환
	}
}