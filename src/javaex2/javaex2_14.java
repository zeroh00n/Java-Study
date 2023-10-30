package javaex2;

import java.util.Scanner;

public class javaex2_14 {
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);
        char grade;

        System.out.print("성적 입력");
        int score = s.nextInt();

        switch (score/10){
            case 10:
            case 9:
                grade ='A';
                break;
            case 8:
                grade ='B';
                break;
            case 7:
                grade ='C';
                break;
            case 6:
                grade ='D';
                break;
            default:
                grade = 'F';
        }
        System.out.print("학점은"+grade+"입니다.");
        s.close();
    }

}
