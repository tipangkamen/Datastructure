package Practise.Dichotomy;

/*   在一个有序数组中,找某个数是否存在
 * */
public class ExistNum {

    public static boolean isExist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int[] arr1 = {5};
        int search = search(arr1, 5);
        System.out.println(search);
    }
}
