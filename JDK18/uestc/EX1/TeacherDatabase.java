package uestc.EX1;

import java.io.*;
import java.util.Scanner;

public class TeacherDatabase {
    private static String filepath="D:/Desktop/teacher.txt";
    private Teacher[] teacher;

    public TeacherDatabase(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public void createTeacher()
    {
        String name;
        String gender;
        String title;
        String ID;
        int age;

        System.out.println("输入教师名称");
        Scanner scanner1=new Scanner(System.in);
        name=scanner1.nextLine();
        System.out.println("输入工号");
        Scanner scanner2=new Scanner(System.in);
        ID=scanner2.nextLine();
        System.out.println("输入性别");
        Scanner scanner3=new Scanner(System.in);
        gender=scanner3.nextLine();
        System.out.println("输入年龄");
        Scanner scanner4=new Scanner(System.in);
        age= Integer.parseInt(scanner4.nextLine());
        System.out.println("输入职称");
        Scanner scanner5=new Scanner(System.in);
        title=scanner5.nextLine();

        Teacher teacher=new Teacher(ID, name, gender, age, title);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            oos.writeObject(teacher);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }

    public void readteacherData()
    {
        try {
            for(int i=0;i<teacher.length;i++)
            {
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filepath));
                teacher[i]=(Teacher) ois.readObject();
                System.out.println("教师"+(i+1)+"("+teacher[i].getTitle()+")为"+teacher[i].getName()+", 工号为"+teacher[i].getTeacherID());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<teacher.length;i++)
        {
            teacher[i]=null;
        }
    }

    public void writeteacherData()
    {
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            for(int i=0;i<teacher.length&&teacher[i]!=null;i++)
            {
                oos.writeObject(teacher[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<teacher.length;i++)
        {
            teacher[i]=null;
        }
    }
}
