package Heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa)
    {
        this.name=name;
        this.rno=rno;
        this.cgpa=cgpa;
    }
    // compare function to sort based on parameters
    public int compareTo(Student s)
    {
        //will sort based on rno
      return Integer.compare(this.rno,s.rno);
        //will sort based on cgpa
       // return Double.compare(this.cgpa,s.cgpa);
        // for descending order reverse the order of s
       // return Double.compare(s.cgpa,this.cgpa);
        // will sort based on names
        //return this.name.compareTo(s.name);
    }
}

public class CustomComparator {
    static void main(String[] args) {
        Student s1=new Student("tarun",100,8.79);
        Student s2=new Student("vishwas",114,8.3);
        Student s3=new Student("bhuvan",98,8.5);
        Student s4=new Student("sharan",86,8.7);
        Student s5=new Student("rajath",73,8.25);
        Student [] arr={s1,s2,s3,s4,s5};
        //import java.util.Arrays
        Arrays.sort(arr);
        for(Student s:arr)
        {
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }

    }
}
