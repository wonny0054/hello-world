import java.util.Scanner;

public class Gugudan_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        String[] splitedValue = inputValue.split(",");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        int[] result = new int[second];

        while (first > 2 && first <= 19) {
            for (int i = 2; i < first; i++) {
                for (int j = 0; j < second; j++) {
                    result[j] = i * (j + 1);
                    System.out.println(result[i]);
                }
            }
        }
    }
}
