package ch03;
// 예제 3-13
public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1+1;  // 컴파일 에러 발생
		char c2 = 'a'+1; // 컴파일 에러 없음. 리터럴 간의 연산
		
		System.out.println(c2);
	}
}
