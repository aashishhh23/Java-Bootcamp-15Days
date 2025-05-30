import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Write a program which reads a positive number N from the user then indicates if N is prime or not.
        // N is a prime number if its divisors are only 1 and N


        // Logic :- 1] So sum of the divisor is 1+N Or Sum of the strict divisor is 1
        // Logic :- 2] If Sum = 1 then N is a prime no.


//        Scanner s = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int n = s.nextInt();
//
//        int sum = 1;
//        for (int i =2; i <= n/2; i++)
//            if (n % i == 0)
//                sum += i;
//
//        System.out.println(sum == 1 ? "prime" : "not prime");

//        Solution 2: - 1] iterate over all the possible divisors except 1 and N
//                       2] If i is a divisor of N, then n is not prime
 //                      3] N is prime if no divisors were found


        Scanner s =new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = s.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++)
            if(n % i == 0) {
                isPrime = false;
                break;

            }

        System.out.println(isPrime ? "prime" : "not prime");






    }
}
