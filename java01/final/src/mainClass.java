
public class mainClass {
	public static void main(String[] args) {
		
		MyClass cls = new MyClass();
		cls.method();
		cls.method();
		cls.method();
		
		MyClass cls1 = new MyClass();
		cls1.method();
		cls1.method();
		
		// 상수 (final) = 주로 대입할때 값을 갖고올때 사용한다.
		final int NUMBER = 3;	// C에선 define, C++에선 const
//		NUMBER = 5;
		int num;
		
		num = NUMBER;
		
		Object mcls = new YouClass(); // 최종은 이것.
		// MyClass 이것 대신에 사용할 수 있는것? Object
		
		MyClass my = (MyClass)mcls;
		YouClass yo = (YouClass)my;
		
		YouClass yc1 = new YouClass();
//		MyClass my = (MyClass)ycl; // 불가능
		
	}
}

// member변수, local변수, static변수 차이
class MyClass{	// 맨앞에 final을 붙여주면 상속금지 . 최종클래스라는 뜻.
	private int number;	// member 변수
	public static int stNumber;	// static 변수	
	

	public void method() {	
	// public final void method() >> final 붙여주면 오버라이딩 안됌. 더이상 상속 불가능.
		int num = 0;	// 지역변수(local변수)
		num++;
		this.number++;
//		stNumber++;
		MyClass.stNumber++;	// 위 말고 이렇게 써주는게 정석.
		
		System.out.println("num = " + num);
		System.out.println("number = " + number);
		System.out.println("stNumber = " + stNumber);
	}
}

class YouClass extends MyClass{
	
//	public void method() {}
}
