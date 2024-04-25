package scope;


public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
        //title 의 선언에 보이지 않기때문에 실행 되지 않는다.

    }

}
