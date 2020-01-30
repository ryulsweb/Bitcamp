package child;

import parent.StarCraft;

public class Race extends StarCraft{
	// 부모클래스
	public void life() {	// over ride
		System.out.println("StarScraft life");
	}
	
	public void fly() {	
		System.out.println("fly 날다");
	}
}
