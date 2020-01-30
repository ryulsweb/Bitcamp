package function2;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	가변인수
		 */
		allocParameter(2, 3, 4);
		
		allocParameter(1, 2, 3, 4, 5, 6, 7);
		
		alloc_Parameter("hello", 1, 2, 3);
	}
	
	
	static void allocParameter(int...ab) { 
		// int...ab 인수. 설정한 값에 따라 달라진다. : 가변인수
		
		int sum = 0;
		for (int i = 0; i < ab.length; i++) {
			sum = sum + ab[i];
		}
		
		System.out.println("합계 : " + sum);
	}
	
							// getter
	static void alloc_Parameter(String str, int...ab) {
		// String str = 일반변수 / int...ab = 가변인수
		// int...ab, String str = ab에 에러 .
		// 변수가 여러개일 결루 가변인수는 맨 뒤에 써야한다.
		
		int sum = 0;
		for (int i = 0; i < ab.length; i++) {
			sum = sum + ab[i];
		}
		
		System.out.println("합계 : " + sum);
	}
}
