import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Write a program that reads a positive integer N and displays the following:
       // Example for N=6:
//             *
//            * *
//           *   *
//          *     *
//         *       *
//        ***********

        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) { // Outer Loop

            for (int j = 1; j<= n- i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i- 1; j++)
                if (i == n) // last line i.e all star
                System.out.print("*");
            else
                if (j ==1 || j == 2*i - 1)
                    System.out.print("*");
else
                    System.out.print(" ");
            System.out.println();


        }
    }
}
