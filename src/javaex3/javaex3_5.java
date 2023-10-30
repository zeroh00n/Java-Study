package javaex3;

import java.util.Scanner;

public class javaex3_5 {
    public static void main(String Args[]){
        Scanner s =new Scanner(System.in);
        int sum = 0;

        System.out.print("정수 5개를 입력하시오");
        for(int i =0 ;i<5;i++){
            int n = s.nextInt();
            if(n<0)
                continue;
            else
                sum +=n;
        }
        System.out.print("="+sum);
    }
}
