package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 구매가능한 신발 사이즈 옵션
        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지

        /*
        int size = 250;
        int differ = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + (size + (differ * i)) + " (재고 있음)");
        }

         */
        
        int[] sizeArray = new int[10];

        for (int i = 0; i < sizeArray.length; i++) {
            //System.out.println(250 + (i * 5));
            sizeArray[i] = 250 + (i * 5);
        }

        for (int size : sizeArray ) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
