package javaex3;

public class javareal11 {
    public static void main(String args[]){
        int sum =0;
        for (int i=0;i<args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.print(sum/ args.length);
    }
}
