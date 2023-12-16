package ch03;
// 예제 3-9
public class OperatorEx9 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000; // int타입과 int타입의 연산 = 오버플로우 발생
		long b = 1_000_000 * 1_000_000L; // int타입과 long타입의 연산 = > 결과가 long타입
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
