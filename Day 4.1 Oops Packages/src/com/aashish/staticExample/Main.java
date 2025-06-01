package com.aashish.staticExample;

public class Main {
    public static void main(String[] args) {
    // we cant import human because it is in the same com.aashish.packages [folder]

//        Human aashish = new Human(22, "aashish verma", 100000, false);
//        Human rahul = new Human(34,"rahul", 150000, true);
//        Human arpit = new Human(34, "arpit", 1400000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

    }

    // this is not dependent on objects because it is static
    // this doesnt belongs to any instant
    static void  fun () {
 // greetings();  //you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instances in a static context

        //Hence here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // this is dependent on objects
    // we know that something which is not static , belongs to an object
    void greeting () {
        fun();
       System.out.println("Hello world");

    }
}


 // static variables are not depend on objects

// STATIC :_ static means you can use main function, main things without creating object of the class.



//  Why main() is static ?
// Java programs start running from the main() method.

//The Java Virtual Machine (JVM) calls main() without creating an object of your class.

//To do that, the method must be static — because static methods belong to the class, not an object.


//void is the return type, not a modifier like static.
//It means “this method doesn’t return anything.”
//static means “this method belongs to the class itself".