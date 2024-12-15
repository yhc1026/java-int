package test;

public class test1_m {
    public static void main(String[] args) {
        test1 t=new test1();
        t.geta();
        test1 t1=new test1_1();
        test1 t2=new test1_2();
        System.out.println(t1.a);
        t1.geta();
        System.out.println(t2.a);
        t2.geta();
    }
}
