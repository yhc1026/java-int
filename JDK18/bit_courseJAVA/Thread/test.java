package bit_courseJAVA.Thread;

public class test {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();         //真正在系统中创建出一个线程
        while(true)
        {
            System.out.println("hello, main");        //main线程和Thread线程同时占用cpu，执行哪个为随机事件
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
