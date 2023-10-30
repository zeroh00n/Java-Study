package javaex3;

import java.util.Scanner;

public class javaex3_2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count = 0;
        int sum =0;

        System.out.println("정수 여러개를 입력하시고 마지막에 -1 을 입력해 주세요");
        int n = s.nextInt();
        while(n != -1){
            sum += n;
            count++;
            n = s.nextInt();

        }
        if(count == 0)
            System.out.print("입력된 수가 없습니다.");
        else{
             System.out.print("입력된 정수의 개수는 "+count+"개이고 평균은" + sum+"입니다.");
        }
        s.close();
    }

}
