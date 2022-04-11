package Practise.Dichotomy;

/*
*   一个有序数组，给出一个数字,需要找到小于这个数字的数字
* */
public class LessThanMinNum {

    public static int findLessThanMinNum(int[] arr,int minNum){
        int l=0;
        int r=arr.length-1;

        while (l<r){
            int index=l+(r-l)>>2;
            if(arr[index]>=minNum){
                r=index;
            }


        }

    }
}
