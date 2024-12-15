package test;

public class test3_1 implements test3{
    int a=9;
    public void sout()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        test3 t=new test3_1();
        t.sout();
        System.out.println(t.a);
        System.out.println(test3.a);
    }
}
