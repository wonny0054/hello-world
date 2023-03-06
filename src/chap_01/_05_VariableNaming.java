package chap_01;

public class _05_VariableNaming {
    //변수이름 짓는법
    // 1. 저장할 값에 어울리는 이름
    // 2. 밑줄, 문자, 숫자 사용가능 (공백은 사용불가능
    // 3. 밑줄 또는 문자로 시작 가능
    // 4. 한 단어 또는 2개 이상 단어의 연속
    // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
    // 6. 예약어 사용 불가 (public, static, void, int, double, float, ..)

    // 입국 신고서(여행)
    String nationality = "대한민국"; // 국적
    String firstName = "민겸"; //이름
    String lastName = "심"; //성
    String dateOfBirth = "1996-10-25"; // 생년월일
    String residentialAddress = "호텔"; // 체류지
    String purposeOfVisit = "관광"; // 입국목적
    String flightNo = "KE657";
    String _flightNo = "KE657";
    String flight_no_2 = "KE657";
    //String -flightNo = "KE657";

    int accompany = 2;
    int lengthOfStay = 5;

    String item1 = "시계";
    String item2 = "가방";
    //String 3item = "우산";

    // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름 중요하지 않을 때)
    int i = 0;
    String s = "";
    String str = "";

    // 절대 변하지 않는 상수는 대문자로
    final String CODE = "KR";

}
