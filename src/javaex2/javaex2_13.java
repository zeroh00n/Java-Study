package javaex2;

import java.util.Scanner;

public class javaex2_13 {
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("학년과 점수를 입력하시오");
        int year = s.nextInt();
        int score = s.nextInt();

        if(score>=60) {
            if (year < 4)
                System.out.print("합격");
            else if (score >= 70)
                System.out.print("합격");
            else
                System.out.print("불합격");
        }
            else
                System.out.print("불합격");


        s.close();
    }
}
