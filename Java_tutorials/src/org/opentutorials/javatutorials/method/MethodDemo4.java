package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	public static void numbering(int limit) { // 입력값은 정수
		int i = 0;			// 입력을 위한 도구(=매개변수)
		while(i < limit) { // limit이라는 변수는 2로 치환되게 된다.
			System.out.println(i);
			i++;
		}
	} // 메소드의 정의는 고정적인것으로 설정한다. 즉, 수정하지 않게 정의
	public static void main(String[] args) {
		numbering(2); 		// 총 0,1 두개의 값을 출력한다.
			//인자, argument // 여기에서의 입력값이 2이다.
	}				  	   // 메소드의 호출을 가변적으로 설정

}
