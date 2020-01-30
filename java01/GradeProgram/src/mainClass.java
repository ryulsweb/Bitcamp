import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		/*	전부 함수로
		 * 
		 * 	데이터관리 > String student[][];
		 * 
		 * 	1. 학생정보 추가 (이름, 나이, 영어, 수학)
		 * 	2. 학생정보 삭제
		 * 	3. 학생정보 검색
		 * 	4. 학생정보 수정
		 *  5. 학생성적 조회 (1명)	총점
		 *  6. 학생성적 총점
		 *  7. 학생성적 평균
		 *  8. 학생성적순 출력 
		 *  					
		 *  어느 작업을 하시겠습니까?
		 *  
		 *  --------------------------- 다하면
		 *  파일 저장 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 선언 -----------------------
		String student[][] = new String[10][4];
		int choice;
		int num = 0;
		
		
		while(true) {
			// 입력 -----------------------
			System.out.println("---------------------------------");
			System.out.print("1.학생정보 추가  2.학생정보 삭제  3.학생정보 검색\n4.학생정보 수정  5.학생성적 조회  6.학생성적 총점\n7.학생성적 평균  8.학생성적순 출력\n");
			System.out.println("---------------------------------");
			System.out.println("어느 작업을 하시겠습니까?");
			choice = sc.nextInt();
			
			if (choice == 1) {	// 학생정보 추가
				insert(student);
			}else if (choice == 2){	// 학생정보 삭제
				
			}else if (choice == 3){	// 학생정보 검색
				
			}else if (choice == 4){	// 학생정보 수정
				
			}else if (choice == 5){	// 학생성적 조회
				
			}else if (choice == 6){	// 학생성적 총점
				
			}else if (choice == 7){	// 학생성적 평균
				
			}else if (choice == 8){	// 학생성적순 출력
				
			}
		}
		
		
	}
	
	// 학생정보 추가
	static void insert(String student[][]) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		System.out.println("추가할 학생 수를 입력해주세요: ");
		choice = sc.nextInt();
		
		// 동적할당 -----------------------
		student = new String[choice][4];
		
		for (int i = 0; i < student.length; i++) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			String age = sc.next();
			
			System.out.print("영어 : ");
			String eng = sc.next();
			
			System.out.print("수학 : ");
			String math = sc.next();
			
			student[i][0] = name;
			student[i][1] = age;
			student[i][2] = eng;
			student[i][3] = math;
		}
	}
	
	// 학생정보 삭제
	
	
	// 학생정보 검색
	
	
	// 학생정보 수정
	
	
	// 학생성적 조회
	
	
	// 학생성적 총점
	
	
	// 학생성적 평균
	
	
	// 학생성적순 출력
}
