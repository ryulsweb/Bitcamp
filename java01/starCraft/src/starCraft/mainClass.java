package starCraft;

import child.Marin;
import child.Race;
import child.Tank;
import parent.StarCraft;

public class mainClass {
	public static void main(String[] args) {
		
		// unit 30
		Marin m[] = new Marin[10];
		Race r[] = new Race[10];
		Tank t[] = new Tank[10];
		
		StarCraft starArr[] = new StarCraft[5];
		// 유동적. 마린만 다 들어갈수 있다.
		
		starArr[0] = new Marin();
		starArr[1] = new Race();
		starArr[2] = new Marin();
		starArr[3] = new Tank();
		starArr[4] = new Tank();
		
		// Over Ride
		for (int i = 0; i < starArr.length; i++) {
			starArr[i].life();
		}
		
		// instanceOf : 인스턴스를 분별해줌 객체를 판별해주는 예약어.
		// 푸는 작업
		for (int i = 0; i < starArr.length; i++) {
			StarCraft sc = starArr[i];
			if (sc instanceof Marin) {
				Marin ma = (Marin)sc;
				ma.run();
				
//				((Marin)sc).run();	// 위와 동일
			}
			else if(sc instanceof Race) {
				Race ra = (Race)sc;
				ra.fly();
			}
			else if(sc instanceof Tank) {
				Tank ta = (Tank)sc;
				ta.canon();
			}
			// 생성된 자식들을 이용해 부모클래스 인스턴스로 관리할 수 있다.
		}
	}
}
