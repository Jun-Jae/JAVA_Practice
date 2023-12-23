package org.opentutorials.javatutorials.polymorphism;

interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface beliver{}
class Steve implements father, programmer, believer{
	public void coding() {
		System.out.println("fast");
	}
}
class Rachel implements mother, programmer{
	public void coding() {
		System.out.println("elegance");
	}
}
public class Workspace {
	public static void main(String[] args) {
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		// 공통의 인터페이스 사용, 필요한 부분에 집중하여 상호작용이 가능
		employee1.coding();
		employee2.coding();
	}
}
