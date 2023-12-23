package org.opentutorials.javatutorials.constant2;

enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color){
		System.out.println("Call Constructor" + this);
		// 3번 호출
		this.color = color; 
	}
}

/*class Company{
	public static final Company GOOLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}*/

enum Company{
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		
		Fruit type = Fruit.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(57 + Fruit.APPLE.color);
				break;
			case PEACH:
				System.out.println(34 + Fruit.PEACH.color);
				break;
			case BANANA:
				System.out.println(98 + Fruit.BANANA.color);
				break;
		}

	}

}
