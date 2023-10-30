package javaex3;

public class javaex3_12 {
    static int[] makeArray(){
        int[] temp = new int[4];
        for (int i=0;i<4;i++){
            temp[i] = i+1;
        }
        return temp;
    }
    public  static void main(String args[]){
        int[] intArray = new int[4];
        intArray = makeArray();
        for (int i =0;i<4;i++){
            System.out.print(intArray[i]+ " ");
        }
    }
}
