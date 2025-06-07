package com.aashish.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
            // mimicing

            String name = "Aashish";
            if (name.equals("Aashish")) {
                throw new Exception("name is Aashish");

            }
    } catch (MyException e) {
        System.out.println(e.getMessage());


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println("normal exception");

        } finally {
            System.out.println("this will always execute");
        }

    }
static int divide (int a, int b) throws ArithmeticException {
    if (b == 0) {
        throw new ArithmeticException("please don't divide by zero");
    }

    return a/b;
}

}

// throw:- we are throwing an exception
//throws:- just used to declare exception