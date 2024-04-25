package scope;

class C {
    int v=10;

    void m() {
        int v=20; //이 과정에서 메서드 내에서 선언된 지역변수 v와 밖에서 선언된 전역변수가 경합 그러므로 결과값은 20
         System.out.println(v);
        System.out.println(this.v);// C1 인스턴스 자신을 this로 표현 그리므로 인스턴트의 v
    }
}

public class ScopeDemo7 {

    public static void main(String[] args) {

        C c1=new C();
        c1.m();

    }
}
