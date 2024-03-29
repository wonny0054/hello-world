package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2); // 나머지 연산
        System.out.println(5 % 2);

        // 연산 우선 순위
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val); // 미리 val의 값에 +1
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++); // 다음 연산에서 val의 값에 +1
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val); // 미리 val의 값에 -1
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--); // 다음 연산에서 val의 값에 -1
        System.out.println(val);

        // 은행 대기번호표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : "  + waiting);
    }
}
