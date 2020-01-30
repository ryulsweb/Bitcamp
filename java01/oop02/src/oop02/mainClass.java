package oop02;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	은닉성(==캡슐화)
		 * 	: 외부와의 차단으로 변수들을 관리할 수 있다.
		 * 	클래스 내부에서만 접근이 (내부에서 처리)가능하도록 접근지정자로 제어한다.
		 *  ------------ 접근제한자 --------------------
		 *  private(개인적인) -> 멤버변수		setter getter
		 *  public(대중적인)  -> 멤버 메소드
		 *  protected(특정) - 상속관련 . 지금은 거의 쓰지 않음
		 *  
		 *  멤버변수는 private, 멤버메소드는 대부분  public
		 *  
		 *  2개의 메소드 이상에서 꼭 접근해야하는 변수들은 필요 
		 *  한 군데서 필요할때는 멤버변수를 설정할 필요가 없다.
		 */
		
		MyClass cls = new MyClass();
//		
//		cls.number = 1;
//		cls.name = "홍길동";
//		cls.height = 178.1;
//		
		// 메소드만 호출--
		cls.input();
		cls.printing();
		
		// 데이터 받아와 출력--
		//String name = cls.getName();
		//System.out.println("name = " + name);
	}
}
