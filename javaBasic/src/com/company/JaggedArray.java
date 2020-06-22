package com.company;
public class JaggedArray {
    public static void main(String[] args) {
        int[][] intArray = new int[4][];
        intArray[0] = new int[1];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[4];

        int k = 0;
        for(int i=0;i<4;i++){
            for(int j= 0;j< i+1;j++){
                intArray[i][j] = k;
                k++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j= 0;j< i+1;j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
