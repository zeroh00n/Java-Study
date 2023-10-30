package javaex2;

import java.util.Scanner;

public class javaex2_4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("초단위의 정수를 입력하시오 : ");
        int time = s.nextInt();

        int hour = (time/60)/60;
        int minute = (time/60)%60;
        int second = time%60;

        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.print(second + "초 입니다.");
        s.close();
    }
}
