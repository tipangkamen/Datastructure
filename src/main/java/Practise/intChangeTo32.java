package Practise;


public class intChangeTo32 {
    public static void main(String[] args) {
      /*  int i=1;
        integerTo32(1);
        integerTo32(1<<1);
        integerTo32(1>>1);
        System.out.println("==================");
        integerTo32(-1);
        integerTo32(-1<<1);
        integerTo32(-1>>1);
        integerTo32(-1>>>1);*/


        /*long num=2;
        longTo64(num);*/


        int i=5;
        int a=-i;
        int c= ~i+1;
        System.out.println(a);
        System.out.println(c);
    }
    //整形是32位的,本方法将整形转换为32位
    public static void integerTo32(Integer num){
        //整形32位提取出每一位（通过1左移i位，1左移i位结果为***000001000*****），
        // 如果num在i位上为1的话，则它与1相与是为1，否则为0，而其他位都是零,所以如果相与的结果是0，则numi位为零，为1则为1
        for (int i=31;i>=0;i--){
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println("");
    }
    public static void longTo64(Long num){
        //整形32位提取出每一位（通过1左移i位，1左移i位结果为***000001000*****），
        // 如果num在i位上为1的话，则它与1相与是为1，否则为0，而其他位都是零,所以如果相与的结果是0，则numi位为零，为1则为1
        for (int i=63;i>=0;i--){
            System.out.print((num & (1L <<i)) == 0 ? "0" : "1");
        }
        System.out.println("");
    }

}
