package staticClass;


public class mainClass {	//mainClass 이것도 생성할순 있다. 
	public static void main(String[] args) {
		
//		MyClass cls = new MyClass();
		// MyClass == instance(주체) cls의 메모리에 생성
		
		MyClass cls = new MyClass(12);
		
//		mainClass mcls = new mainClass();
//		mcls.func();
	
		
	}
	
	public void func() {
		System.out.println("mainClass func()");
	}
	
}
