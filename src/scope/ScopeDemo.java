package scope;

public class ScopeDemo {

    static void a () {
        int i=0; //지역변수 local valuables
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){ //유효범위=Scope
            a();//해당 변수는 메소드 내에서만 유용하다.
            System.out.println(i);
            //위의 로직 대로라면 0이 무한대로 출력되어야한다.
            // 0부터 시작하여 a()메서드를 거친다면 0으로 초기화 되어버리기 때문이다.
            // 그렇지만 유효범위라는 개념이 적용되어 해당 초기화는 a메서드 안에서만 유효한 것이되어 버리기 때문에
            //0-4까지 차례대로 출력되어지는 출력이 발생하게된다.
    }


    }
}
