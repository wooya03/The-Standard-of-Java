package ch02;
// 예제 2-8
public class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워짐
		System.out.println('\n'); // 개행 문자 출력하고 개행
		System.out.println("\"HELLO\"");
		System.out.println("c:\\");
	}
}
