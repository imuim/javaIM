package method;

public class MethodDemo1 {
    public  static  void  nubering(int limit){//int limit 매개변수=파라미터 입력값을 수용하기 위한 변수의 정의
        int i=0;
        while(i<limit){
            System.out.println(i);
            i++;
        }
    }


    public static void main(String[] args) {
    nubering(5);//위(메인메서드)의 위의 numbering메서드가 호출된다. 인자/인수 --- argument
        //{}--->정의 ()--->호출
        // 이미 정의한 로직을 리플레이(재활용)할 수 있다.
        // 인자를 주고 인자의 값을 파라미터로 받아 값을 세팅함으로 넘버링이라는 메소드의 활용성을 높이게 된다.
    }
}
