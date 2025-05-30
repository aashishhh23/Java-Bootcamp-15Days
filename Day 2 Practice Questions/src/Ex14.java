import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Write a program that reads a positive integer N and displays the folloeing:
        //Ex:- N=5;

//            *****
//            *****
//            *****
//            *****
//            *****

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        // EXAMPLE for N= 5;
//        *****
//        *   *
//        *   *
//        *   *
//        *****

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//            if (i == 1 || i == n)
//            for (int j = 1; j <= n; j++)
//                System.out.print("*");
//
//            else
//                for (int j = 1; j <= n; j++)
//                    if (j == 1 || j == n)
//                        System.out.print("*");
//                else
//                        System.out.print(" ");
//
//            System.out.println();
//        }

        // Example for N=5;
//        *****
//         ***
//         ***
//         ***
//        *****


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= n; j++)
                    System.out.print("*");

            else
                for (int j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print("");
                    else
                        System.out.print("*");

            System.out.println();
        }


    }
}
