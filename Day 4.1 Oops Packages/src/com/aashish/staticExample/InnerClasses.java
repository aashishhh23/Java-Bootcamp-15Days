package com.aashish.staticExample;

//class  Test {
//    // Only inner class will be static not outside classes because it is not itself dependent on any other class
//
//    static  String name;
//
//    public Test(String name) {
//        InnerClasses.Test.name = name;
//    }
//}


import java.util.Arrays;

public class InnerClasses {


    // When i put this below class inside InnerClasses then it depend on Innerclasses thats why it is no static context
   static class  Test { // i put static
        // Only inner class will be static not outside classes because it is not itself dependent on any other class

         String name;

        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;

        }

    }



    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        Arrays.toString(new int[] {3,4,5});

        System.out.println(a.name);
        System.out.println(b.name);

    }

}
