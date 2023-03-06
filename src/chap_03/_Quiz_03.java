package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String Person1 = "901231-1234567";
        System.out.println(Person1.substring(0, 8));
        System.out.println(Person1.substring(0, Person1.indexOf("-") + 2));

        String Person2 = "030708-4567890";
        System.out.println(Person2.substring(0, 8));
        System.out.println(Person2.substring(0, Person2.indexOf("-") + 2));
    }
}