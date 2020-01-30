package child;

import parent.StarCraft;

public class Marin extends StarCraft {
	// 부모클래스
	public void life() {	// over ride
		System.out.println("StarScraft life");
	}
	
	public void run() {
		System.out.println("Marin 뛰다");
	}
}
