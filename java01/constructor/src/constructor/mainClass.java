package constructor;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	constructor : 생성자
		 * 				    함수(메소드)
		 * 				  class명과 같은 method(함수)
		 * 				  return 값이 없다.
		 * 				  over loading이 가능하다. ==여러개를 많이 생성가능.
		 * 				    자동호출이된다 (클래스 생성시)
		 * 				    별도의 호출이 불가능하다 (1회용)
		 * 				    생략이 가능하다.
		 * 				    초기 값 설정 많이 사용
		 * --------------------------------------------------
		 * 					structure   // 참고
		 * 					struct AAA{
		 * 						int i;
		 * 						char c;
		 * 					}
		 * 
		 * 					AAA aaa = { 1, 'A' }; > class는 이게 안됌 그래서 나온게 생성자
		 * ---------------------------------------------------
		 * 	destructor : 소멸자  (그냥 참고만  c++) 
		 * 				  자동호출
		 * 				 java에는 없음
		 * 	this 참조
		 * 
		 * 
		 */
		
		// -------------- 전부 앞에 MyClass 안써도 됌.
		
		// 리턴값 없이 호출만됌. 
		MyClass cls = new MyClass(); // 기본생성자
		cls.setNumber(135.67f); // 많이 씀.
		
		MyClass cls1 = new MyClass(12);	// MyClass(int n)
		
		// 초기값 설정 ----
		MyClass cls2 = new MyClass(12.3f);	// 많이 씀.
		
		float f = cls2.getNumber();
		System.out.println("f = "  + f);
		
		
		Student stu = new Student();
		
		// this 참조 = 주소출력 ----
		System.out.println(stu); 
		System.out.println(stu.getThis()); // 자기자신이 등록된 힙영역의 주소값
	}
}
