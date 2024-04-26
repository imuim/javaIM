package Ob;

class MultiplicationableCalculator extends Calcurator {
    public void multiplication(){
        System.out.println(this.left *this.right);
    }
}
public class CaculatorDemo2 {

    public static void main(String[] args) {

        MultiplicationableCalculator m1= new MultiplicationableCalculator();
        m1.setOper(100,20);
        m1.avg();
        m1.sum();
        m1.multiplication();
    }
}
