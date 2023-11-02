package javaex4;

import java.util.Scanner;

public class Rectangle{
    int width;
    int height;

    public int getArea(){
        return width*height;
    }
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.print(">>");
        rect.width = s.nextInt();
        rect.height = s.nextInt();
        int area = rect.getArea();
        System.out.print("사각형의 면적은"+area+"입니다.");
        s.close();


    }
}


