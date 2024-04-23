package io;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//new Scanner-->스캐너라는 객채를 만든다. 그리고 System.in 사용자가 입력한 값을 sc에 넣는다.
        int i = sc.nextInt();//sc nextint();라는 메서드를 실행 입력한 값이 i에 담김
        System.out.println(i*1000);
        sc.close();
    }
}
