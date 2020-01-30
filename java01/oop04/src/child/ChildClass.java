package child;

// 자식클래스

import parent.ParentClass;

public class ChildClass extends ParentClass{
	private String name;
	
	public ChildClass() {	// 기본생성자
//		super();
		System.out.println("ChildClass childClass()");
	}
	
	public ChildClass(String name, int num) {
		super(num);	// 부모 클래스가 있는데 까지 쭉올라간다.
		this.name = name;
		System.out.println("ChildClass childClass(String name)");
	}
}
