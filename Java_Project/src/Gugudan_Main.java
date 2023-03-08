public class Gugudan_Main {
    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            Gugudan_Method.calculate(j);
            Gugudan_Method.print(Gugudan_Method.calculate(j));
        }
    }
}
