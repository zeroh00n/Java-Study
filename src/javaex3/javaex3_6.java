package javaex3;

import java.util.Scanner;

public class javaex3_6 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("exit를 입력하면 종료합니다.");
        while(true){
            String e = s.next();
            System.out.print(e);
            if(e.equals("exit"))
                break;
        }
        System.out.println("종료합니다");

        s.close();
    }
}
