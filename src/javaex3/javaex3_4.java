package javaex3;

public class javaex3_4 {
    public static void main(String args[]){
        int i, j =0;
        for(i=1;i<10;i++){
            for(j=1;j<10;j++){
                System.out.print(i+" * "+j+" = "+i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
