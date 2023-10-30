package javaex2;

import java.util.Scanner;

public class javaex2_15 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
         System.out.print("무슨 커피드릴까요?");

         String cof = s.next();
         int price=0;//0으로 초기화 안 시켜주면 오류남

         switch (cof){
             case "에스프레소" :
             case "카푸치노":
             case "카페라떼":
                 price = 3500;
                 break;
             case "아메리카노":
                 price = 20000;
                 break;
             default:
                 System.out.print("없는 메뉴 입니다.");

         }
         System.out.print("가격은"+price+"입니다.");
        s.close();
    }
}
