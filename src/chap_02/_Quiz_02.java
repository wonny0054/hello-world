package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        String result1 = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result1);

        height = height + 6;
        String result2 = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result2);

    }
}
