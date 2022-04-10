package Sort;

public class ChooseSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2, 4, 4, 5, 8, 9};
        print(arr);
        selectionSort(arr);
        print(arr);
    }

    //输出语句
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //选择排序
    public static void selectionSort(int[] arr) {
        //先判断边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        //0-1
        //0~n
        for (int i = 1; i < N; i++) {
            //找到一个合适的位置插入
            //0
            //1
            //2
            //n
            for (int pre = i - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }



}
