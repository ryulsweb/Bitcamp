package file01;

import java.io.File;
import java.io.IOException;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * file은 기능이다.
		 * 
		 * 기능부분 : file, upload logic 부분 : 직접 구현해야함 ex) Dao, Dto, model
		 * 
		 * window → 파일로 이루어져있음		 *.lib 		*.dll 
		 * 								library      (dynamic link library) 
		 * 								<정적파일>      <동적파일>
		 *                              메모리 점령 		   가볍다
		 *                              필요시 정보를 읽음    해킹에 취약
		 *                              보안에 강함   
		 *                              
		 *                              *.jar
		 * 
		 * 저장매체 → 데이터 → file, Database(file)
		 *
		 * ex) 데이터 : 이름, 나이, 주소 >> 항목 열
		 *           홍길동   24    서울시 → parsing 
		 *                           parser → 파싱하는 프로그램
		 * 
		 * *.txt
		 * 
		 * 파일(Database) 목적 : 데이터관리, 저장, 유지 CRUD 추가(insert), 삭제(delete), 읽기(read),
		 * 쓰기(write) 검색(search, select), 수정(update)
		 * 
		 * 제일 큰 목적? 읽기(read), 쓰기(write)
		 * 
		 */

		// ******** 파일 목록(파일검색) ********
		File fdir = new File("c:\\");

//		String filelist[] = fdir.list();
//		for (int i = 0; i < filelist.length; i++) {
//			System.out.println(filelist[i]);
//			// c드라이브에 있는 파일들을 검색
//			
//			// swapfile.sys → 숨겨진 파일
//		}

		// ******** 파일 포인터 ********
		File filelist[] = fdir.listFiles();
		// 파일이 배열로 넘어옴 파일이냐 폴더냐 구분

		for (int i = 0; i < filelist.length; i++) {

			if (filelist[i].isFile()) {
				System.out.println("[파일]" + filelist[i].getName());
			} else if (filelist[i].isDirectory()) {
				System.out.println("[폴더]" + filelist[i].getName());
			} else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}

		// ******** 파일 생성 ********
		String fileStr = "d:\\tmp\\newfile.txt";
		File newFile = new File(fileStr);
		// File() 그냥 문자열을 바로 집어넣어도됌
		try {
			if (newFile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			} else {
				System.out.println("파일 생성 실패!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ******** 폴더 생성 (2가지) ********
		String dirStr = "d:/tmp1/sub";
		// String dirStr = "d:\\tmp\\sub";
		// 원래 tmp만 만들어짐 > if문의 .mkdir()을 썼기때문
		// 다른 폴더 생성 하고 싶다면 if문에 .mkdirs()

		File newDir = new File(dirStr);

		if (newDir.mkdirs()) {
			System.out.println("폴더 생성 성공!");
		} else {
			System.out.println("폴더 생성 실패!");
		}

		String filename = "newfile1" + ".txt";
		File myfile = new File(dirStr + "\\" + filename);

		try {
			if (myfile.createNewFile()) {
				System.out.println(filename + "파일 생성 성공!");
			} else {
				System.out.println(filename + "파일 생성 실패!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ******** 파일 존재 여부 (.exists()) ********
		if (myfile.exists()) {
			System.out.println("파일이 존재합니다.");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

		// ******** 파일 삭제 (.delete()) ********
		// 파일을 삭제 하지 못하는 경우? 파일이 없거나, 보안이 걸려있는 경우
//		if (myfile.delete()) {
//			System.out.println("파일을 삭제했습니다.");
//		}else {
//			System.out.println("파일을 삭제하지 못했습니다.");
//		}

		// myfile.setReadOnly(); // 쓰기가능한지 한줄

		// ******** 읽기 가능 여부(canRead()) ********
		if (myfile.canRead()) {
			System.out.println("파일 읽기가 가능합니다.");
		} else {
			System.out.println("파일 읽기가 불가능합니다.");
		}

		// ******** 쓰기 가능 여부(canWrite()) ********
		if (myfile.canWrite()) {
			System.out.println("파일 쓰기가 가능합니다.");
		} else {
			System.out.println("파일 쓰기가 불가능합니다.");
		}

	}
}
