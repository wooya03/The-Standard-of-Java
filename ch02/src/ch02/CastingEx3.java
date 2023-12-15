package ch02;
// 예제 2-14
public class CastingEx3 {
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f=%20.18f\n", f);
		System.out.printf("f=%20.18f\n", d);
		System.out.printf("f=%20.18f\n", d2);
		// 같은 값을 저장해도 float와 double의 정밀로 차이 때문에 서로 다른 값이 저장됨
		// 저장할 때 이미 값이 달라졌기 때문에, 형변환을 해도 값이 같아지지 않음
	}
}
