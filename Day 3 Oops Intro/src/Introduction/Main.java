package Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Store % roll nos.
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // Data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Create an array to store 5 Student objects
        Student[] students = new Student[5];
        // JUST DECLARING
        // Student aashish;
        // System.out.println(Arrays.toString(students));
        // when student is not initialized, by default the value is [null]

        // Creating Student object using parameterized constructor
        Student aashish = new Student(2, "Aashish Verma", 82.4f);

        // Creating Student object using default constructor
        Student rahul = new Student();

        // aashish.rno = 01;
        // aashish.name = "Aashish Verma";
        // aashish.marks = 82.4f;

        // aashish.changeName(newName: "Shoe lover"); // Not valid syntax in Java
        // aashish.greeting();

        // Print values to verify
        System.out.println(aashish.rno);         // Output: 2
        System.out.println(aashish.name);        // Output: Aashish Verma
        System.out.println(aashish.marks);       // Output: 82.4

        Student random = new Student(aashish);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

        // Change name using method and call greeting
//        aashish.changeName("Shoe lover");
//        aashish.greeting();

        // Print the students array (all null at this point)
        System.out.println(Arrays.toString(students));
    }
}

// Create a Class
// For every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object

    void greeting() {
        // System.out.println("Hello! My name is" + name);
        System.out.println("Hello! My name is " + this.name); // Hello! My name is Aashish Verma
    }

    void changeName(String name) {
        this.name = name;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }


    // Constructor
    Student() {
 // this is how you call a constructor from another constructor using[this]keyword
        //internally: newStudent (13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }

    // Constructor with parameters

    //  Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced by arpits
   // Correct way of initializing objects
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}


// Note: All Class Objects in Java are allocated dynamically.
// A constructor basically defines what happens when your object is being created.
// Constructor is a special function that runs when you create an object and it allocates some variables.
// In java primitive are not objects hence they are stored in the stack memory only ! and objects are stored in heap memory