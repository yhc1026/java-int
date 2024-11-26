package uestc.EX1;

import java.io.*;
import java.util.Scanner;

public class StudentDatabase {
    private static String filepath="D:/Desktop/student.txt";
    private Student[] students;

    public StudentDatabase(Student[] students) {
        this.students = students;
    }

    public void createStudent()
    {
        String name;
        String gender;
        String major;
        String ID;
        int age;

        System.out.println("输入学生名称");
        Scanner scanner1=new Scanner(System.in);
        name=scanner1.nextLine();
        System.out.println("输入学号");
        Scanner scanner2=new Scanner(System.in);
        ID=scanner2.nextLine();
        System.out.println("输入性别");
        Scanner scanner3=new Scanner(System.in);
        gender=scanner3.nextLine();
        System.out.println("输入年龄");
        Scanner scanner4=new Scanner(System.in);
        age= Integer.parseInt(scanner4.nextLine());
        System.out.println("输入专业");
        Scanner scanner5=new Scanner(System.in);
        major=scanner5.nextLine();

        Student student=new Student(ID, name, gender, age, major);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }

    public void readStudentData()
    {
        try {
            for(int i=0;i<students.length;i++)
            {
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filepath));
                students[i]=(Student)ois.readObject();
                System.out.println("学生"+(i+1)+"为"+students[i].getName()+", 学号为"+students[i].getStudentID());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<students.length;i++)
        {
            students[i]=null;
        }
    }

    public void writeStudentData()
    {
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath));
            for(int i=0;i<students.length&&students[i]!=null;i++)
            {
                oos.writeObject(students[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<students.length;i++)
        {
            students[i]=null;
        }
    }
}
