package Practise.Dichotomy;

/*
 *  一个无序数组(任意两个相邻的数不相等)  如果[0]<[1] 则[0]是区间最小数  [length-2]>[length-1]则[length-1]是区间最小数 其他的数需要满足 [n-1]>[n]<[n+1] 则[n]是区间最小数
 * 现在只需要返回任意一个区间最小数的下标
 * */
public class MinInterval {


    private static int findMinIntervalByDichotomy(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr[0] < arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 2] > arr[arr.length - 1]) {
            return arr[arr.length - 1];
        }
        int l = 1;
        int r = arr.length - 2;
        int mid;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (arr[mid] > arr[mid - 1]) {
                r = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return l;

    }


}


