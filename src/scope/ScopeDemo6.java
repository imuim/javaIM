package scope;

public class ScopeDemo6 {
    static int i = 5;

    static void a() {
        int i = 10;
        b();
    }

    static void b() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        a(); //전역변수 i를 출력 a 메서드 내의 지역변수였던 int i=10은 상관없음
    }

}
