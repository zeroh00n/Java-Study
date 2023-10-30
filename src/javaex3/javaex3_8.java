package javaex3;

import java.util.Scanner;

public class javaex3_8 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int intArray[] = new int[7];
        int sum = 0;
        int size = intArray.length;
        System.out.println(size + "개의 정수를 입력해주세요.");

        for(int i =0; i<size;i++){
            intArray[i] = s.nextInt();
            sum += intArray[i];

        }
        System.out.print("평균은 "+sum/size+"입니다.");
        s.close();


    }
}
