package ch02;
// 예제 2-7
public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65;
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code); // A=65(0X41)
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch); // 가=44032(0XAC00)
	}

}
