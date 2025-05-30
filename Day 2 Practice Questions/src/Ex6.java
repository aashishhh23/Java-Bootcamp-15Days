import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Write a program which displays the sum of digits of an integer read from the user
        // Ex:-> 1+0+8= 9
        // 1123 = 1+ 1+ 2+3 = 7 and so on...

        //Solution :- 1] Read the number from the user
        //              2] keep extracting the digits using the modulo and divison operators and adding them to sum
        // 3] Display Sum



        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 0;
        while ( n > 0) {
            sum += n % 10; // A
            n /=10; // 0
        }

        System.out.println("sum=" + sum);
    }
}
