package uestc.homework2_2;

public class test2_2 {
    public static void main(String[] args) {
        square sq1=new square(15.0, "red", true);
        rectangle rec1=new rectangle(20.0, 10.0, "pink", false);
        Circle c1=new Circle(6.0, "red", true);
        System.out.println(sq1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(rec1.isFilled());
        System.out.println(sq1.toString());
        System.out.println(rec1.toString());
        System.out.println(c1.toString());
    }
}
