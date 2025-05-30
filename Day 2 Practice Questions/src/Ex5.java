import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Write a program which reads a sequence reads a sequence of positive integers. The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers
        // Example : 6 0 5 7 -1 -> max = 7, min = 0

        // Solution 1:- Read the first value from the user and suppose it is the maximum and the minimum (max and min)
        //          2:- keep updating max and min as long as the user is giving positive values
        //          3:- display the results when the user enters a negative value

        // Ex :- n=3 // input
        // max  =  3
        // min = 3

        // Ex :-n= 5 // input
        // max  =  5
        // min   = 3 [5 is not less than 3 islea min =3 ]


        // n = -1
        // display max & min

//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//        int max = n;
//        int min = n;
//
//
//        while (true) {
//            n = s.nextInt();
//
//            if (n < 0)
//                break;
//
//            if (n > max)
//                max = n;
//
//            if (n < min)
//                min = n;
//        }
//        System.out.println("min= "+ min + ", max= "+ max);


//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//        int max = n;
//        int min = n;
//
//        if (n>=0) {
//            while (true) {
//                n = s.nextInt();
//
//                if (n < 0)
//                    break;
//
//                if (n > max)
//                    max = n;
//
//                if (n < min)
//                    min = n;
//
//            }
//            System.out.println("min= "+ min + ", max= "+ max);
//        }
//        else {
//            System.out.println(n + "is invalid");
//        }



        // Clean Code

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;

        if (n>=0) {
            while (true) {
                n = s.nextInt();


                if (n < 0)
                    break;

max = n > max ? n : max;
                min = n < min ? n : min;

            }
            System.out.println("min= "+ min + ", max= "+ max);
        }
        else {
            System.out.println(n + "is invalid");
        }











    }
}
