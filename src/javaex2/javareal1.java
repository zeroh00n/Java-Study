package javaex2;

import java.util.Scanner;

public class javareal1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("정수의 원화 입력 : ");
        int won = s.nextInt();
        int dal = won/1100;
        int na = won%1000;

        System.out.print("달러는 : "+ dal + "$ ,"+ "잔돈은 : " + na + "원입니다.");

        s.close();
    }
}
