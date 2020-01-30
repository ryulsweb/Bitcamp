package staticClass;

public class StaticClass {
	
	private int number;		// instance 변수
	public static int staticNumber;		// class 변수
	
	/*	메모리영역
	 * --------------------------------
	 * 	static   heap   static   sys
	 * 	local    new    정적 - 메모리에 상주(시작 시에 바로 / 없어질 때? 프로그램 종료 시) 너무 남발하면 안됀다. main에는 최소한으로
	 * 
	 * 	
	 */ 
	
	/*
	 * int i;
	 * 
	 * { int j; } static : 블록이 생성되면 자동으로 메모리에 할당되었다가 블록에서 나오면 사라진다.
	 */
	
	public StaticClass() {
		
	}
	
	public void method() {
		staticNumber++;
	}
	
}
