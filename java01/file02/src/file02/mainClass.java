package file02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class mainClass {
	public static void main(String[] args) throws Exception {
		// file read
		
		File file = new File("d:\\tmp\\newfile.txt"); 
		// 일단 파일을 갖고온다
		
		FileReader fr = new FileReader(file);
		// 인셉션이 걸림 > try catch 해주거나 메인에 
		// throws Exception를 붙여준다.
		
		// 한 문자씩 읽어 들인다.
//		int c = fr.read();
//		while (c != -1) {	// -1 == 파일 끝
//			System.out.println((char)c);
//			c = fr.read(); 	// c를 갱신해주면서 감
//		}
		
		// 위와 동일한 처리. 하지만 사용하기 껄끄럽다.
//		int c;
//		while((c = fr.read()) != -1) {	// -1 == 파일끝
//			System.out.print((char)c);	
//		}
		
		// Buffer == 저장공간
		BufferedReader br = new BufferedReader(fr);
		// 내부에서 문장씩
		
//		String str = br.readLine();
//		while(str != null) {
//			System.out.println( str );
//			str = br.readLine();
//		}
//		br.close();
		
		// 위와 동일 처리
		String str;
		while((str = br.readLine()) != null) {
			System.out.println( str );
		}
		br.close();
		
	}
}
