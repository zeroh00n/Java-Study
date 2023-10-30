package javaex3;
public class javareal7 {
    public static void main(String args[]){
        int num[] = new int[10];
        double sum = 0;

        System.out.print("랜덤한 정수들 :");
        for(int j =0;j<num.length;j++){
            num[j] = (int)(Math.random()*10+1);
            sum += num[j];
            System.out.print(num[j]+" ");
        }
        System.out.print("평균은 " +sum/10);

    }
}
