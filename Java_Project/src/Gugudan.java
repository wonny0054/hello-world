public class Gugudan {
    public static void main(String[] args) {
        // 2단
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);

        // 3단
        System.out.println(3 * 1);
        System.out.println(3 * 2);
        System.out.println(3 * 3);
        System.out.println(3 * 4);
        System.out.println(3 * 5);
        System.out.println(3 * 6);
        System.out.println(3 * 7);

        // 4단
        int result = 4 * 1;
        System.out.println(result);

        result = 4 * 2;
        System.out.println(result);

        // 구구단 출력하는 예제 구현
        // 5단
        int number = 5;
        int i = 1;
        while (i < 10) {
            System.out.println(number * i);
            i++;
        }

        // 6단
        number = 6;
        for (int j = 1; j < 10; j++) {
            System.out.println(number * j);
        }

        System.out.println("----------------------");

        // 7단
        number = 7;
        if (number < 2) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else if (number > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {
            for (int j = 1; j < 10; j++) {
                System.out.println(number * j);
            }
        }


    }

}