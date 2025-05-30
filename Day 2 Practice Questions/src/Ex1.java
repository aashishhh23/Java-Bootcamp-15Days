public class Ex1 {

                                 // Day 3 [Neso Academy]

// Question 1 . Write a Program that reads an integer from the user and determines if the integer is even or odd

// Algorithm :-1] Display a proper message for the user
//             2] Read the integer from the user
//             3] Test if the integer is even or odd and diplay a proper message

public static void main(String[] args) {
//    System.out.println("enter a number");
//
//    Scanner s = new Scanner(System.in);
//    int n =s.nextInt();
//
//    if (n % 2 ==0)
//        System.out.println("even");
//
//   if ( n % 2 == 1) OR
//    if ( !(n % 2 == 0))
//
//        System.out.println("Odd");


//                                       DIVISON OPERATOR

//    int i1 = 1 / 2; //OK, int = int
//    int i2 = 1.0 / 2; //ERROR, int = double
//    int i3 = (int) (1.0 / 2); //  OK, int = int
//    int i4 = (int) (1.0f / 2); // OK, int = int
//    int i5 = (int) 1.0f / 2 ; // OK, int = int
//    int i6 = 1.0f / (int) 2; // ERROR, int = float
//    double i7 = 1.0/2; // OK, double = double
//    double i8 = 1/2; // Ok, double = int
//    double i9 = (double) 1 / 2; //Ok , double = double
//    float i10 = 1.0f / 2.0f; //OK, float = float
//    float i11 = 1 / 2; //OK, float = int


//    int i1 =  3;
//    int i2 = 2;
//    double d1 = 2;
//    System.out.println(i1/i2); // 1 because int /int
//    System.out.println(i1 / d1); // 3 / 2.0 = 1.5 firtsly 3 to be casted to double then divide
//
//    System.out.println((double) i1 / i2); // 1.5
//    System.out.println(i1/(double )i2); // 1.5
//    System.out.println((double) i1/ (double) i2); //1.5
//   System.out.println((double) i1 / (double) i2); // 1.5
//    System.out.println((double)(i1 /i2)); //1.0


//                          if-else statement [Ex-1]

//    ques. Create a calculator

//    Examples

//    enter num1 operator num2 (example: 1+2): 3/2
//            the result is: 1.5
//
//    enter num1 operator num2 (example: 1+2): 1+2
//    the result is: 3.0


//    System.out.print("enter num1 op num2 (5 * 7): ");
//
//    Scanner s = new Scanner(System.in);
//    double d1 = s.nextDouble();
//    char op = s.next().charAt(0);
//    double d2 = s.nextDouble();
//
//    if (op == '+')
//        System.out.println((int)(d1 + d2)); // if you dont want to get answer into double then casted it into integer (int)
//    else if (op == '-' )
//    System.out.println((int)(d1 - d2));
//    else if (op == '/' )
//        System.out.println((int)(d1 / d2));
//    else if (op =='*' )
//        System.out.println((int)(d1 * d2));


//                    EXERCISE 2
// A four-digit number ABCD is called Lucky if A + B = C + D.

//            Write a program that asks the user to enter a 4-digit number and tell if the number is a lucky number or not

    //Example:- 1] The number 3719 is a Lucky number since 3+7=1+9.
    //          2] The number 3521 is not a Lucky number since 3+5!=2+1.

//    Scanner s= new Scanner(System.in);
//
//    System.out.println("enter a four-digit number: ");
//    int n = s.nextInt();
//
//    if (!(n > 999 && n < 10000)) {
//        System.out.println(n + "is not a four-digit number");

//    }
//    else {
//        //    if our number is ABCD
//        int fourthDigit= n % 10; // D
//        int thirdDigit = (n / 10) % 10; // ABC % 10 = C
//        int secondDigit = (n / 100) % 10; // AB % 10 = B
//        int firstDigit = (n / 1000) % 10; // A% 10 = A
//
//
//        if(firstDigit + secondDigit == thirdDigit + fourthDigit)
//            System.out.println("lucky");
//        else
//            System.out.println("not lucky");
//
//    }


                                                           // LOOPS IN JAVA E3

    // Write a program which prints the even numbers between 1 and 100 in an increasing order.

    // Solution 1] iterate over the numbers between 1 and 100
//              2] if i is even , print i

//    for (int i =1; i <=100; i++)
//       if (i % 2 == 0) // For even Number
//        if (i % 2 != 0) // odd Number
//            System.out.println(i + " ");

    // Decreasing Even Number

//    for (int i =100; i >=1; i--)
//        if(i % 2 == 0)
//            System.out.println(i+ " ");


    //                   OR

//    for (int i =100; i >=1; i-= 2)
//            System.out.println(i+ " ");


    //                   OR

//    for (int i =2; i <=100; i+=2)
//        System.out.println(i+ " ");

    //    Decreasing Odd number
//    for (int i =99; i >=1; i-= 2)
//            System.out.println(i+ " ");

                                                     //Now By While Loop

//    int i = 1;
//    while(i <= 100) {
//        if(i % 2 ==0)
//            System.out.println(i + "");
//        i++;
//    }

    // NOw in Decreasing Order

//    int i = 100;
//    while(i >= 1) {
//        if (i % 2 == 0)
//            System.out.println(i + " ");
//        i--;
//    }




}
}