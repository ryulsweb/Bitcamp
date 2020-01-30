package child;

//	자식 클래스

import sup.SuperClass;

public class ChildClass extends SuperClass{
	// java 다중 상속 불가능, 인터페이스는 다중상속
	public ChildClass() {
		
	}
	
	public void Child_func() {
		System.out.println("ChildClass Child_func()");
	
	
	//	pri_name = "";
		pub_name = "";
		pro_name = "";
	}
	
	// Over Ride : 상속받은 함수를 재기입하는 것
	// 오버라이드 시 리턴 값과 메소드명이 같아야한다.
	public void Super_method() {
		super.Super_method();
		System.out.println("ChildClass SuperClass Super_method()");
	}
	
}


