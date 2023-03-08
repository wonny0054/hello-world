public class Gugudan_Array {
    public static void main(String[] args) {
        // 8단
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = 8 * (i + 1);
        }

        // 배열(다중 배열 포함)은 안에 있는 내용을 바로 출력할 수 없고, 배열 안의 원소에 직접 접근하여 출력해야합니다.
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}
