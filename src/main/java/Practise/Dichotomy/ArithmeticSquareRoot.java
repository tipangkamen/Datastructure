package Practise.Dichotomy;


/*
* 给你一个非负整数 x ，计算并返回x的算术平方根 。
由于返回类型是整数，结果只保留 整数部分 ，小数部分将被舍去 。
注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
* */
public class ArithmeticSquareRoot {
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;


    }



    public static void main(String[] args) {
        System.out.println(mySqrt(6));
    }
}



