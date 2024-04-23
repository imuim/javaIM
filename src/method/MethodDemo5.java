package method;

public class MethodDemo5 {
    public static void numbering(int init, int end) {
        int i= init;
        while (i <= end) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering(10, 20);
        //리턴을 쓰는 이유는 출력 이외에 값을 화면상에 띄우거나 메일로 보내는 등의 일을 한다고 가정했을때에
        //또 메서드를 만들 필요와 수정 없이 값을 리턴으로 밖에 반환하여 격납하여 출력하여 보내버리면 되기 때문이다.
    }
}
