
public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	Exception : 예외 != 에러
		 * 				개발자 용(유지보수)
		 * 
		 * 	숫자를 입력 받아야하는데 문자 입력 = 예외 발생	
		 * 
		 * 	baseball → 1 2 3 → 'A' → (아스키코드값)65
		 * 
		 * 	number → format		1 2 3 → 'A'
		 * 	array → index number int arr[] = new int[3] → arr[3] = C에선 에러를 안잡아줌
		 * 	class → Scanner inport를 안하면 못 찾는다.
		 * 	file → 경로지정해준 경로에 파일이 없을때
		 * 
		 * 	int num[] = new int[2];
		 * 
		 * 	try{
		 * 		num[2] = 'a';	// 예외가 발생할 가능성이 있는 코드
		 * 
		 * 	}catch(예외클래스1 e){
		 * 		메세지
		 * 	}catch(예외클래스2 e){
		 * 		메세지
		 * 	}catch(예외클래스3 e){
		 * 		메세지
		 * 	}finally{
		 * 		// 무조건 실행됌
		 * 		// 뒷처리
		 * 			파일 close
		 * 			DB 원상복구 → roll back → undo
		 * 	}
		 * 	
		 * 	여러개가 발생할 수 있다. 
		 * 	오류(에러)가 아님 예외가 발생된것임.
		 */
		
		int num[] = { 11, 22, 33 };
		
		System.out.println("프로그램 시작");
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(num[i]);
			}
		
			System.out.println("배열 출력 완료");
		}catch (ArrayIndexOutOfBoundsException e) {
			//  System.out.println("배열 범위 초과");
			//	e.printStackTrace();
				System.out.println(e.getMessage());
			//	return;
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {
			// 원상복구의 영역이라 봐도 됀다.
			System.out.println("finally 무조건 실행됨");
		}
		
		System.out.println("프로그램 끝");
		
		funcExcp();
	}
	
	static void funcExcp()throws ArrayIndexOutOfBoundsException {
		// throws ArrayIndexOutOfBoundsException 
		// 이 함수 내부에서 예외가 발생할 소지가 있다는 뜻.
		// ()매개변수 괄호 닫은 부분 다음에 적어주면 됀다.
		
		int n[] = { 1, 2, 3 };
		
//		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(n[i]);
			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
	}
	
}
