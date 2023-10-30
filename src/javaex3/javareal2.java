package javaex3;

import java.util.Scanner;

public class javareal2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("영문자 하나를 입력하시오.");
        String c = s.next();
        switch (c){
            case "a":
            case "e":
            case "u":
            case "i":
            case "o":
                System.out.print("모음입니다.");
                break;
            default:
                System.out.print("자음입니다.");
        }
        s.close();
    }
}
