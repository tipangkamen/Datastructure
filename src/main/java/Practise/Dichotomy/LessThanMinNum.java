package Practise.Dichotomy;

/*
 *   一个有序数组，给出一个数字,需要找到小于这个数字的数字中的最右边的下标
 * */
public class LessThanMinNum {

    public static int findLessThanMinNum(int[] arr, int minNum) {
        int l = 0;
        int r = arr.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] >= minNum) {
                index = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6, 6, 9};
        int[] arr1 = {1, 1, 3, 4, 5, 6, 6, 9};
        System.out.println(findLessThanMinNum(arr, 3));
        System.out.println(findLessThanMinNum(arr1, 3));

    }
}
