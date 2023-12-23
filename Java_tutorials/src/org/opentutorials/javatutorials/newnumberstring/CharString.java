package org.opentutorials.javatutorials.newnumberstring;

public class CharString {

	public static void main(String[] args) {
		System.out.println("1" + " 1"); //문자열로 출력된다
		System.out.println("egoing said\"welcome program\"");
		//\를 " 앞에 위치시키면 "를 문자열의 시작과 끝을 구분하는 구분자가 아니라
		//단순히 문자로 해석하도록 강제할 수 있다.(escape)
		System.out.println("egoing said\n\"welcome world\"");
		//\n을 사용할 경우 줄바꿈으로 해석된다.
	}

}
