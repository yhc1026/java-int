package bit_courseJAVA.SynchronizedMethod;

import bit_courseJAVA.SynchronizedBlock.TicketSeller;

public class TicketSellerTest {
    public static void main(String[] args) {
        TicketSeller t=new TicketSeller();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
