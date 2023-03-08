public class Gugudan_3 {
    public static void main(String[] args) {
        int[] result = new int[9];

        for(int j=2; j < 10; j++) {
            for (int i = 0; i < result.length; i++) {
                result[i] = j * (i + 1);
                System.out.println(result[i]);
            }
            // 앞 단계 실습을 참고해 반복문을 활용해 result 배열에 결과 값을 담고 출력
        }

    }
}
