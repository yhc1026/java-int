package test;

public class test4_2 {
    public void test() throws test4_1
    {
        int a=0;
        if(a!=1)
        {
            test4_1 t=new test4_1("exception");
            throw t;
        }
        System.out.println("ok");
    }
}
