package javaex3;

public class javareal9 {
    public static void main(String args[]){
        int n[][] = new int[4][4];

        for (int i =0;i<4;i++){
            for (int j = 0;j<4;j++){
                n[i][j] = (int)(Math.random()*10+1);
                System.out.print(n[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
