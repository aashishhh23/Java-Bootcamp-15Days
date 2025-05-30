import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Write a Program which reads a sequence of integers from the user and stops by displaying "Done" when the sum of these values exceeds 100

        // 1] Declare a variable SUM to store the sum
        // 2] Read values from the user and add them to SUM as long as SUM <=100
        // 3] When SUM> 100 display "DONE

//        Scanner s = new Scanner(System.in);


//        int sum = 0;
        // use infinite loop because we don't how many values of numbers enter the user !!
//        while(true) {
//            System.out.print("enter a number: ");
//            sum += s.nextInt();
//
//            if(sum > 100)
//                break;
//
//        }
//        System.out.println("Done: " + sum);


//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//        while(sum <= 100) {
//            System.out.print("enter a number: ");
//            sum += s.nextInt();
//
//
//        }
//        System.out.println("Done: " + sum);

        //                     Now change the conditions


//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//        while(sum <= 100) {
//            System.out.print("enter a number: ");
//            sum += s.nextInt();
//
//
//        }
//        System.out.println("Done: " + sum);

        //                                          By   WHILE LOOP

        Scanner s = new Scanner(System.in);
              int sum = 0;
     do {
            System.out.print("enter a number: ");
            sum += s.nextInt();

        }  while(sum <= 100);

        System.out.println("Done: " + sum);

    }
}
