package org.opentutorials.javatutorials.constant2;

interface FRUIT{
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY{
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		
		if(FRUIT.APPLE == COMPANY.APPLE) {
			System.out.println("Equal");
		}
		
		int type = FRUIT.APPLE;
		switch(type) {
		case FRUIT.APPLE:
			System.out.println(57);
			break;
		case FRUIT.PEACH:
			System.out.println(34);
			break;
		case FRUIT.BANANA:
			System.out.println(93);
			break;
		}
	}
}
