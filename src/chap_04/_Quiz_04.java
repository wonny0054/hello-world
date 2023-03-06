package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산 프로그램 (차근차근 해야함)
        int hour = 10;
        boolean disabled = true;
        boolean smallCar = false;

        int fee = hour * 4000;

        if (disabled || smallCar) {
            if (fee <= 30000) {
                System.out.println("주차 요금은 " + fee / 2 + "원입니다.");
            }
            else {
                System.out.println("주차 요금은 " + 30000 / 2 + "원입니다.");
            }
        }
        else {
            if (fee <= 30000) {
                System.out.println("주차 요금은 " + fee + "원입니다.");
            }
            else {
                System.out.println("주차 요금은 " + 30000 + "원입니다.");
                }
            }

        System.out.println("---------------");

        // 일일 30000원 초과
        if (fee > 30000) {
            fee = 30000;
        }

        // 장애인이거나 경차인경우
        if (disabled || smallCar) {
            fee /= 2;
        }

        // 실행결과
        System.out.println("주차 요금은 " + fee + "원입니다.");



    }
}
