package Practise.Dichotomy;

/*
*  一个无序数组  如果[0]<[1] 则[0]是区间最小数  [length-2]>[length-1]则[length-1]是区间最小数 其他的数需要满足 [n-1]>[n]<[n+1] 则[n]是区间最小数
* 现在只需要返回任意一个区间最小数
* */
public class MinInterval {


    private static int findMinIntervalByDichotomy(int[] arr){
        int l=0;
        int r=arr.length-1;

        while (l<=r){

            /*
                不用这两个是因为 1可能超过int的最大长度  2的除法比加法慢，比位运算更慢
                int index=(l+r)/2;
                int index=l/2+r/2;
             */

            int index=l+(r-l)>>2;
            if (index==0 && arr[l]<arr[index]){
                return arr[index];
            }else if (index==arr.length-1 && arr[arr.length-2]>arr[arr.length-1]){
                return arr[index];
            }else {
                if (arr[index-1]>arr[index] && arr[index]<arr[index+1]){
                    return arr[index];
                }
            }


        }





        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

}
