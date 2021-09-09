package com.xiaozhu.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class SparseArray {
    static int a=11;
    static int b=11;
    public static void main(String[] args) {
        //创建一个原始的二维数组
        int[][] sparse = new int[a][b];
        sparse[0][2]=1;
        sparse[1][3]=2;
        for (int[] sp:sparse) {
            for (int data : sp) {
                System.out.printf("%d\t",data);
            }
            System.out.println("");
        }
        int[][] ints = SparseArray.ChangeToSparseArray(sparse);
        System.out.println(Arrays.deepToString(ints));



    }

    //二维数组转稀疏数组
    public static int[][] ChangeToSparseArray(int[][] array){
        //记录有效值个数,数组行数，数组列数
        int sum=0;
        int hang=0;
        int lie=0;
        for (int[] arr : array) {
            hang++;
            for (int data : arr) {
                lie++;
                if(data!=0){
                    sum++;
                }
            }
        }

        int[][] SpareArray=new int[sum+1][3];
        SpareArray[0][0]=hang;
        SpareArray[0][1]=lie;
        SpareArray[0][2]=sum;
        int count=0;
        for (int i=0;i<hang;i++){
            for (int j=0;j<lie;j++){
                if(array[i][j]!=0){
                    count++;
                    SpareArray[count][0]=i;
                    SpareArray[count][1]=j;
                    SpareArray[count][2]=array[i][j];
                }
            }
        }
        return SpareArray;
    }

}
