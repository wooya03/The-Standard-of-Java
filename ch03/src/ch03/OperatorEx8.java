package ch03;
// 예제 3-8
public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // int타입과 int타입의 연산결과는 int타입
		
		System.out.println(c);
	}
}
