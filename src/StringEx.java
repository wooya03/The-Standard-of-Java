public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // int 산수를 먼저 수행한 다음 string으로 변환
        System.out.println("" + 7 + 7); // sring으로 변환한 다음 수행하여 77


    }

}
