import org.w3c.dom.ls.LSOutput;

public class VarEx2 {
    public static void main(String[] args) {
        // 두 변수의 값 교환하기
        int x = 10, y = 20;
        int tmp = 0;
        System.out.println("X: " + x + " Y :" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("X: " + x + " Y :" + y);
    }



}
