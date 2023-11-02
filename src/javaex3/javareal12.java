package javaex3;

public class javareal12 {
    public static void main(String args[]){
        int sum =0;
        for(int  i=0;i< args.length;i++){
            try{sum += Integer.parseInt(args[i]);}
            catch (NumberFormatException){
                args[i]=0;
            }
        }
        System.out.print(sum);
    }
}
