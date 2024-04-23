package method;

public class MethodDemo6 {

    public static String nubering(int init, int limit) {
        int i = init;
        //만들어지는 숫자들을 output이라는 변수에 격납하기위해 빈 값을 줌
        String output = "";
        while (i < limit) {
            output += i; // output=output+i;
            i++;
        }
    return output; // 리턴에서 프로그램을 반드시 종료시킨다.
                   // 그러므로 아웃풋에 담겨져 있는 값이 메서드 바깥으로 반드시 반환된다.
    }
    public static void main(String[] args) {

        String result = nubering(1,5);
        // 1. 먼저 메인을 본다. 입력값의 인자를 1과 5로 주어 result에 저장한다.
        System.out.println(result);
        //화면의 출력하는 내용이 데모 5랑은 다르게 메인에 있다. 대신 리턴이라는 값이 메서드안에 존재함
    }
}
