package scope;

public class ScopeDemo2 {
    static int i=0; // 전역변수 global valuables (클래스변수/정적변수)
                    //클래스 바로 밑에서 선언 --> 어디에 속해있지 않고
                    //클래스 직속
    static void a(){
        i=0; //위의 전역 변수로서 선언된 i를 할당
    }

    public static void main(String[] args) {

        for (i=0;i<5;i++){ // 위에 전역변수로서 선언한 i를 할당만했음
        a(); // 불러낸 메서드의 기능은 전역변수로서 선언된 i의 값을 다시 0으로 할당한다. 그러므로 전역변수가 바뀌므로 영향을 미친다.
             //그러므로 i는 영원히 0이 된다.
            System.out.println(i);
            //메인부터 시작한다.
        }
    }
}
