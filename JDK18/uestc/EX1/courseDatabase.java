package uestc.EX1;

import java.io.*;
import java.util.Scanner;

public class courseDatabase {
    private static String filepath="D:/Desktop/course.txt";
    private Course[] course;

    public courseDatabase(Course[] course) {
        this.course = course;
    }

    public void createCourse()
    {
        String name;
        String ID;
        int hour;

        System.out.println("输入课程名称");
        Scanner scanner1=new Scanner(System.in);
        name=scanner1.nextLine();
        System.out.println("输入课程号");
        Scanner scanner2=new Scanner(System.in);
        ID=scanner2.nextLine();
        System.out.println("输入课时");
        Scanner scanner4=new Scanner(System.in);
        hour= Integer.parseInt(scanner4.nextLine());

        Course course=new Course(name, ID, hour);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            oos.writeObject(course);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }

    public void readtCourseData()
    {
        try {
            for(int i=0;i<course.length;i++)
            {
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filepath));
                course[i]=(Course) ois.readObject();
                System.out.println("课程"+(i+1)+"为"+course[i].getCourseName()+", 课程号为"+course[i].getCourseID()+"课时为"+course[i].getCourseHour()+"h");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<course.length;i++)
        {
            course[i]=null;
        }
    }

    public void writeCourseData()
    {
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            for(int i=0;i<course.length&&course[i]!=null;i++)
            {
                oos.writeObject(course[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<course.length;i++)
        {
            course[i]=null;
        }
    }
}
