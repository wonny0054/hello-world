package chap_01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus_call_name = "상암08";
        int minutes = 5;
        float distance_remaining = 1.2f;
        System.out.println(bus_call_name + "번 버스");
        System.out.println("약 " + minutes + "분 후 도착");
        System.out.println("남은 거리 " + distance_remaining + "km");

    }
}
