package Ob;

import org.w3c.dom.ls.LSOutput;

class DibisionableCalcurator extends MultiplicationableCalculator {
    public void dibision() {
        System.out.println(this.left/this.right);
    }
}

public class DivisionableCalcurator {
    public static void main(String[] args) {
        DibisionableCalcurator dib = new DibisionableCalcurator();

        dib.setOper(20,10);
        dib.avg();
        dib.sum();
        dib.multiplication();
        dib.dibision();

    }
}
