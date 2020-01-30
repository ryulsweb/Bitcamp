package overLoad;

public class mainClass {
	public static void main(String[] args) {
		/*
		 *  Over Load : 함수(메소드)명은 같고
		 *  			인자, 인수(매개변수)의 자료형이나
		 *  			인수의 갯수가 다른 함수를 의미한다.(동명2인)
		 *  
		 *  image draw function
		 *  
		 *  RGB, RGBA(투명도)
		 *  
		 *  imageDraw(int x, int y);
		 *  imageDraw(int x, int y, int a); 
		 *  
		 *  // 매개변수 가 다른것이 over load
		 *  
		 *  중요! 
		 *  Over Ride > 상속성, 다형성
		 *  
		 */
		
		func();
		
		func('A');
		
		func(123);
		
		func('B', 234);
		
		func(345, 'C');
		
	}
	
	// 매개변수 X
	static void func() {
		System.out.println("func() 호출");
	}
	
	// 매개변수 O
	static void func(char c) {
		System.out.println("func(char c) 호출");
	}
	
	// 인수의 자료형이 다른것
	static void func(int i) {
		System.out.println("func(int i) 호출");
	}
	
	// 매개변수 갯수가 다른것 = 오버로드
	static void func(char c, int i) {
		System.out.println("func(char c, int i) 호출");
	}
	
	// 매개변수 갯수가 다른것 = 오버로딩 위와 다른 함수 취급
	static void func(int i, char c) {
		System.out.println("func(int i, char c) 호출");
	}
	
	/*********** OverLoading 주의사항 **********/
	
	// return 값 이 있는 함수 오러로딩 규칙위반 이렇게 하면 안됌
//	static void func(int i, char c) {
//		System.out.println("func(int i, char c) 호출");
//		return 1; 
//	}
	
	// 가인수(j)만 바꿔서 사용하면 안됀다. 불가능. 
//	static void func(int j, char ch) {
//		System.out.println("func(int j, char ch) 호출");
//	}
}
