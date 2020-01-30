package child;

import parent.ParentClass;

public class TomClass extends ParentClass{
	
	public void ParentMethod() {	//over ride된 메소드
		System.out.println("TomClass ParentMethod()");
	}
	
	public void func() {
		System.out.println("TomClass func()");
	}
}
