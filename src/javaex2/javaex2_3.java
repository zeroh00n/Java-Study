package javaex2;

import java.util.Scanner;

public class javaex2_3 {
    public static void main(String args[]){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력하시오 : ");
        Scanner s = new Scanner(System.in);

        String name = s.next();
        System.out.println("name : " + name);

        String city = s.next();
        System.out.println("city : " + city);

        int age = s.nextInt();
        System.out.println("age : " + age);

        double weight = s.nextDouble();
        System.out.println("weight : " + weight);

        boolean isSingle = s.nextBoolean();
        System.out.print("isSingle : " + isSingle);

        s.close();
    }
}
