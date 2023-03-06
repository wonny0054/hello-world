package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위가 있는 경우)
        int ranking = 4;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // Case 탈출
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // Case 2와 3을 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // Case 탈출
            case 2: // break 없으면 다음 Case 실행
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // break 제거 : 줄줄이 연산
        // 중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
