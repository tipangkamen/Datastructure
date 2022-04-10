package Sort;

public class SelectionSort {
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
        //0~n-1
        //1~n-1
        //2~n-1
        for (int i = 0; i < N; i++) {
            //先找到最小的数
            int minValueIndex = i;
            //0~n-1
            //1~n-1
            //2~n-1
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }


}
