package ch03;
// 예제 3-10
public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		int result1 = a * a / a; // 오버플로우 발생
		int result2 = a/ a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}
}
