package javaex3;

import java.util.Scanner;

public class javareal8 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.print("저장할 정수의 개수를 입력하시오 : ");
        int i = s.nextInt();
        int intArray[] = new int[i];
        for(int j=0;j<intArray.length;j++) {
            intArray[j] = (int) (Math.random() * 100 + 1);
            for (int x = 0;x<j;x++){
                while (true){
                    if(intArray[j] != intArray[x])
                        break;
                    else {
                        intArray[j] = (int)(Math.random()*100+1);
                        j=0;
                    }
                }
            }
        }
        for (int j = 0;j< intArray.length;j++){
            System.out.print(intArray[j] + " ");
        }
        s.close();


    }
}
