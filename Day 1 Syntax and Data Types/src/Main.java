

import java.awt.*;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String myName = "Aashish Verma";
//        String myJob = "Programmer";
//        String myNameCopy = myName;
//        myName = "Another Name";
//
//        System.out.println(myName);
//
//        System.out.println(myNameCopy);
//        System.out.println(myJob);
//
//
//        String arg1 = args[0];
//        System.out.println(arg1);


//        final String COMPANY_NAME = "Neso Academy";
//        System.out.println(COMPANY_NAME);

//        final String COMPANY_NAME;
//        COMPANY_NAME = "Another Name";
//        COMPANY_NAME= "another name";
//        System.out.println(COMPANY_NAME);


//        final String COMPANY_NAME;
//        COMPANY_NAME = "Neso Academy";
//        System.out.println(COMPANY_NAME);

        //        INITIALIZING INT VARIABLES

//  int i1 = 5;
//  int i2=10;
//  int i3=-9;
//  int i4=2147483648;  error
//  int i5=-2147483649; error

//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
//        System.out.println(i4);
//        System.out.println(i5);


        //          BYTE[-128,128]

//byte b1 = -128; // Okay
//byte b2 = 100;  //okay
//
//byte b3 = -129; //ERROR
//byte b4 = 129;  // ERROR
//
//        System.out.println(b1);


        //          SHORT [-32768, 32767]

//        short s1 = 5000; // okay
//        short s2 =32768; // Error
//        System.out.println(s1);


        //           LONG

//        long l1 = 37248324; // okay
//       long l2 =37482343264734; //error
//        System.out.println(l1);

//        byte b1 = 5;
//        short s1 = 10;
//        int i1 =20;
//        long l1 = 200;

//        l1 = b1+ s1 + i1; //OK, long =int
//        i1 = s1 +b1; // OK, int = short
//        s1 = b1; //OK, short = byte
//
//        i1 = l1;// NOT Ok, int = long
//        s1 = i1; //NOT OK , Short= int
//        b1= i1 ; // NOT OK, byte = int

//        System.out.println(b1);
//        System.out.println(s1);
//        System.out.println(i1);
//        System.out.println(l1);

//        System.out.println(b1 - i1);
//        System.out.println(s1 - b1);
//        System.out.println(i1 - l1);

        //   INTEGER
//        System.out.println(Integer.MAX_VALUE);

        // SHORT

//        System.out.println(Short.MIN_VALUE);

        // FLOAT

//        float f1 = 4.5F;
//        double d1 = 10.6;
//        System.out.println(f1);
//        System.out.println(d1);


//        double  f1 = 4; //4.0
//        System.out.println(f1- 2.5);

        // CHAR  [ UNICODE CODING SCHEME]

//        char c1 = 'A'; //'A'
//        char c2 =65; ; //'A'
//        char c3 = '\u0041'; // 'A'
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

//        int code1 = 'N';
//        int code2 = '\u0041';
//        System.out.println(code1);
//        System.out.println(code2);

// BOOLEAN DATA TYPE :- Size is not defined it depends on JVM

//boolean b1 = true;
//boolean b2 = false;
//boolean b3 = 2 < 3 ; // less than Operator
//boolean b4 = 2>3; // greater than Operator
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);

// boolean isAlive = false;
// if (isAlive)
//        System.out.println("alive");
// else
//     System.out.println("not alive");


        // STRING IS A CLASS:- Contain Some Static Methods


        // String Objects:- Variables of type String, also have some methods

        // text.toUpperCase() -> Create a new string "This IS SOME TEXT" 2] This Method will return the new string. 3] The new  String can be stored inside a variabl.4] The new String is just like any other String.

        //          CALLING SOME METHODS

//String text = "This is some text";
//String upperCaseText = text.toUpperCase();
//        System.out.println(upperCaseText);

        //NOTE :-A new String is created and the original String is not modified
//        System.out.println(upperCaseText); -> THIS IS SOME TEXT
//        System.out.println(text); -> This is some text

        // CALLING STRINGS METHOD IN JAVA

//        String s1 = "NeSo AcADemy";
        // toUpperCase(), toLowerCase()
//        System.out.println(s1.toUpperCase());
//
//        String s2 =s1.toLowerCase();
//        System.out.println(s2);
//        int i = s1.length();
//        System.out.println(i);

        // is EMPTYY() or blank() but when space given then its output is true
//        String s1 = "";
//        System.out.println(s1.isEmpty());

//     charAt()
//        String s1 = "abcd";
//      char c =  s1.charAt(2);
//        System.out.println(c);

        // indexOf(), lastIndexOf ()
//        String s1 = "abcda";
//
//       System.out.println(s1.indexOf('d'));
//        System.out.println(s1.lastIndexOf( ch: 'a'));
        // concat() :- Adding Strings to each Other
//        String s1 = "Neso";
//        String s2 = s1.concat(" Academy");
//        System.out.println(s2);

//        CONCATENATION :- Add String To Each Other

//        String part1 = "Neso";
//        String part2 = "Academy";
//
//        System.out.println(part1+part2);
//        System.out.println(part1 + " "+ part2);

//        String part1 = "Neso";
//        String part2 = "Academy";
//        String full = part1 +" " +part2;
//
//        System.out.println(full);


//        System.out.println("My favourite number is "+5);
//        System.out.println("My favourite number is "+"5");

//        System.out.println("My favourite number is "+5 + 3);
//        // it concatenates 5
//        System.out.println("My favourite number is 5" + 3);
//        //it concatenates 3
//        System.out.println("My favourite number is 53");

//        System.out.println("neso" + "academy" + (5+3));

//        System.out.println("neso".concat("academy").concat("5"));

//        System.out.println("neso".concat("academy").isEmpty());

        // PRIMITIVE TYPES:- Types that hold simple value. For Ex.= byte, short, int, long, float, double,  and char. ie variables contain the value.

//        int i = 15;
//        char c = 'a';

        // REFERENCE TYPES:- types that hold complex values (objects). Ie Strings is a refernce types
        // The Variables contains the address of the value. & The variables references the value.

        // PRIMITIVE TYPES VS REFERENCE TYPE

//        int i1 = 5; these are primitive types
//        int i2 = 5; and each variable has a box and each variables has a value ie i1 =5 is different than i2= 5
//
//        String s1 = "hello"; but in these
//        String s2 = "hello"; they have same value

        // INSTANTIATING AN OBJECT :- Creating an object of a class

//        ClassName objectName =new ClassName(Parameters);// this classname(parameters) is a special method called constructor

//        Point point = new Point(1, 2);
//
//        Cat tom = new Cat ("Tom");

        // INSTANTIATING A STRING OBJECT :- Creating a variable of type String

//        String name1 = "Neso Academy";
//
//        System.out.println(name1);

//        String name1 = "Neso Academy";
//        String name2 = new String("Neso Academy");
//
//        System.out.println(name1);
//        System.out.println(name2);


        // IMMUTABLE OBJECTS:- 1) Objects whose contents can not be changed
        // 2) An immutable object is an object whose content can not be changed
        // 3) They are created from immutable classes
        // 4)The string class in java is immutable & The content of String objects in java can not be changed

//        String str = "Old Value";
//        str = "New Value";

        // USE NEW WITH STRINGS 1] Strings are immutable -> no need to use new
        // 2] we would want to use new because it allows us to create a seperate object that references a seperate value
        // 3] when working with strings this is not needed because the original string will not be modified because strings are immutable.

//        String str1 = "Value1";
//        String str2 = str1;
//
//
// str 1 and str 2 -> "Value1"

//        String str1 = "Value1";
//        String str2 = str1;
//        str2 = "Value2";
//
//        str1 -> "Value1"
//        str2 -> "value2"
//Note -> Always use = with strings

        //SCANNER CLASS
        // 1] Suppose we want the user to enter name using keyboard. then use SCANNER Class.


        // INPUT METHODS - Methods used to read specific types of data from the keyboard.e.g

//        input.next() // Read a String
//        input.nextInt(); // Read a integer
//        input.nextDouble(); // Read  double
//
//        .nextByte(), .nextShort(), .nextFloat(), .nextBoolean()

        // when one of these methods is called, the program will pause execution and wait for the user to enter a value, the entered value will be returned by these methods .
// Note: we don't have.nextChar()


        // READING INPUT FROM THE KEYBOARD
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.next());

//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your name:");
//        System.out.println("Your name is: " +input.next());

//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your name:");
//        System.out.println("Your name is: " +input.next());
//

//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your name:");
//        System.out.println("Your name is: " +input.next()); // This method reads sentences even with the spaces.

        // READING INPUT FROM THE KEYBOARD
//
//       Scanner input = new Scanner(System.in);
//       input.nextInt();
//        System.out.println(input.nextInt());

//        Scanner input = new Scanner(System.in);
//        float f = input.nextFloat();
//        System.out.println(f);

//        Scanner input = new Scanner(System.in);
//
//        System.out.println(input.nextBoolean());

//
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.next());

        // EXERCISE :- Read the user's favourite number(double,int,..) and then display it in a message of your choice
        // Ex- Enter your favourite integer: 5
        //     5 is my favourite integer too  !

        // Algorithm to solve :-
        // Steps 1] Display a proper message for the user
        //       2]Read the number from the user
        //       3] Display the number in a proper message


        // Solution 1

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your favourite integer:  "); // println is not because we want user to enter the no. on same line that strings printed to get output beautiful
//       int favouriteNumber = input.nextInt();
//
//        System.out.println(favouriteNumber + "is my favourite integer too");


        // Solution 2
//        System.out.print("Enter your favourite integer: ");
//
//        Scanner input = new Scanner (System.in);
//        int favoriteNumber = input.nextInt();
//
//        System.out.println(favouriteNumber + "is my favourite integer too!");

        // Solution 3

//        System.out.print("Enter your favourite integer: ");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt() + "is my favourite integer too!");

        // EXERCISE
        // Read the user's name and age and display them in a proper message.

//        Enter your name and age: Aashish 22
//        Aashish! You are 22.0 years Old!
//        Process finished with exit code 0

        // Algorithm-

        // Solution 1
//
//        System.out.print("Enter your name and age: ");
//
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        double age = input.nextDouble();
//
//        System.out.println(name + "! You are" + age + "years old!");


        // Solution 2

//        System.out.print("Enter your name and age: ");
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(input.nextLine() + "! You are" + input.nextDouble() + "years old!");

//        Scanner s = new Scanner(System.in);
//
//        System.out.println("enter your name and age");
//        System.out.println(s.nextLine() + "! you are" + s.nextDouble() + "years old!");


// LITERALS IN JAVA:- Constant values that appear directly in a program
        // String Literals:

//        String s = "hello";
//        System.out.println("This is some text");
//
//        // Character Literals
//        char c= 'a';
//        System.out.println('b');
//
//        // Integer Literals
//        int i = 123;
//        System.out.println(156);

        // Floating Point Literals

//        System.out.println(15.6);
//        System.out.println(9.6F);

        // Boolean Literals;
//
//        boolean b1= true;
//        boolean b2 = false;

//                                  RELATIONAL OPERATOR :-Compare two value and return boolean result [engg. digest]

//        int a =1;
//        int b =2;
//        boolean c = a<b;   // a<=b , a! = b
//        System.out.println(c);

//        char a = 'z';
//        char b = 'a' ;
//        boolean c= a<b;
//        System.out.println(c);


//        char a = 'z';
//        char b = 'a' ;
//
//        System.out.println('z + 0');
//        System.out.println('a' + 0);
//
//        boolean c= a<b;
//        System.out.println(c);

//        String str1 = "Pool";
//        String str2 = "Pool";
//        String str3 = new String("Pool");
//
//        System.out.println(str3 == str2);


        //                                   LOGICAL OPERATORS :-Add/ combine/ Match 2 condition/ values


        // 1]  && logical AND (Agar dono codition true hogi tbhi final result true hoga)
        // 2] ||  logical OR  (Agr dono m se kisi ek m v true hoti h toh final v true hoga)
        // 3]    ! logical NOT ( Ulta ho jata h)
        // Exam - 100 -> 33  Age -> 18

//        int AashishMarks = 35;
//        int AashishAge = 50;
//
//        System.out.println(AashishMarks>= 33 && AashishAge <= 18); //Isme dono condition fulfill hone chhahiye wrna answer false aaega

//        String name = " Aashish";
//        int exp = 2;
//        boolean tier1 =true;
//
//        boolean cond1 = exp >= 5;
//
//       System.out.println(tier1 || cond1);
//
//        System.out.println(tier1 && cond1);

//        System.out.println(!(2<3));




//
//boolean a= true;
//boolean b =false;
//        System.out.println(a && b); // False

//        System.out.println(a || b); // True  [ || (OR) iska mtlb ya to ek condition true ya phr dusra condition true hai

// boolean a =  2< 1;
// boolean b = 1<=3;
//        System.out.println(a || b); // TRUE


//                                                   CONDITIONAL STATEMENTS

//        int age = 20;
//
//        if(age >=18) {  // if k andr boolean exp likhi hui h
//            System.out.println("You are an adult");
//        }else {
//            System.out.println("You are minor");
//
//        }


//        int age = 50;
//        int marks = 35;
//        // Acc. to exam marks should be 33/100 and age is 20
//        if(age <= 20 && marks>=33) {
//            System.out.println("congrats");
//
//        }else{
//            System.out.println("Better Luck Next Time");
//        }

//        if(true) {
//            System.out.println("Hello World");
//        }


//        int marks =100;
        // marks >=90 A
        //marks >= 75 B
        // marks >= 60 C
        // D

//        if(marks>=90) {
//            System.out.println("Grade A");
//        }else if(marks>=75){
//            System.out.println("Grade B");
//        }else if(marks>=60) {
//            System.out.println("Grade C");
//        }else{
//            System.out.println("Grade D");
//        }

//        int day =3 ;
//        if(day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if(day == 3) {
//            System.out.println("Wednesday");
//        } else if (day==4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid Day");
//        }

        // MEthod 2
//        int day =3 ;
//        switch (day) {
//            case 1:{
//                System.out.println("Monday");
//                break;
//            }
//            case 2: {
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thursday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("Saturday");
//                break;
//            }
//            case  7: {
//                System.out.println("Sunday");
//            }
//            default:{
//                System.out.println("invalid");
//            }
        // }


// EXAMPLE 2

//        String fruit="Mango";
//
//        switch(fruit){
//            case"Apple":
//                System.out.println("Its an apple");
//                break;
//
//            case"Banana":
//                System.out.println("Its an banana");
//                break;
//
//            case"Cherry":
//                System.out.println("Its a Cherry");
//                break;
//
//            case"Mango":
//                System.out.println("Its a Mango");
//                break;
//
//            default:
//                System.out.println("Unknown Fruit");
//                break;
//
//
//        }


//        int number = 1;
//
//        switch (number) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Number is 1, 2, or 3");
//                break;
//            case 4:
//                System.out.println("Number is 4");
//                break;
//            default:
//                System.out.println("Number is not 1, 2, 3, or 4");
//        }

        // WE CAN USE SWITCH WITH THESE FOLLOWING DATA TYPES
        // BYTE
        // short
        //char
        //int
        //string
        //Enum types


        //  [ For / While / Do- While Loop  [ ENGINEERING DIGEST]

        // WHILE LOOP
        //initialization
        //while(condition)
        //Code and Updation

//        int i = 1;
//        while(i<10) {  // Agar condition true h to aage badhega
//            System.out.println("Hello World");
//            i++;
//
//        }

        // DO WHILE LOOP

//        do {
//        }while (condition);
//        }

//        int i =1;
//
//        do {
//            System.out.println(i);
//            i++;
//        }while (i <= 50);


        // FOR LOOP

        // for(intialisation; condition; update){
        // code
        // }

//        for(int j = 1; j <= 10; j++ ){ // sbse phle initialization phr condition check then code chlega then update hoga phrse condition check hogi phrse code  chlega then update hoga ...
//            System.out.println(j);
//        }


        // QUESTION 1 [ COMMON QUESTION ASKED IN SERVICE BASED COMPANIES]
        /*  1
         *  10
         *  100
         * 1000
         * 10000
         *  100000
         * */

//        for (int i = 1; i<= 100000; i = i*10) {
//            System.out.println(i);
//        }

        // 2nd Method

//        for (int i = 1, j = 1; j <= 6; i = i*10, j++) { // semicolon shows how many parts of loop 2nd part- condition check 3rd part- Updation
//            System.out.println(i);
//        }


//Question 2:- Print Table of 7

//for (int i = 1; i <= 10; i++){
//    System.out.println(i +"x 7 =" +i * 7);
//}

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i*7);
//        }

        // Ques 2 :-Sum of first 10Natural numbers

//        int sum = 0;
//        int i = 1;
//        while (i <= 10) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        // Ques 3- Counts digits of a number
        // 46573834

//        int n = 46573834;
//        int res = 0;
//        while(n > 0) {
//            n = n / 10;
//            res++;
//        }
//        System.out.println(res);


        // FACTORIAL OF A NUMBER
        // 6!= 6.5.4.3.2.1

//        int n=6;
//        int res = 1;
//        while(n>0) {
//            res = res * n;
//            n-- ;
//
//        }
//        System.out.println(res);

//        int i = 0;
//        int j=23;
//        if(i<10 && j<50) {
//            if () {
//
//            }
//        }



//for (int i =0 ; i < 10; i++) {
//    for (int j = 0; j < 10; j++) {
//        System.out.println("Hello World");
//    }
//}


//        for (int i =0 ; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("Hello World");
//            }
//        }

        // Agar Count nhi krna h ki kitne brr print hua h to res lelo


//        int res = 0;
//        for (int i =0 ; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                res++;
//
//            }
//        }
//
//        System.out.println(res);

        //                                          Question [ NESTED LOOP]
        // *
        // **
        // ***
        // ****
        // *****
        // ******

        // Solution:-

//        for (int i = 0; i < 6; i++) {  // 1st loop 0 se 6 tk chl rha
//            for (int j = 0; j <= i; j ++) { //
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//                                                      BREAK AND CONTINUE


//int i= 0;
//while (i < 1000) {
//    System.out.println(i);
//    if(i == 500) {
//        break;
//
//    }
//    i++;
//
//}
//        System.out.println("Hellow!");


        // 5 BREAK Ho JYEGA

//        int i= 1;
//        while (i <= 10) {
//
//            if(i != 5) {
//
//                System.out.println(i);
//            }
//
//      i++;
//
//        }


//int i = 1;
//while (i <= 10) {
//    if (i == 5) {
//        continue;
//    }
//    System.out.println(i);
//    i++;
//}

//
//        int i = 1;
//        while (i <= 10) {
//            if (i == 5) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }

        // SAME for[for Loop]

//        for (int i = 0; i < 10; i ++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //        int n = 46573834;
//        n = n/10;
//        System.out.println(n);
















































































    }



}
