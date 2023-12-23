package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing") && password.equals("111111")){
			System.out.println("right"); //and 앞뒤가 모두 참인 경우
		} else {
			System.out.println("wrong");
		} 

	}

}
