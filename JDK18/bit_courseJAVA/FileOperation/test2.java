package bit_courseJAVA.FileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test2 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputstream= new FileInputStream("./text.txt");
        try {
            inputstream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
