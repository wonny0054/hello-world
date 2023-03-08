public class Main {
    public static int plus(int index) {
        int n = 0;
        int i = 1;
        while (i <= index) {
            n = n + i;
            i = i + 1;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(plus(100));
        System.out.println(plus(200));
        System.out.println(plus(300));
    }
}