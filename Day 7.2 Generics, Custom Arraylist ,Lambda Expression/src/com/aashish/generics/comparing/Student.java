package com.aashish.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compare to method");
        int diff = (int) (this.marks - o.marks);

        //if diff == 0; means both are equal
        //if diff < 0: means o is bigger else o bigger else o is smaller
        return 0;
    }
}
