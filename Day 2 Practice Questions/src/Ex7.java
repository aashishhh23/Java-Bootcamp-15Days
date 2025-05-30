import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // TheFibonacci sequence is a sequence of numbers where the first two numbers in the sequence are 1 and 1. Then, each additional fibonacci number is the sum of the 2 previous numbers in the sequence
        //1,1,2,3,4,8,13,21....

        //Write a program that reads an integer n and siplays the nth fibbonacci number
        // To get the nth Fibonacci number we need n-2 steps

        Scanner s = new Scanner(System.in);

        System.out.print("enter a positive integer n: ");
        int n = s.nextInt();

        int v1 =1;
        int v2 =1;
        int result=0;
        for (int i = 1; i<= n-2; i++) {
            result = v1+v2;
            v1 = v2;
            v2 = result ;

        }
        System.out.println("result = " + (result == 0 ? 1 : result));

    }
}
