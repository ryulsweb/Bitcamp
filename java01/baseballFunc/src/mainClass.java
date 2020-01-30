
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 1. 초기화
		 * 
		 * ****************** loop
		 * 
		 * 2. random 산출
		 * 
		 * 3. user input
		 * 
		 * 4. 판정
		 * 
		 * 5. 메세지
		 * 
		 * ******************
		 * 
		 * 6. 결과처리
		 * 
		 */

		// 변수 선언
		int r_num[], u_num[];
		boolean clear; // 판정, 결과

		// ---------- 1. 초기화 ----------

		r_num = new int[3];
		u_num = new int[3];
		clear = false;

		// ---------- 2. random 산출 ----------

		ballRandom(r_num);

		int w = 0;
		int message[] = new int[2];

		while (w < 10) {

			// 3. user input
			u_num = userInput(u_num);

			// 4. 판정
			clear = finding(r_num, u_num, message);
			if (clear)
				break;

			// 5. 메세지
			System.out.println(message[0] + "스트라이크" + message[1] + "볼입니다");

			w++;
		}

		// 결과
		if (clear) {
			System.out.println("Game Clear!!");
		} else {
			System.out.println("Game Over~");
		}

//		
//		
//		int strike, ball;
//		boolean _switch[] = new boolean[10];
//		int w, r; //
//		int count = 0;
//		
//		
//		
//		
//		// ---------- 2. random ----------
//		
//		for (int i = 0; i < _switch.length; i++) {  // ffffff 스위치를 다 꺼놓은 상태
//			_switch[i] = false;
//		}
//		
//		w = 0;
//		while (w < 3) {
//			r = (int)(Math.random() * 10); // 0 ~ 9
//			if(_switch[r] == false) {
//				_switch[r] = true;		// fftff fffff  어떤 숫자가 나온 것을 true로 바꿈
//				r_num[w] = r + 1;		// 1 ~ 10
//				w++;
//			}
//		}
//		
//		for (int i = 0; i < r_num.length; i++) {
//			System.out.println("r_num[" + i + "] = " + r_num[i]);
//		}
//		
//		/*
//		 * 하드코딩
//			while(true) {
//				for (int i = 0; i < r_num.length; i++) {
//					r_num[i] = (int)(Math.random() * 10) + 1;
//				}
//				if(r_num[0] != r_num[1] 
//						&& r_num[0] != r_num[2] 
//								&& r_num[1] != r_num[2]) {
//					break;
//				}
//			}
//		*/
//		
//		
//		// ---------- 3. user input (loop) ----------
//		w = 0;
//		while(w < 10) {
//			strike = ball = 0;
//		
//			while(true) {
//				for (int i = 0; i < u_num.length; i++) {
//					System.out.println((i + 1) + "번째 수 = ");
//					u_num[i] = sc.nextInt();
//				}
//				if (u_num[0] != u_num[1] 
//						&& u_num[0] != u_num[2] 
//								&& u_num[1] != u_num[2]) {
//					break;
//				}
//				System.out.println("중복된 숫자가 있습니다.");
//			}
//			
//			// ---------- 4. finding 비교 ----------
//			
//			// ***** ball
//			for (int i = 0; i < r_num.length; i++) {
//				for (int j = 0; j < r_num.length; j++) {
//					if (r_num[i] == u_num[j] && i != j) {
//						ball++;
//					}
//				}
//			}
//			
//			
//			// ***** strike
//			for (int i = 0; i < r_num.length; i++) {
//				if (r_num[i] == u_num[i]) {
//					strike++;
//				}
//			}
//			
//			// ***** 판정
//			if (strike > 2) {
//				//count = 0;
//				count = w + 1;
//				clear = true;
//				break;
//			}
//			
//			
//			// 메세지
//			System.out.println(strike + "스트라이크" + ball + "볼입니다.");
//			
//			w++;
//		}
//		
//		// ---------- 5. result ----------
//		if (clear) {
//			System.out.println(count + "회 Game Clear!!");
//		}
//		else {
//			System.out.println("Game Over~");
//		}

		// *****************************

		/*
		 * 
		 * // ---------- 선언 & 초기화 ---------- int com[] = new int[3]; // 컴퓨터가 던지는 볼 int
		 * user[] = new int[3]; // 유저가 맞추기위해 던지는 볼 int num = 0; // 배열 인덱스를 위해서 사용하는 변수
		 * int count = 0; // 몇번에 맞추는지 세기 위해서 boolean loop = true;
		 * 
		 * int strike = 0; // strike count = 0 int ball = 0; // ball count = 0
		 * 
		 * 
		 * // ---------- Random loop, 중복값 확인 ---------- for (int i = 0; i < com.length;
		 * i++) { com[i] = (int)(Math.random() * 10) + 1; for (int j = 0; j < i; j++) {
		 * if (com[j] == com[i]) { // i와 j 랜덤 값이 서로 같을때 i--; // 그 값을 마이너스 시켜서 그 값을 위로 다시
		 * 올려준 후 맨 위 for문으로 다시 리턴 break; } } }
		 * 
		 * // ---------- user 입력 ---------- System.out.println("1 ~ 9의 정수를 입력하세요 : ");
		 * 
		 * 
		 * // ---------- 판단 ---------- loop = true; while(loop) { for (int i = 0; i <
		 * user.length; i++) { num = sc.nextInt(); user[i] = num; if (num < 0 || num >
		 * 10) { System.out.println("1 ~ 9의 정수를 입력하세요 >>"); } }
		 * 
		 * for (int i = 0; i < com.length; i++) { for (int j = 0; j < user.length; j++)
		 * { // 배열의 값이 서로 동일해야 strike 처리가 됨. if (com[i] == user[j] && i == j) {
		 * strike++; } else if (com[i] == user[j] && i != j) { ball++; } } }
		 * 
		 * System.out.println(strike + "스타라이크" + ball + "볼"); strike = 0; // Setting
		 * "Strike" Count = 0 ball = 0; // Setting "Ball" Count = 0
		 * 
		 * if (strike >= 3) { loop = false; } count = count + 1; }
		 * 
		 * System.out.println("횟수 : " + (count - 1)); System.out.println("Game Over");
		 * sc.close(); // Scanner 종료
		 * 
		 */
	}

	
	static void ballRandom(int rnum[]) {
		boolean _switch[] = new boolean[10];	
		int w, r;
		
		w = 0;
		while(w < 3) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(_switch[r] == false) {
				_switch[r] = true;		// fftff fffff  어떤 숫자가 나온 것을 true로 바꿈
				rnum[w] = r + 1;		// 1 ~ 10
				w++;
			}
		}
		
		for (int i = 0; i < rnum.length; i++) {
			System.out.println("r_num[" + i + "] = " + rnum[i]);
		}
	}
	
	
	static int[] userInput(int unum[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < unum.length; i++) {
				System.out.print((i + 1) +  "번째 수 = ");
				unum[i] = sc.nextInt();
			}
			if(unum[0] != unum[1] 
					&& unum[0] != unum[2]
							&& unum[1] != unum[2]) {
				break;
			}
			System.out.println("중복된 숫자가 있습니다");
		}
		return unum;
	}
	
	
	static boolean finding(int rnum[], int unum[], int message[]) {
		int strike = 0, ball = 0;
		
		// ball
		for (int i = 0; i < rnum.length; i++) {
			for (int j = 0; j < rnum.length; j++) {
				if(rnum[i] == unum[j] && i != j) {
					ball++;
				}
			}
		}		
		
		// strike
		for (int i = 0; i < rnum.length; i++) {
			if(rnum[i] == unum[i]) {
				strike++;
			}
		}
		
		message[0] = strike;
		message[1] = ball;
				
		if(strike > 2) {
			return true;
		}
		
		return false;
	}
	
	
}
