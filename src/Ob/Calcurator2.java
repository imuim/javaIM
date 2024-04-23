package Ob;

public class Calcurator2 {
    int right;
    int left;
    static  double PI = 3.14; //스테틱한 변수 --> 클래스에 소속된다는 의미 모든 메서드 모든 인스턴스에서 동일한 값으로 가지게 됨을 의미
    static int base=0; //위와 동일하게 스테틱한 변수 클래스 변수인 베이스를 추가하였다. 클래스의 멤버가 된다.


    public void setOprand(int left,int right){
        this.left=left;
        this.right=right;
    }
    public void sum(){
        System.out.println(this.left+this.right+base);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }


    public static void main(String[] args) {

        Calcurator2 cal2 = new Calcurator2(); // 객체 및 인스턴트 생성
        cal2.setOprand(2,4);
        cal2.sum();
        cal2.avg();
        Calcurator2.base=10;


        cal2.setOprand(10,20);
        cal2.sum();
        System.out.println(cal2.PI); //인스턴트를 통해 호출
        System.out.println(Calcurator2.PI); //클래스를 통해 호출


    }
}
