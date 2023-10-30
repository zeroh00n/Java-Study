package javaex2;

import java.util.Scanner;

public class javaex2_11 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하시오");
        int num = s.nextInt();

        if(num%3==0){
            System.out.print("3의 배수입니다.");
        }
        else         System.out.print("3의 배수가 아닙니다");

        s.close();
    }
}
