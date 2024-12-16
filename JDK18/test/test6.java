package test;

public class test6 {
    public void test() throws Exception{                           //如果加上throws，在main调用的时候就会画红波浪线，如果不加，就不会画红波浪线
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        test6 t=new test6();
        try {
            t.test();
        } catch(RuntimeException e)
        {
            System.out.println("0");
        }catch(Exception e)
        {
            System.out.println("1");
        }
    }
}
