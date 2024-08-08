package bit_courseJAVA;

class student
{
    public int age;
    static public int classnum;
}

public class Class4 {
    public static void main(String[] args) {
        //student student1=new student();
        student.classnum=1;
        System.out.println(student.classnum);//static修饰的变量为定值，所有student都是同一个classnum,也无需实例化即可调用操作
    }
}
