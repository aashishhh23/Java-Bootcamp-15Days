package com.aashish.exceptionHandling;

public class MainClass {
    public static void main(String[] args) {

//        int a[] = new int[5];
//
//        System.out.println("Hello guys");


//        try {
//            int result = 5 / 0;
//            System.out.println(a[8]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("tried to access the out of bound element");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }


        int a[] = new int[5];

        System.out.println("Hello guys");

        try {
            int result = 5 / 0;
            System.out.println(a[8]);

//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception");
//        } catch (RuntimeException e) {
//
//        }
//

        } catch (Exception e) {
            System.out.println("All exception handled");
        }






        System.out.println("bye guys");
    }
}
