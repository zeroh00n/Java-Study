package javaex2;

import java.util.Scanner;

public class javaex2_10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("점수 입력");
        int score = s.nextInt();

        if(score>=80){
            System.out.print("합격입니다.");
        }

        s.close();
    }
}
