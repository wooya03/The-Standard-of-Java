package ch03;
// 예제 3-22
public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f); // 오차 없이 저장할 수 있는 값
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f); // 오차가 발생
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n",d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d == f %b%n", d == f);
		System.out.printf("d == d2 %b%n", d == d2);
		System.out.printf("d2 == f %b%n", d2 == f);
		System.out.printf("(float)d == f %b%n", (float)d == f);
	}
}
