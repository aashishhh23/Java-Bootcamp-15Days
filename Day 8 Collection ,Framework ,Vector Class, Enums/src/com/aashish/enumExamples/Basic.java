package com.aashish.enumExamples;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are called enum constants
        //public, static and final
        // since its final you can create child enums\
        //type is week




        Week() {
            System.out.println("Constructor called for" + this);
        }

        @Override
        public void hello () {
            System.out.println("hey how are you");
        }
        //this is not public or protected, only private or default . Why ?
        // because if we create public or protected it will allow initialization of one or more objects
        // this is not the  enum concept, thats why

        // internally : public static final weel Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        for (Week day : Week.values()) {
//            System.out.println(day);
//      }

//        System.out.println(week.ordinal());
    }
}
