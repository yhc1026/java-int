import com.sun.security.jgss.GSSUtil;

public class test {
    public static void main1(String[] args) {
        char c='\0';
        for(int i=1;i<=4;i++)
        {
            switch (i)
            {
                case 1:{c='k';
                    System.out.println(c);}
                case 2: {c='e';
                    System.out.println(c);
                break;}
                case 3:{c='p';
                    System.out.println(c);}
                default:
                    System.out.println("!");
            }
        }
    }

    public static void main2(String[] args) {
        int i=0;
        while(i<10)
        {
            if(i==5)
            {
                i++;
                break;
            }
            i++;
            System.out.println(i);
        }
        System.out.println("break");
    }

    public static void sout()
    {
        System.out.println("静态方法1");
    }

    public static int num;
    static{
        System.out.println(num);
        num=1;
        System.out.println("调用静态代码块");
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
