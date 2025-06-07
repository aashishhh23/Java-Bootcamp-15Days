package com.aashish.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Aashish = new Student(01, 97.0f);
        Student Rahul = new Student(03, 99.0f);

        Student Sadgi = new Student(02, 100.0f);
        Student Aayush = new Student(05, 79.0f);

        Student Saumya = new Student(04, 99.99f);

        Student [] list = {Aashish, Rahul, Sadgi, Aayush, Saumya};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
        System.out.println(Arrays.toString(list));

//        if (Aashish.compareTo(Rahul) < 0) {
//            System.out.println(Aashish.compareTo(Rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
