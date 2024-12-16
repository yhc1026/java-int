package test;

public class test4_3 {
    public static void main(String[] args) {
        test4_2 T=new test4_2();
        try{
            T.test();
        }catch(test4_1 t)
        {
            System.out.println(t.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}
