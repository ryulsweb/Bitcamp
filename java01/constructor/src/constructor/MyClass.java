package constructor;

public class MyClass {
	
	private float number; // 멤버변수
	
	// return값이 없다.
	// void는 따로 호출해야하고 이것은 자동호출됀다.
	
	public MyClass() { 	// 기본 생성자
		number = 1.23f;
		System.out.println("MyClass MyClass()");
	}
	
	public MyClass(int n) {
		System.out.println("MyClass MyClass(int n)");
	}
	
	// over loading
	public MyClass(int n, char c) {
		System.out.println("MyClass MyClass(int n, char c)");
	}
	
	public MyClass(float _number) {
		number = _number;
	}
	
	public void setNumber(float _number) {
		number = _number;
	}
	
	public float getNumber() {
		return number;
	}
}
