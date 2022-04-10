package Sort;

public class BubbleSort {
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

    //冒泡排序
    public static void selectionSort(int[] arr) {
        //先判断边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        //0-n-1
        //0-n-2
        //0~n-3
        for (int end = N - 1; end >= 0; end--) {
            //两两排序
            //0-1
            //1-2
            //end-1 end
            for (int j = 1; j <= end; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }

        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }


}
