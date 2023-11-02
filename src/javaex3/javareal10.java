package javaex3;

public class javareal10 {
    public static void main(String args[]){
        int n[][] = new int[4][4];
        int r = 0;

        while(r <10){
            int p1 = (int)(Math.random()*4);
            int p2 = (int)(Math.random()*4);
            //랜덤한 배열 10개를 골라 값을 넣어줄 코드
            if (n[p1][p2]==0){
                n[p1][p2] = (int)(Math.random()*10+1);
                r++;
            }//n[p1][p2]==0은 값이 들어간 배열인지 확인

        }
        for(int i = 0;i<4;i++){
            for (int j =0; j<4;j++){
                System.out.print(n[i][j] +" ");
            }
            System.out.println();
        }
    }
}
