package com.aashish.Multithreading.ThreadCommunication;

public class Test {
    public static void main(String[] args) {
        Student engineeringStudent = new Student() {

            @Override
            public String getBio(String name) {
                return name + " is Engineering student";
            }
        };

        // to convert into lambda expression put the arrow between  parameter and body
        Student lawStudent = name -> {
            return name + " is law student";
        };
        String bio = engineeringStudent.getBio("Ram");
        System.out.println(bio);
    }

}

