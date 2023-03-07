package chap_06;

public class _07_VariableScope {
    // 지역변수, 같은 중괄호 내에 있는 변수만을 사용 가능, 메소드 이용시 전달값을 설정하고 호출
    public static void methodA(int number) {
        // System.out.println(number);
        // System.out.println(result);
    }

    public static void methodB() {
        int result = 1;
    }

    public static void main(String[] args) {
        int number = 3;
        System.out.println();

        // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
}
