package bit_courseJAVA.FileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test2 {
    public static String path="D:/codeC/java-int/JDK18/bit_courseJAVA/FIleOperation/text.txt";
    public static void main(String[] args) throws FileNotFoundException {
        try(InputStream inputstream= new FileInputStream(path)) {
            int letter=0;
            while(letter!=-1)
            {
                letter=inputstream.read();    //read方法一次读入一个字符，返回int型数据，数据范围在0-255
                System.out.print((char) letter);
            }
            inputstream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
