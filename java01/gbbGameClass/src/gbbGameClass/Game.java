package gbbGameClass;

import java.util.Scanner;

public class Game {
	// 멤버변수는 private. 멤버메소드는 대부분  public
	private int userNum, comNum;
	private int win, lose, draw;
	private int result;
	
	Scanner sc = new Scanner(System.in);
	
	// 초기화는 리턴값이 필요없다.
	public void init() {
		win = 0;
		lose = 0;
		draw = 0;
	}
	
	public void randomSet() {
		comNum = (int)(Math.random() * 3);
		System.out.println("comNum = " + comNum);
	}
	
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위(0) 바위(1) 보(2) = ");
		userNum = sc.nextInt();
	}
	
	public String resultMessage() {
		String resultMsg = "";
		
		switch(result) {
			case 1:
				resultMsg = "당신이 이겼습니다!";
				win++;
				break;
			case 0:
				resultMsg = "다시 도전하세요!";
				lose++;
				break;
			case 2:
				resultMsg = "무승부 입니다!";
				draw++;
				break;
		}
		return resultMsg;
	}
	
	public void loop() {
		while (true) {
			
			// random
			randomSet();
			
			//userinput
			userInput();
			
			result = (comNum - userNum + 2) % 3; 
			
			String resultMsg = resultMessage();
			
			
			String userCho = "";  // local변수
			String comCho = "";
			
			if (userNum == 0)			userCho = "가위";
			else if(userNum == 1)		userCho = "바위";	
			else						userCho = "보";	
			
			if(comNum == 0)		comCho = "가위";
			else if(comNum == 1)	comCho = "바위";
			else					comCho = "보";
	 		
			// ---------- result print ----------
			System.out.println(resultMsg + " 당신은 " + userCho + 
					"내고 컴퓨터는 " + comCho + "를 냈습니다");
			
			// 승패무
			System.out.println(win + "승 " + lose + "패 " + draw + "무입니다");
			
			// replay
			System.out.println("계속하시겠습니까? (Y/N) = ");
			String msg = sc.next();
			
			if(msg.equals("n") || msg.equals("N")) {
				System.out.println("안녕히 가십시오.");
				break;
			}else {
				System.out.println("다시 게임을 시작합니다!");
			}
		}
	}
}
