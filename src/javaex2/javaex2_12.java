package javaex2;

import java.util.Scanner;

public class javaex2_12 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        char grade;

        System.out.print("성적을 입력하시오");
        int num = s.nextInt();

        if(num >=90)
            grade='A';
        else if (num>=80)
            grade='B';
        else if (num>=70)
            grade='C';
        else
            grade='F';
        System.out.print("학점은"+grade+"입니다");

        s.close();
    }
}
