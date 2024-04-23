package io;

import java.util.Scanner;

public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){//sc~~ 는 일시적으로 자바를 멈추고 enter 값으로 반환되어 넣은 값이 int일때
                            //true가 되어 동작한다.
            System.out.println(sc.nextInt()*1000);
        };
        sc.close();
    }
}
