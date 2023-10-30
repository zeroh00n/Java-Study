package javaex2;
import java.util.Scanner;


public class javareal2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("정수로 된 돈의 액수를 입력");

        int money = s.nextInt();
        int one = money%10;
        int ten = (money%50)/10;
        int fifty = (money%100)/50;
        int hun = (money%500)/100;
        int fh = (money%1000)/500;
        int so = (money%10000)/1000;
        int mi = (money%50000)/10000;
        int fm = money/50000;

        System.out.println("오만원권"+ fm + "매");
        System.out.println("만원권"+ mi + "매");
        System.out.println("천원권"+ so + "매");
        System.out.println("오백원권"+ fh + "매");
        System.out.println("백원권"+ hun + "매");
        System.out.println("오십원권"+ fifty + "매");
        System.out.println("십원권"+ ten + "매");
        System.out.println("일원권"+ one + "매");
        s.close();
    }
}
