package Ob;

//setOper(int left, int right) 메서드를 만든 이유는 이 클래스의 인스턴스 변수인 left와 right를 설정하기 위해서입니다. 이 메서드를 사용하여 외부에서 left와 right 값을 설정할 수 있습니다. 이를테면, Calcurator 객체를 생성한 후에 setOper 메서드를 호출하여 left와 right 값을 설정하면, 해당 값들이 메서드 내부에서 인스턴스 변수에 할당됩니다.
//
//메서드를 사용하면 외부에서 클래스의 인스턴스 변수에 직접적으로 접근하지 않고도 값을 설정할 수 있습니다. 이는 정보 은닉(Encapsulation)의 개념에 부합합니다. 정보 은닉은 객체의 상태를 보호하고 객체 간의 결합도를 낮추는 데 도움이 됩니다. 따라서, 프로그램의 유지 보수성과 확장성을 향상시킬 수 있습니다.
//
//또한, 이러한 메서드를 통해 값을 설정할 때 유효성 검사나 추가적인 로직을 수행할 수도 있습니다. 이는 무효한 값을 방지하고 안전한 실행을 보장하는 데 도움이 됩니다.
public class Calcurator {

    int left;
    int right;

    public void setOper(int left, int right ){

        this.left=left; //밑에 선언 타고 올라온 위의 left/right 바로 이거라는 뜻
        this.right=right;

    }
    public void sum(){
        System.out.println(this.left+this.right);
    }

    public int avg(){
//
        return((this.left+this.right)/2);
    }

}

class SubstractionableCaculator extends Calcurator{

    @Override
    public void sum() { //@Override 부모가 이미 가지고 있는 sum을 재정의하고자한다. 위의 @Override 쓰고 하면 가능
        System.out.println("실행결과는 "+(this.left+this.right)+"입니다.");
    }

    public void substract(){
        System.out.println(this.left-this.right);
    }

    public int avg(){
//        return (this.left+this.right)/2;
// 부모의 클래스와 같이 중복되므로 아래와 같이 사용한다.
        return super.avg();//슢퍼는 부모클래스를 말함. 부모객체가 가지고 있는 에버리지라는 메서드를 호출한다. 부가적으로 이하에 다른 기능의
        //메서드로직을 추가하면 된다.
    }



    public static void main(String[] args) {

//        Calcurator c1 = new Calcurator(); // 오브젝트(객체생성) -->c1 (구체적 객체(제품)인-인터페이스)
//        c1.setOper(10,5);       // 구체적 인터페이스(객체)의 설계에 해당하는 클래스
//        c1.sum();
//        c1.avg();

        //객체를 만든다는 것은 다른의미로 사용자가 직접 정의하는 데이터 타입을 만든다고도 할 수 있다.
        //그래서 클레스 혹은 객체를 만들면 어쨌든 데이터를 할당할 자리를 만들고 변수를 넣는 행위라고도 볼수있다.
        // 클래스는 설계도(1개만있어도됨) ---> 여기에 맞춰서 만들어진 구체적 제품(여러개가있을수있음) -->인스턴스를 구분할수있는 단 변수에 따라
        // 인스턴스의 상태가 다르다 이 상태에 따라 인스턴스에 어떤 행위를 하게되면 (메소드를 실행하는 것 )  -> 다른 결과를 내준다.

        //c1 c2의 서로 다른 값의 변수를 소유하고 있다.
        // 인스턴스의 소유가 아닌 변수가 있을 수 있나? 있다. 클래스의 소유인 변수가 있다. 다른 특성도 가지고 있다.

        SubstractionableCaculator c1 = new SubstractionableCaculator();
        c1.setOper(20,10);
        c1.substract();
        c1.avg();
          c1.sum(); //SubstractionableCaculater는 sum이라는 메서드를 가지고 있지않다. 부모인 calculator에 sum이 있는지 찾고 출력
                    //overide로 부모클래스를 상속한 자식클래스에서 재정의한다면 재정의한 메서드에서 출력 //부모클래스의 메서드는 무시됨 이것이 메서드
                    //오버라이딩이라고함
                    //오버라이딩시 부모와 자식의 메서드 이름 그리고  리턴 데이터타입과 매개변수 일치해야한다. --메서드의 시그니쳐라고 얘기함

    }
}
