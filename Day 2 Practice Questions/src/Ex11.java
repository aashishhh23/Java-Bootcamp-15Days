import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Write a program that reads a positive integer N from the user aND DISPLAYS THE FOLLOWING:
        // 1
        // 22
        // 333
        // 4444
        // ....
        // NNNNN...N

        Scanner s =  new Scanner(System.in);
        int  n = s.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++)
                System.out.print(i);

            System.out.println();


        }


    }
}
