package javaex4;

public class Circle {
    int radius;
    String name;

    public double getArea(){
        return radius*radius*3.14;
    }

    public static void main(String args[]){
        Circle pizza = new Circle();
        pizza.radius=10;
        pizza.name = "페퍼로니 피자";
        double area1 = pizza.getArea();;
        System.out.print(pizza.name + "의 면적은 " + area1);
        System.out.println();

        Circle donut = new Circle();
        donut.radius =5;
        donut.name = "던킹도넛";
        double area2= donut.getArea();;
        System.out.print(donut.name+"의 면적은 "+area2);
    }

}

