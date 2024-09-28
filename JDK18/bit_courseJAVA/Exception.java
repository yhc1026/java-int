package bit_courseJAVA;

public class Exception {
    public static void main1(String[] args) {
        System.out.println(10/0);           //arithmetic exception：算数异常
    }

    public static void main2(String[] args) {
        int[] arr1={1,2,3,4,5};
        System.out.println(arr1[10]);       //ArrayIndexOutOfBoundsException：数组越界异常
    }
}
