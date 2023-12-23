package org.opentutorials.javatutorials.exception;
class DivideException extends RuntimeException{
	public int left;
	public int right;
	DivideException(){
		super();
	} // 기본 생성자가 아닌 생성자는 직접 구현
	DivideException(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	} // 기본 생성자 구현	
}
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new DivideException("Can't divide zero", this.left, this.right);
		}
			System.out.println(this.left/this.right); 
	}
}
public class CalculatorDemoException {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch(DivideException e){
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}

	}

}
