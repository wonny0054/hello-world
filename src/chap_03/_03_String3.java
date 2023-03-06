package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없음

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용을 비교
        System.out.println(s1 == s2); // 참조하는 것을 비교

        s1 = new String("1234"); // 각각의 서로 다른 메모지
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
