package bit_courseJAVA.Exception;

import java.util.Scanner;

public class invalidPasswordExceptionChecker {
    public int password;
    public void setPassword(int password)
    {
        this.password=password;
    }
    public void checker() throws invalidPasswordException
    {
        if(this.password<100000)
        {
            invalidPasswordException e=new invalidPasswordException("错误密码");
            throw e;
        }
    }
}
