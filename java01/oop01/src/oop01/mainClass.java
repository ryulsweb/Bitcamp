package oop01;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	Object Oriented Programming OOP
		 * 		Aspect(관점) Oriented Programming
		 * 
		 * 	처리 중심임.
		 * 
		 * 	절차지향과는 전혀 상반된 결과
		 * 	절차지향은 순차적 처리 (장점은 속도가 빠름)
		 * 
		 * 	OOP는 설계중심임
		 * 	
		 * 	1. 은닉성(캡슐화)
		 *  2. 상속성
		 *  3. 다형성
		 *  은닉석을 제외한 2,3은 비슷
		 *  
		 *  class 설계 방법(규칙)
		 *  
		 *  class 클래스 명
		 *  {
		 *  	-- 변수부에 해당 
		 *  	접근지정자	변수자료형	변수명;		member 변수
		 *  
		 *  	-- 메소드부
		 *  	접근지정자	자료형  메소드명(매개변수){  
		 *  	
		 *  	}
		 *  }
		 *  
		 *  변수(객체)를 선언 후에 동적할당을 항상 해야 접근가능하다.
		 *  
		 *  클래스 변수 = Object(객체), instance(주체)
		 *  					     실제 메모리 영역에 올라가는 변수.
		 *  
		 *  생성시 : 클래스 명  인스턴스 = new (같은)클래스명 ();
		 *  
		 *  인스턴스(접근하기 위한 참조변수) > 실제영역
		 *  stack					 heap
		 * 
		 */
		
		MyClass cls;	// cls == instance(주체)
		
		cls = new MyClass(); // 실제 영역은 heap에 있지만 cls는 stack영역에 있다.
		
		// 사용(접근)하기 위해 동적 할당을 해준다.
		cls.c = 'A';
		cls.x = 12;	// 인수 int i를 통해
		cls.func();
		cls.method(33);
		
		// TV (안방, 홀, 내방) 총 3대
		// TV의 특징 : 메이커
		String name[] = new String[3];
		int channel[] = new int[3];
		boolean Power[] = new boolean[3];
		
		// 인스턴스로 관리
		TVclass tv1, tv2, tv3; // 아래와 동일
		tv1 = new TVclass();
		tv2 = new TVclass();
		tv3 = new TVclass();
		
		//TVclass arrTV[] = new TVclass[3]; // 위와 동일 변수임
		
		
		//arrTV[0] = new TVclass();
		//arrTV[0].setChannel(11);
		
		//tv1.name = "LG"; 
		
		tv1.setName("LG"); 
		tv2.setName("Samsung");
		tv3.setName("Daewoo");
		
		tv1.setPower(true);
		tv2.setPower(false);
		tv3.setPower(true);
		
		//String tvname = tv1.getName();
	}
}

// 일단 파일로 나누지 않을것임
class MyClass{
	// 변수부(멤버변수)
	int x, y;
	char c;
	String str;
	
	// str = "hh"; < 이렇게 넣을 순없고 무조건 function(메소드)안에 넣는다.
	
	// 메소드부 
	void func() {
		x = 0;
		System.out.println("MyClass소속 func()");
	}
	
	void method(int i) {
		str = "hello";
		x = i;
		System.out.println("MyClass method(int i)");
		System.out.println("x = " + x);
	}
}


// 캡슐화의 좋은 점
class TVclass{
	// 3개의 데이터를 하나로
	String name;
	int channel;
	boolean power;
	
	void setName(String newName) {
		name = newName; //set을 통해 멤버변수 셋팅
	}
	String getName() {
		return name;
	}
	
	void setChannel(int newChannel) {
		channel = newChannel; //set을 통해 멤버변수 셋팅
	}
	int getChannel() {
		return channel;
	}
	
	void setPower(boolean pow) {
		power = pow;
	}
	boolean getPower() {
		return power;
	}
	
}
