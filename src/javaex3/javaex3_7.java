package javaex3;

import java.util.Scanner;

public class javaex3_7 {
    public static void main(String args[]){
        int intArray[] = new int[5];
        Scanner s =new Scanner(System.in);

        System.out.print("정수 5개를 입력하시오.");

        int max = 0;

        for(int i=0; i<5; i++){
            /*int num = s.nextInt();
            intArray[i]=num;*/
            intArray[i] = s.nextInt();
            if(intArray[i]>max){
                max = intArray[i];
            }
        }
        System.out.print("가장 큰수는 "+max+"입니다.");
        s.close();
    }
}
