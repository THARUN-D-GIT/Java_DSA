package OOPS;

import java.util.Scanner;

public class UserDefiniedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;

        /*
        CLASS   :
                -> BLUEPRINT THAT STORES THE INFO ABT THE ENTITY
         OBJECT:
                    -> REAL WORD ENTITY
          DOT(.)=
          ->USED TO INITIALIZE ,UPDATE,AND PRINT THR CLASS MEMBERSD
         */

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1=new Student(); //Declaration
        s1.name="kusi";
        s1.rno=456;
        s1.cgpa=8.95;
        Student s2=new Student(); //Declaration
        s2.name="ravi";
        s2.rno=455;
        s2.cgpa=9.95;

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);

        s1.cgpa=3.5;
        System.out.println(s1.cgpa);

        Student s3=new Student();
        s3.name=sc.next();
        s3.rno=sc.nextInt();
        s3.cgpa=sc.nextDouble();
        System.out.println(s3.name+" "+s3.rno+" "+s3.cgpa);

    }
}
