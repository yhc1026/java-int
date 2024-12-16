package test;

import java.util.Scanner;

public class test7_1 {
    public void test() throws test7
    {
        while(true)
        {
            Scanner s=new Scanner(System.in);
            String string =s.nextLine();
            if(string.equals("a"))
            {
                throw new test7("a");
            }
        }
    }
}
