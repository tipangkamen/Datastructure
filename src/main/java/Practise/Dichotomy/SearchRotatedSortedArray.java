package Practise.Dichotomy;

/*
*   整数数组 nums 按升序排列，数组中的值 互不相同 。

在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。

给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回-1。
* */
public class SearchRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            //说明mid是在左边的有序数组中
            if (nums[mid] >= nums[0]) {
                if (nums[mid] > target && nums[0] <= target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[nums.length - 1] >= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return nums[l] == target ? l : -1;
    }

    public static int searchIndex(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + ((r - l) >> 1);
            //说明mid还在上升期
            if (nums[mid] > nums[0]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        int i = search(nums, 3);
        System.out.println(i);
    }
}
