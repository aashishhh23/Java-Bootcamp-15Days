import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Write a program that reads a positive integer N and displays the following:

        // Example:- N =6:
//             *
//            **
//           ***
//          ****
//         *****
//        ******


//        Scanner s= new Scanner(System.in);
//        int n = s.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j<= n- i; j++)
//                System.out.print(" ");
//
//            for (int j = 1; j <=i ; j++)
//                System.out.print("*");
//
//            System.out.println();
//
//
//        }


        // Exampke for N=6:
//             *
//            ***
//           *****
//          *******
//         *********
//        ***********

                                                        // 2*i -1
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<= n- i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i- 1; j++)
                System.out.print("*");

            System.out.println();


        }


    }
}
