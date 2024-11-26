package uestc.EX1;

public class database_test {
    public static void main(String[] args) {
        Course[] t1={null};
        courseDatabase tdb1=new courseDatabase(t1);
        tdb1.createCourse();
        tdb1.readtCourseData();
    }
}
