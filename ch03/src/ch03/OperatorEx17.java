package ch03;
// 예제 3-17
public class OperatorEx17 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0; // 소수점 넷째자리에서 반올림
		System.out.println(shortPi);
	}
}
