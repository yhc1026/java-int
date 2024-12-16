package test;

public class test7_2 {
    public static void main(String[] args) {
        test7_1 t=new test7_1();
        try{
            t.test();
        }catch(test7 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
