import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Write a program which displays the sum of the strict divisors of an integer given by the user
        // Example 6-> 1+2+3 =6


        // HINTS :- The strict divisors of a  number N are <= N/2
        //       :- if N % i = 0, then i is a divisor of N


        // SOLUTION:- 1]Iterate over all the possible divisors
        //            2] If 'i' is a divisor of N, add i to the SUM
        //            3] Display SUM

//        Scanner s =new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        int n = s.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <=n/2; i++)
//            if (n % i == 0)
//                System.out.print(i + " ");


        // Add all the divisors

//        Scanner s =new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        int n = s.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <=n/2; i++)
//            if (n % i == 0)
//                sum += i;
//                System.out.println(sum + n);

        //                                         OR

        Scanner s =new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = s.nextInt();

        int sum = 1; // because n is divisor of every number
        for (int i = 2; i <=n/2; i++)
            if (n % i == 0)
            sum += i;
        System.out.println(sum + n);



    }
}
