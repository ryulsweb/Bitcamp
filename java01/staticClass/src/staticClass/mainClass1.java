package staticClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass1 {
	public static void main(String[] args) {
		/*
		System.out.println("sn = " + StaticClass.staticNumber);
		
		StaticClass.staticNumber = 1;
		// 객체생성과 초기화 X 자동적으로.
		
		System.out.println("sn = " + StaticClass.staticNumber);
		
		StaticClass sc = new StaticClass();
		System.out.println("sc sn : " + sc.staticNumber);
		sc.method();
		
		StaticClass sc1 = new StaticClass();
		System.out.println("sc1 sn = " + sc.staticNumber);
		// sc1 sn = 2객체가 여러개 있어도 하나다. 
		
		StaticClass1 s = StaticClass1.getInstance();
		
		Calendar cal = new GregorianCalendar();
		Calendar cal1 = Calendar.getInstance(); 
		// static 메소드
		*/
		
		StaticClass1.staticMethod();
		// this는 접근이 안됀다.
		
		
	}
}
