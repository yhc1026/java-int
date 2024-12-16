package test;

public class test5 {
    public static void main(String[] args) {
        int i = 0;
        try {
            System.out.println(10 / 0);
            int[] arr = {0, 1, 2};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception");
        } catch (ArithmeticException e) {
            System.out.println("exception");
        }
    }
}
