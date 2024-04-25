package scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); //중괄호 밖에 있기 때문에 존재하지 않는 변수 취급해버림
    }

}
