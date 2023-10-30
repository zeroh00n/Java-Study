package javaex3;

import java.util.Scanner;

public class javaex3_10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double score[][] = new double[4][2];
        int sum=0;

        System.out.print("1,2학기 성적을 입력하시오.");
        for(int i=0;i<4;i++){
            System.out.print(i+"학년의 1,2학기 성적을 입력하시오.");
            for(int j=0;j<2;j++){
                sum += score[i][j];
            }
        }
        int n = score.length;
        int m = score[0].length;
        System.out.print("전체 평균은 "+ sum/(n*m));
        s.close();
    }
}
