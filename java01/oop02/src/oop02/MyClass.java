package oop02;

import java.util.Scanner;

public class MyClass {
	
	private int number;
	private String name;
	private double height;
	
	// 접근을 제한했는데 입력받고 싶다면?
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number = ");
		number = sc.nextInt();
		
		System.out.println("name = ");
		name = sc.next();
		
		System.out.println("height = ");
		height = sc.nextDouble();
	}
	
	// 외부에서 접근하게
	public String getName() {	// getter
		return name;
	}
	
	public void setName(String newName) {	//setter
		name = newName;
	}
	
	public void printing() {
		System.out.println("number : " + number + " name :" + name + " height" + height);
	}
}
