package main;

import child.JaneClass;
import child.TomClass;
import parent.ParentClass;

public class mainClass {
	public static void main(String[] args) {
		
		TomClass tc = new TomClass();
		JaneClass jc = new JaneClass();
		
		tc.ParentMethod();
		jc.ParentMethod();
		
		// ** Over Ride 목적 : 하나의 인스턴스형으로 관리를 용이하게 하기 위함 **
		
		// 부모클래스             자식클래스
		ParentClass p1 = new TomClass();
		// 인스턴스는 보모클래스, 생성자는 자식클래스로
		p1.ParentMethod(); // 오버라이딩된 메소드
		
		// 접근하려면 = 강제형변환(자식클래스로)으로 인해 자식 클래스가 호출된다.
		((TomClass)p1).func(); // 아래와 같음.
		
//		TomClass t = (TomClass)p1; 
//		t.func();
		
		// 호출시 자식클래스의 메소드가 호출된다.
		
		ParentClass p2 = new JaneClass();
		p2.ParentMethod();
		
		// ---------------------------------------------//
//		TomClass tomArr[] = new TomClass[5];
//		JaneClass janeArr[] = new JaneClass[5];
//		tomArr[0] = new TomClass();
//		janeArr[0] = new JaneClass();
//		janeArr[1] = new JaneClass();
//		
//		// 자식클래스가 부모클래스를 이용해 하나로 관리
//		ParentClass parArr[] = new ParentClass[10];
//		parArr[0] = new TomClass();
//		parArr[1] = new JaneClass();
//		parArr[2] = new JaneClass();
	}
}
