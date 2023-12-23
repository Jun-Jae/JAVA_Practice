package org.opentutorials.javatutorials.progenitor;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj) {
		// Student s = obj; 다형성의 측면에서 불가능
		Student s = (Student)obj; // 강제 형변환, 부모클래스를 자식클래스로 변환
		return this.name == s.name;
		// true로 반환
	}
}

class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
