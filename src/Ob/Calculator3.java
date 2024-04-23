package Ob;

public class Calculator3 {

    public static void  sum(int left, int write){
        System.out.println(left + write);
    }

    public static void avg(int left, int write){
        System.out.println((left + write)/2);
    }

    public static void main(String[] args) {

        Calculator3.sum(10,20);
        Calculator3.avg(10,20);
    }
}
