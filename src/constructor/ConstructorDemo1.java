package constructor;

class Calculator  {
    int left,right;

    public Calculator(int left,int right) { //클래스에 클래스명과 똑같은 Caculator라는 메소드(생성자 혹은 콘스트락토)가 있다.
        this.left = left;                   // 매개변수 left,right --> 전역변수의 위의 값을 셋팅한다.
        this.right = right;                 // 생성자 혹은 콘스터럭터
                                            // 클래스명과 똑같은명의 메서드 --> 어떤 메서드보다 먼저 실행되도록 약속 되어있음
//        반드시 먼저 선행되어야하는 호출 메서드
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

public class ConstructorDemo1 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(5,5); //그러므로 객체를 생성하는 것이라고도 설명할 수 있지만
                                                        //  new - (인스턴스)생성자를 사용해서
                                                        // 이 생성자를 이용하여 클래스를 구체화 시킨 인스턴트가 c1
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20,30);
        c2.sum();
        c2.avg();

    }
}
