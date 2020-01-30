package oop03;

import child.ChildClass;
import sup.SuperClass;

public class mainClass {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
		cc.Super_method();
		cc.Child_func();
		cc.pub_name = "aaa";
//		cc.pro_name = "bbb";
		
//		SuperClass sc = new SuperClass();
//		sc.Super_method();
		//sc.Child_func();
	}
}
