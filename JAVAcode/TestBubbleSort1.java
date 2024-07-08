public class TestBubbleSort1{
    public static void main(String [] args){
        //定义一个无序数组
        int [] arr = {75,87,56,45,89,100,76,34,89,97};
        //排序前输出
        System.out.println("排序前");
        for(int score :arr){
            System.out.print(score+"\t");
        }
        //排序
        //大循环：n个元素排序，则至多需要n-1趟循环
        for(int i=0;i<arr.length-1;i++){
            //小循环：每一趟循环都从数列的前两个元素开始进行比较，
//比较到数组的最后
            for(int j=0;j<arr.length-1;j++){
                //如果前一个大于后一个
                if(arr[j] > arr[j+1]){
                    //交换
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //排序后输出
        System.out.println("\n排序后");
        for(int score :arr){
            System.out.print(score+"\t");
        }
    }
}