import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass {
	public static void main(String[] args) {

		// ********* Exception << 이것만 적어주면됀다. 아래는 외우지않아도 됌.

		// ********* NullPointerException *********
		// << 많이 나옴
		String str = null;

		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("str이 할당 되지 않았습니다.");
		}

		// ********* ArrayIndexOutOfBoundsException *********
		// << 많이 나옴

		int arr[] = { 2, 4, 6 };

		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		}

		// ********* FileNotFoundException *********
		// 요즘 중요
		File file = new File("c:\\xxx.txt");

		FileInputStream is;

		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}

		// ********* NumberFormatException *********
		// << 많이 나옴
		int num;

		try {
			num = Integer.parseInt("123.456");
		} catch (NumberFormatException e) {
			System.out.println("형식이 다릅니다.");
		}

		// ********* StringIndexOutOfBoundsException *********
		String str1 = "abc";

		try {
			str1.charAt(3);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index 범위 초과");
		}
	}
}
