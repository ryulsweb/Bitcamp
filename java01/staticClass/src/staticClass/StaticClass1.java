package staticClass;

public class StaticClass1 {
	
	public static int num;

	public StaticClass1() {
		System.out.println("StaticClass1 StaticClass1()");
	}
	
	private void func() {
		System.out.println("StaticClass1 func()");
	}
	
	private void method() {
		System.out.println("StaticClass1 method()");
	}
	
	// 실제 많이씀.
	public static StaticClass1 getInstance() {
		StaticClass1 sc = new StaticClass1();
		sc.method();
		sc.func();
		return sc;
	}

	public static void staticMethod() {
		num = 12;
		System.out.println("staticMethod() ");
		
	}
}
