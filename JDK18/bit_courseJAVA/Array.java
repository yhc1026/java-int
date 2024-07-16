package bit_courseJAVA;

//数组对象

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6}; //这种是下面的精简版
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6}; //两种没有本质区别，new指的是创建新的对象
        int[] arr3 = new int[10];//没有初始化则默认数组内的元组均为0（Boolean类型默认false）
        int arr4[]; //JAVA中不建议这么写
        System.out.println(arr3[2]);

        //增强for循环(无法拿到数组下标）
        for (int x: arr1)
        {
            System.out.print(x + " ");
        }

        System.out.println("");

        // 操作数组类工具
        String ret= Arrays.toString(arr2);
        System.out.println(ret);
    }
}