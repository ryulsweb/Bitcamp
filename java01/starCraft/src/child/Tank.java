package child;

import parent.StarCraft;

public class Tank extends StarCraft {
	// 부모클래스
	public void life() {	// over ride
		System.out.println("StarScraft life");
	}
	
	public void canon() {	
		System.out.println("Tank 포격");
	}
}
