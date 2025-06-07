package com.aashish.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(15);
        daughter.career();

        Parent.hello();


        //Parent mom = new Parent();{
       // you cant create objects of an abstract class

        }
    }

